package com.josephzanini.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bjjActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bjj);

        Button ok = (Button) findViewById(R.id.bjjOk);
        Button delete = (Button) findViewById(R.id.bjjDelete);

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
