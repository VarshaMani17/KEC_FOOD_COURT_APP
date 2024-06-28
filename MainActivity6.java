package com.example.kecfoodcourt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    Button buttoninc,buttondec,buttoninc1,buttondec1;
    TextView Display;
    TextView Display1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        buttoninc = findViewById(R.id.btn_inc1);
        buttoninc1=findViewById(R.id.btn_inc2);
        buttondec=findViewById(R.id.btn_dec1);
        buttondec1=findViewById(R.id.btn_dec2);
        Display=findViewById(R.id.pbm2);
        Display1=findViewById(R.id.pbm3);

        //back button
        Button button10= findViewById(R.id.btn11);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12=new Intent(MainActivity6.this, MainActivity4.class);
                startActivity(intent12);
                finish();
            }
        });

        //place order
        Button button11= findViewById(R.id.btn12);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13=new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(intent13);
                finish();
            }
        });

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
    }
}