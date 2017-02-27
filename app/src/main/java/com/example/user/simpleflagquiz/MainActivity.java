package com.example.user.simpleflagquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnA = (Button) findViewById(R.id.buttonA);
        Button btnB = (Button) findViewById(R.id.buttonB);
        Button btnC = (Button) findViewById(R.id.buttonC);
        Button btnD = (Button) findViewById(R.id.buttonD);

        final TextView result = (TextView) findViewById(R.id.textViewResult);

        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
             result.setText("Incorrect!");
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
                result.setText("Your answer is correct!");
                Intent startQ2Activity = new Intent(v.getContext(), Main2Activity.class);
                startActivity(startQ2Activity);
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
