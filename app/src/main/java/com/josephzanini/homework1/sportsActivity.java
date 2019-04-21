package com.josephzanini.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        Button ok = (Button) findViewById(R.id.sportsOkButton);
        Button delete = (Button) findViewById(R.id.sportsDeleteButton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent resultIntent = new Intent();
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });
    }
}
