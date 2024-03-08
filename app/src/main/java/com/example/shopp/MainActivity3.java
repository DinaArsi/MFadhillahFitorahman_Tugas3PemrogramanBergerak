package com.example.shopp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button Btnrucas01 = findViewById(R.id.Btnrucas01);
        Button Btnrucas02 = findViewById(R.id.Btnrucas02);
        Button Btnrucas03 = findViewById(R.id.Btnrucas03);
        Button Btnrucas04 = findViewById(R.id.Btnrucas04);
        Button Btnrucas05 = findViewById(R.id.Btnrucas05);

        Btnrucas01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Rucas01 = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(Rucas01);
            }
        });
    }
}