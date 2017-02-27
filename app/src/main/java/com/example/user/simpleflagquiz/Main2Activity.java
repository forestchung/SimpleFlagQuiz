package com.example.user.simpleflagquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnA = (Button) findViewById(R.id.buttonA);
        Button btnB = (Button) findViewById(R.id.buttonB);
        Button btnC = (Button) findViewById(R.id.buttonC);
        Button btnD = (Button) findViewById(R.id.buttonD);

        final TextView result = (TextView) findViewById(R.id.textViewResult);

        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Your answer is correct!");
            }
        });

        btnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
            }
        });

        btnD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
            }
        });




    }
}
