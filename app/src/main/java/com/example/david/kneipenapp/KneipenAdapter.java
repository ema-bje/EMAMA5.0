package com.example.david.kneipenapp;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class KneipenAdapter extends RecyclerView.Adapter<KneipenAdapter.ListItemViewHolder> {

    private final ArrayList<Lokal> list;
    private static Context sContext;

    public static class ListItemViewHolder extends RecyclerView.ViewHolder {

        public TextView headlineView;
        protected TextView addressView;
        protected TextView typ;
        protected TextView stars;
        protected ImageView image;
        protected int src;

        public ListItemViewHolder(View itemView) {
            super(itemView);

            headlineView = (TextView) itemView.findViewById(R.id.barName);
            addressView = (TextView) itemView.findViewById(R.id.address);
            typ = (TextView) itemView.findViewById(R.id.type);
            stars = (TextView) itemView.findViewById(R.id.rating);
            image = (ImageView) itemView.findViewById(R.id.imageView);
            src = R.id.imageView;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),headlineView.getText(),Toast.LENGTH_LONG).show();
                    final Intent intent = new Intent(sContext, DetailActivity.class);
                    intent.putExtra("headline", headlineView.getText());
                    intent.putExtra("address", addressView.getText());
                    intent.putExtra("typ", typ.getText());
                    intent.putExtra("stars", stars.getText());
                    intent.putExtra("src", src);

                    sContext.startActivity(intent);
                }
            });
        }
    }

    public KneipenAdapter(ArrayList<Lokal> list) {
        this.list = list;
    }

    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view_layout, viewGroup, false);
        sContext = viewGroup.getContext();
        return new ListItemViewHolder(itemView);
    }

    public void onBindViewHolder(ListItemViewHolder viewHolder, int i) {
        Lokal lokal = list.get(i);
        viewHolder.headlineView.setText(lokal.getName());
        viewHolder.addressView.setText(lokal.getAddress());
        viewHolder.typ.setText(lokal.getTyp());
        viewHolder.stars.setText(String.valueOf(lokal.getStars()));
        viewHolder.image.setImageResource(lokal.getImageResource());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
