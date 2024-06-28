package com.example.kecfoodcourt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        //back button
        Button button=findViewById(R.id.btnn13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12=new Intent(MainActivity7.this, MainActivity4.class);
                startActivity(intent12);
                finish();
            }
        });


        //Make payment
        Button button11= findViewById(R.id.btnn14);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13=new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(intent13);
                finish();
            }
        });
    }
}