package com.example.muhammadhaikal.pengenalanbuah2;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String[] nameArray = {"Anggur", "Kiwi", "Lemon", "Pisang", "Semangka"};

        String[] infoArray = {
                "Have lots of seeds",
                "Contains antioxidants",
                "In lemon meat there are seeds like oranges in general.",
                "In one bunch there are usually 9 combs consisting of 120 pieces",
                "Watermelon has a lot of water in the meat."
        };

        Integer[] imageArray = {R.drawable.anggur,
                R.drawable.kiwi,
                R.drawable.lemon,
                R.drawable.pisang,
                R.drawable.semangka};

        ListView listView;
        CostumListAdapter whatever = new CostumListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, details.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }
        });
    }
}