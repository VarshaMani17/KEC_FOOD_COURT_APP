package com.example.kecfoodcourt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText email,password,username,repass;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username = (EditText) findViewById(R.id.username);
        email = (EditText)findViewById(R.id.emailid);
        password = (EditText)findViewById(R.id.password);
        repass = (EditText)findViewById(R.id.repass);
        DB =new DBHelper(this);
        Button button2 = findViewById(R.id.btn2);

        //signin button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String emailid=email.getText().toString();
                String rpass=repass.getText().toString();
                if(user.equals("")||pass.equals("")||emailid.equals("")||rpass.equals(""))
                    Toast.makeText(MainActivity2.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                else
                {
                    if(pass.equals(rpass))
                    {
                        Boolean checkuser=DB.checkUsername(user);
                        if(checkuser==false)
                        {
                            Boolean insert = DB.insertData(user,pass,emailid);
                            if(insert==true)
                            {
                                Toast.makeText(MainActivity2.this, "Registered Successfullly", Toast.LENGTH_SHORT).show();
                                Intent intent2 = new Intent(MainActivity2.this,MainActivity.class);
                                startActivity(intent2);
                            }
                            else{
                                Toast.makeText(MainActivity2.this, "Registration Falied", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(MainActivity2.this, "User already exists!Please Login in", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Password not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        Button button3 = findViewById(R.id.btn3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent i=new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}