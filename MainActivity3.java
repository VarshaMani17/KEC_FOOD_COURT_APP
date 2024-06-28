package com.example.kecfoodcourt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    ImageView p;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //to get text from page1
        textView=findViewById(R.id.textView9);
        String text =getIntent().getStringExtra("string");
        textView.setText(text);

        //imagclickable form
        p =findViewById(R.id.profile);

        //back
        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent6=new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent6);
                finish();
            }
        });


        //profile
        p.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent4);
            }
        }));



        //veg
        Button button7 = findViewById(R.id.btn4);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent7=new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent7);
            }
        });


        //non_veg
        Button button8 = findViewById(R.id.btn5);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent8=new Intent(MainActivity3.this,MainActivity6.class);
                startActivity(intent8);
            }
        });
    }
}