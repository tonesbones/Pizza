package com.example.android.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView cheese = (TextView) findViewById(R.id.cheese);

        // Set a click listener on that View
        cheese.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CheeseActivity}
                Intent cheeseIntent = new Intent(MainActivity.this, CheeseActivity.class);

                // Start the new activity
                startActivity(cheeseIntent);
            }
        });

        // Find the View that shows the bacon category
        TextView bacon = (TextView) findViewById(R.id.bacon);

        // Set a click listener on that View
        bacon.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BaconActivity}
                Intent baconIntent = new Intent(MainActivity.this, BaconActivity.class);

                // Start the new activity
                startActivity(baconIntent);
            }
        });

        // Find the View that shows the pineapple category
        TextView pineapple = (TextView) findViewById(R.id.pineapple);

        // Set a click listener on that View
        pineapple.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PineappleActivity}
                Intent pineappleIntent = new Intent(MainActivity.this, PineappleActivity.class);

                // Start the new activity
                startActivity(pineappleIntent);
            }
        });

        // Find the View that shows the veggie category
        TextView veggie = (TextView) findViewById(R.id.veggie);

        // Set a click listener on that View
        veggie.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link VeggieActivity}
                Intent veggieIntent = new Intent(MainActivity.this, VeggieActivity.class);

                // Start the new activity
                startActivity(veggieIntent);
            }
        });
    }
}
