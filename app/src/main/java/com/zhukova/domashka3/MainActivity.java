package com.zhukova.domashka3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] numbers = new int[10];
        for (int i = 0; i<10; i++){
            numbers [i] = (int)(Math.random()*10)+1;}

        for (int i = 0; i<10; i++){
        Log.d("dom3", numbers[i] + "");}

        for (int i = 0; i<10; i++){
            if (numbers[i]>5){
                System.out.printf ("Элемент с номером %d равен %d\n", i, numbers[i]);

            }
        }

    }
}