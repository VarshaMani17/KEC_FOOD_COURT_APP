package com.example.kecfoodcourt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText email;
    EditText password;

    DBHelper DB;

    String value="Welcome to home page! ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        DB =new DBHelper(this);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                String emailInput = email.getText().toString();
                String passInput = password.getText().toString();
                Boolean check = DB.checkUsernamePassword(emailInput,passInput);
                if(check)
                {
                    Toast.makeText(MainActivity.this, "Loggined successfully", Toast.LENGTH_SHORT).show();
                    intent.putExtra("string",value);
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this, "Enter Valid Details", Toast.LENGTH_SHORT).show();

            }
        });

        //signup page
        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent1);
            }
        });

    }

}