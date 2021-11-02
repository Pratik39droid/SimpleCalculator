package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText n1, n2;
        TextView ans;
        Button add, sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.Number1);
        n2 = findViewById(R.id.Number2);

        add = findViewById(R.id.button1);
        sub= findViewById(R.id.button2);
        mul= findViewById(R.id.button3);
        div= findViewById(R.id.button4);

        ans= findViewById(R.id.textview);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstval, secondval, answer;

                firstval = Integer.parseInt(n1.getText().toString());
                secondval = Integer.parseInt(n2.getText().toString());

                answer = firstval + secondval;
                ans.setText(" "+answer);
            }
        });
         sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstval, secondval, answer;

                firstval = Integer.parseInt(n1.getText().toString());
                secondval = Integer.parseInt(n2.getText().toString());

                answer = firstval - secondval;
                ans.setText(" "+answer);
            }
        });
         mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  firstval, secondval, answer;

                 firstval = Integer.parseInt(n1.getText().toString());
                secondval = Integer.parseInt(n2.getText().toString());

                answer =  firstval * secondval;
                ans.setText(" "+answer);
            }
        });
         div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstval, secondval, answer;

                firstval = Integer.parseInt(n1.getText().toString());
                secondval = Integer.parseInt(n2.getText().toString());

                answer = firstval / secondval;
                ans.setText(" "+answer);
            }
        });


    }
}