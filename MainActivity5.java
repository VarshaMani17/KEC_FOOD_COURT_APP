package com.example.kecfoodcourt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity5 extends AppCompatActivity {

    Button buttoninc,buttondec,buttoninc1,buttondec1;

    ImageView imageView;//pass  image
    TextView Display;
    TextView Display1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imageView=findViewById(R.id.imageView3);// pass image to next page(code bending)

        buttoninc=findViewById(R.id.btn_inc);
        buttoninc1=findViewById(R.id.btn_inc2);
        buttondec=findViewById(R.id.btn_dec);
        buttondec1=findViewById(R.id.btn_dec2);
        Display=findViewById(R.id.pbm);
        Display1=findViewById(R.id.pbm1);

        //increment button
        buttoninc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue=Display.getText().toString();
                int value=Integer.parseInt(currentValue);
                value++;
                Display.setText(String.valueOf(value));
            }
        });

        //decrement button
        buttondec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue=Display.getText().toString();
                int value=Integer.parseInt(currentValue);
                value--;
                Display.setText(String.valueOf(value));
            }
        });



        //increment1 button
        buttoninc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue=Display1.getText().toString();
                int value1=Integer.parseInt(currentValue);
                value1++;
                Display1.setText(String.valueOf(value1));
            }
        });


        //decrement1 button
        buttondec1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String currentValue=Display1.getText().toString();
                int value1=Integer.parseInt(currentValue);
                value1--;
                Display1.setText(String.valueOf(value1));
            }
        });


        //back button
        Button button10= findViewById(R.id.btn11);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10=new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(intent10);
                finish();
            }
        });


        //place order
        Button button11= findViewById(R.id.btn12);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11=new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(intent11);
                finish();
            }
        });
    }
}