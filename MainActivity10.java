package com.example.kecfoodcourt;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity10 extends AppCompatActivity {

    //EditText amount,name,upId;
    Button btn;
    String TAG="main";
    final int UPI_PAYMENT=0;
    Integer amount=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        btn=(Button) findViewById(R.id.btn_pay);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 payUsingUpi();
            }
        });
    }
    private void payUsingUpi() {
        Uri uri =
                new Uri.Builder()
                        .scheme("upi")
                        .authority("pay")
                        .appendQueryParameter("pa", "your-merchant-vpa@xxx")
                        .appendQueryParameter("pn", "your-merchant-name")
                        .appendQueryParameter("mc", "your-merchant-code")
                        .appendQueryParameter("tr", "your-transaction-ref-id")
                        .appendQueryParameter("tn", "your-transaction-note")
                        .appendQueryParameter("am","$5.00")
                        .appendQueryParameter("cu", "INR").build();

        String GOOGLE_PAY_PACKAGE_NAME = "com.android";
        int GOOGLE_PAY_REQUEST_CODE = 123;
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        intent.setPackage(GOOGLE_PAY_PACKAGE_NAME);
        startActivityForResult(intent, GOOGLE_PAY_REQUEST_CODE);
    }
}