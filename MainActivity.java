package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mNoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mYesButton = (Button) findViewById(R.id.button_yes);
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Toast.makeText(MainActivity.this, R.string.correct_answer, Toast.LENGTH_LONG).show();
            }
        });

        mNoButton = (Button) findViewById(R.id.button_no);
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Toast.makeText(MainActivity.this, R.string.incorrect_answer, Toast.LENGTH_LONG).show();
            }
        });



    }
}
