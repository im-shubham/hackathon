package com.example.medicaltourismhackathon;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public TextView createnewAccount;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createnewAccount=findViewById(R.id.CreatenewAccount);
        button=(Button) findViewById(R.id.btnLogin);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        createnewAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

//                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
//            RegisterActivity

        });
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }

        });
    }
}
