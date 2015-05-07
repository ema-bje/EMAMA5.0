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

/**
 * This class manages the layout of each list item and sets its content with the ListItemViewHolder
 */
public class KneipenAdapter extends RecyclerView.Adapter<KneipenAdapter.ListItemViewHolder> {

    private final ArrayList<Lokal> list; //this is the bar-list on which this Adapter operates
    private static Context sContext;

    /**
     * The ListItemViewHolder class manages the conetnt of each widget inside a list-item.
     */
    public static class ListItemViewHolder extends RecyclerView.ViewHolder {

        private TextView headlineView; //barName
        private TextView addressView;
        private TextView typ;
        private TextView stars;
        private ImageView image;
        protected int src;

        /**
         * Sets all data from the Lokal-Entity-Class into the Adapter
         * @param itemView the layoutfile on which the adapter operates
         */
        public ListItemViewHolder(View itemView) {
            super(itemView);

            //setting all content from the Lokal-Entity-Class
            headlineView = (TextView) itemView.findViewById(R.id.barName);
            addressView = (TextView) itemView.findViewById(R.id.address);
            typ = (TextView) itemView.findViewById(R.id.type);
            stars = (TextView) itemView.findViewById(R.id.rating);
            image = (ImageView) itemView.findViewById(R.id.imageView);
            src = R.id.imageView;

            //display a toast with the bar name inside when a user clicks on an item
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
    /**
     * This is called at first and will inflate (assign) a layout for each item. Then it instanciates a ListItemViewHolder with the layout
     */
    public ListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view_layout, viewGroup, false);
        sContext = viewGroup.getContext();
        return new ListItemViewHolder(itemView);
    }

    /**
     * this will set all content of the list item
     * @param viewHolder specifies which viewHolder will be used from the onCreateViewHolder method
     * @param i the position of the item whose content will be set
     */
    public void onBindViewHolder(ListItemViewHolder viewHolder, int i) {
        Lokal lokal = list.get(i); //get the lokal from the list
        viewHolder.headlineView.setText(lokal.getName());
        viewHolder.addressView.setText(lokal.getAddress());
        viewHolder.typ.setText(lokal.getTyp());
        viewHolder.stars.setText(String.valueOf(lokal.getStars()));
        viewHolder.image.setImageResource(lokal.getImageResource());
    }

    @Override
    /**
     * How many items are in the RecyclerView. It will only add the number specified in this method to the RecyclerViews
     */
    public int getItemCount() {
        return list.size();
    }
}
