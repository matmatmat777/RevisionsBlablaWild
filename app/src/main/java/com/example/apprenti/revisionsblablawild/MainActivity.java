package com.example.apprenti.revisionsblablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMenu = (Button)findViewById(R.id.buttonMenu);
        this.buttonMenu.setOnClickListener(this);
    }
    public void onClick(View v){

        if(buttonMenu == v){

            startActivity(new Intent(this,SearchItineraryActivity.class));
        }
    }
}
