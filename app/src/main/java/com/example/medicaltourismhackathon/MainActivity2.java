package com.example.medicaltourismhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    ImageView flags;
    Spinner spinner;
    Button stat;
    TextView textView5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner=findViewById(R.id.spinner);
        stat=findViewById(R.id.stat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Context context;

        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,
                CityData.cityNames));
        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(MainActivity2.this, Statstics.class);
                startActivity(i);

            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(MainActivity2.this, Doctor.class);
                startActivity(i);

            }
        });

    }



}