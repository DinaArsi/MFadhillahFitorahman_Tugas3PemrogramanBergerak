package com.example.shopp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button CT701 = findViewById(R.id.CT701);
        Button CT702 = findViewById(R.id.CT702);
        Button CT703 = findViewById(R.id.CT703);
        Button CT704 = findViewById(R.id.CT704);
        Button CT705 = findViewById(R.id.CT705);

        CT701.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent converse1 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(converse1);
            }
        });
        CT702.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent converse2 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(converse2);
            }
        });
        CT703.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent converse3 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(converse3);
            }
        });
        CT704.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent converse4 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(converse4);
            }
        });
        CT705.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent converse5 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(converse5);
            }
        });
    }
}