package com.josephzanini.homework1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.view.View.IMPORTANT_FOR_ACCESSIBILITY_NO;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exit = (Button) findViewById(R.id.exitButton);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }


    public void openBjjActivity(View view) {
        Intent intent = new Intent(this, bjjActivity.class);
        startActivityForResult(intent, 1);
    }

    public void openSportsActivity(View view) {
        Intent intent = new Intent(this, sportsActivity.class);
        startActivityForResult(intent, 2);
    }

    public void openTravelActivity(View view) {
        Intent intent = new Intent(this, travelActivity.class);
        startActivityForResult(intent, 3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Button bjj = (Button) findViewById(R.id.bJJButton);
        Button sports = (Button) findViewById(R.id.sportsButton);
        Button travel = (Button) findViewById(R.id.travelButton);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                bjj.setVisibility(View.INVISIBLE);
            }
        }

        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                sports.setVisibility(View.INVISIBLE);
            }
        }

        if (requestCode == 3) {
            if (resultCode == RESULT_OK) {
                travel.setVisibility(View.INVISIBLE);
            }
        }
    }
}
