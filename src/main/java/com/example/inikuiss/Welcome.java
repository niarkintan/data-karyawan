package com.example.inikuiss;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    Button btnExit, btnMakanan, btnMinuman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnMakanan = (Button) findViewById(R.id.btnMakanan);
        btnMinuman = (Button) findViewById(R.id.btnMinuman);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });
        btnMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RecyclerActivity.class);
                startActivity(i);
            }
        });

        btnMinuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RecyclerMinum.class);
                startActivity(i);
            }
        });
//
//        btnCalculator.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(),CalculatorActivity.class);
//                startActivity(i);
//            }
//        });


        btnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }
}