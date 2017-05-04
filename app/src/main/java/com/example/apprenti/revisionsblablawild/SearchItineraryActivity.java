package com.example.apprenti.revisionsblablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class SearchItineraryActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextDeparture;
    EditText editTextDestination;
    EditText editTextDate;
    Button buttonRechercher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_itinerary);

        editTextDeparture = (EditText) findViewById(R.id.editTextDeparture);
        editTextDestination = (EditText) findViewById(R.id.editTextDestination);
        editTextDate = (EditText) findViewById(R.id.editTextDate);

        buttonRechercher =(Button)findViewById(R.id.buttonRechercher);
        this.buttonRechercher.setOnClickListener(this);
    }

    public void onClick(View view) {
        String depart = editTextDeparture.getText().toString();
        String destination = editTextDestination.getText().toString();

        if ((editTextDeparture.length() == 0) || (editTextDestination.length() == 0)) {
            Toast.makeText(this, "merci de remplir depart et detination", Toast.LENGTH_LONG).show();
        } else {

            Intent resultat = new Intent(this, ViewSearchItineraryResultListActivity.class);




            resultat.putExtra("Depart", depart);
            resultat.putExtra("Destination", destination);
            startActivity(resultat);

        }


    }
}
