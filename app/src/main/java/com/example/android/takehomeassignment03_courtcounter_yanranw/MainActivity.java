package com.example.android.takehomeassignment03_courtcounter_yanranw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView teamA;
    TextView teamB;
    int a;
    int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA = (TextView) findViewById(R.id.score);
        teamB = (TextView) findViewById(R.id.score2);

    }


    public void displayA(int n){
        teamA.setText(String.valueOf(n));
    }

    public void displayB(int n){
        teamB.setText(String.valueOf(n));
    }
    public void aThreePoints(View view) {
        a = Integer.parseInt(teamA.getText().toString());
        displayA(a + 3);
    }

    public void bThreePoints(View view) {
        b = Integer.parseInt(teamB.getText().toString());
        displayB(b + 3);
    }

    public void aTwoPoints(View view) {
        a = Integer.parseInt(teamA.getText().toString());
        displayA(a + 2);
    }

    public void bTwoPoints(View view) {
        b = Integer.parseInt(teamB.getText().toString());
        displayB(b + 2);
    }

    public void aOnePoints(View view) {
        a = Integer.parseInt(teamA.getText().toString());
        displayA(a + 1);
    }

    public void bOnePoints(View view) {
        b = Integer.parseInt(teamB.getText().toString());
        displayB(b + 1);
    }

    public void reset(View view) {

        displayB(0);
        displayA(0);
    }
}
