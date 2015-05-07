package com.example.david.kneipenapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nebi on 07.05.15.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String headline = (String) getIntent().getExtras().get("headline");
        String address = (String) getIntent().getExtras().get("address");
        String typ = (String) getIntent().getExtras().get("typ");
        String stars = (String) getIntent().getExtras().get("stars");
        int src = (int) getIntent().getExtras().get("src");

        TextView headlineView = (TextView) findViewById(R.id.name);
        TextView addressView = (TextView) findViewById(R.id.adresse);
        TextView typeView = (TextView) findViewById(R.id.typ);
        TextView starsView = (TextView) findViewById(R.id.sterne);
        ImageView imageView = (ImageView) findViewById(R.id.image_kneipe);

        headlineView.setText(headline);
        addressView.setText(address);
        typeView.setText(typ);
        starsView.setText(stars);
        imageView.setImageResource(src);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
