package com.example.intent_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView msg;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        msg = findViewById(R.id.out);
        Intent intent = getIntent();

        String name = intent.getStringExtra("First Name");
        String card = intent.getStringExtra("Last Name");
        int age = intent.getIntExtra("Age",0);

        if(age >= 18) {
            result = "Eligible to vote";
        }
        else {
            result = "Not Eligible to vote";
        }
        msg.setText("Name is: "+name+"\nAadhar No. is: "+card+"\nAge is: "+age+"\n "+result);
    }
}