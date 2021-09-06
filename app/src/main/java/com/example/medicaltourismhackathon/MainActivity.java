package com.example.medicaltourismhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView createnewAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createnewAccount=findViewById(R.id.CreatenewAccount);


        createnewAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

//                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });
    }
}