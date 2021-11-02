package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashavtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashavtivity);

        getSupportActionBar().hide();
        Thread th = new Thread(){
            public  void run(){
                try{
                   sleep(1000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
//                    intent to start the activity, service or broadcast
                    Intent intent = new Intent(splashavtivity.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        }; th.start();


    }


}