package com.example.shopp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Btnbaju;

            @Override
            protected void onCreate (Bundle savedInstanceState){
                super.onCreate (savedInstanceState);
                setContentView(R.layout.activity_main);

                Button Btnbaju = findViewById(R.id.Btnbaju);
                Button Btncelana = findViewById(R.id.Btncelana);
                Button Btnshoes = findViewById(R.id.Btnshoes);

                Btnbaju.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent baju = new Intent(MainActivity.this,MainActivity3.class);
                        startActivity(baju);
                    }
                });

                Btncelana.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent celana = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(celana);
                    }
                });

                Btnshoes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent celana = new Intent(MainActivity.this,MainActivity4.class);
                        startActivity(celana);
                    }
                });


    }
}
