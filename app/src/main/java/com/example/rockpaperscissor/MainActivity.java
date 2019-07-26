package com.example.rockpaperscissor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMain_Single;
    Button btnMain_Two;
    Button btnMain_Exit;

    final int SINGLEID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain_Single = findViewById(R.id.btnMain_Single);
        btnMain_Two = findViewById(R.id.btnMain_Two);
        btnMain_Exit = findViewById(R.id.btnMain_Exit);

        btnMain_Single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.rockpaperscissor.SinglePlayer.class);

                //startActivityForResult(intent, SINGLEID);
                startActivity(intent);

            }
        });

        btnMain_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnMain_Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });
    }

}
