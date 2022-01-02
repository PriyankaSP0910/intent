package com.example.intent_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText fn,cd,ag;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.submit);
        fn = findViewById(R.id.Fname);
        cd = findViewById(R.id.card);
        ag = findViewById(R.id.age);

        btn.setOnClickListener(v -> {
            String fnm,crd,agg;

            fnm = (fn.getText().toString());
            crd = (cd.getText().toString());
            agg = (ag.getText().toString());

            Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
            intent.putExtra("First Name",fnm);
            intent.putExtra("Last Name",crd);
            intent.putExtra("Age",Integer.parseInt(agg));
            startActivity(intent);
        });
    }
}