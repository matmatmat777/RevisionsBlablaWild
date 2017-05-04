package com.example.apprenti.revisionsblablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewSearchItineraryResultListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinerary_result_list);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String depart = intent.getStringExtra("Depart");
        String destination = intent.getStringExtra("Destination");


        // Capture the layout's TextView and set the string as its text

        setTitle(depart + getString(R.string.fleche) + destination);

    }
}
