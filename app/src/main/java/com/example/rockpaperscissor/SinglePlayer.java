package com.example.rockpaperscissor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SinglePlayer extends AppCompatActivity {

    TextView tvSingle_ScoreYou;
    TextView tvSingle_ScorePhone;
    ImageView ivSingle_Phone;
    ImageView ivSingle_You;
    ImageView ivSingle_Rock;
    ImageView ivSingle_Scissors;
    ImageView ivSingle_Paper;
    Button btnSingle_Menu;
    Button btnSingle_Result;
    int you = 0;
    int phone = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        tvSingle_ScoreYou = findViewById(R.id.tvSingle_ScoreYou);
        tvSingle_ScorePhone = findViewById(R.id.tvSingle_ScorePhone);
        ivSingle_Phone = findViewById(R.id.ivSingle_Phone);
        ivSingle_You = findViewById(R.id.ivSingle_You);
        ivSingle_Rock = findViewById(R.id.ivSingle_Rock);
        ivSingle_Paper = findViewById(R.id.ivSingle_Paper);
        ivSingle_Scissors = findViewById(R.id.ivSingle_Scissors);
        btnSingle_Menu = findViewById(R.id.btnSingle_Menu);
        btnSingle_Result = findViewById(R.id.btnSingle_Result);

        ivSingle_Phone.setVisibility(View.INVISIBLE);
        ivSingle_You.setVisibility(View.INVISIBLE);


        ivSingle_Rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSingle_You.setVisibility(View.VISIBLE);
                ivSingle_Phone.setVisibility(View.VISIBLE);

                ivSingle_You.setImageResource(R.drawable.rock);

                int rand = (int) (Math.random() * 10) % 3;

                if(rand == 0) {
                    ivSingle_Phone.setImageResource(R.drawable.paper);
                    phone++;
                }
                else if(rand == 1) {
                    ivSingle_Phone.setImageResource(R.drawable.rock);
                }
                else {
                    ivSingle_Phone.setImageResource(R.drawable.scissors);
                    you++;
                }

                tvSingle_ScorePhone.setText("Phone: " + phone);
                tvSingle_ScoreYou.setText("You: " + you);

            }
        });

        ivSingle_Paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSingle_You.setVisibility(View.VISIBLE);
                ivSingle_Phone.setVisibility(View.VISIBLE);

                ivSingle_You.setImageResource(R.drawable.paper);

                int rand = (int) (Math.random() * 10) %3;

                if(rand == 0) {
                    ivSingle_Phone.setImageResource(R.drawable.paper);
                }
                else if(rand == 1) {
                    ivSingle_Phone.setImageResource(R.drawable.rock);
                    you++;
                }
                else {
                    ivSingle_Phone.setImageResource(R.drawable.scissors);
                    phone++;
                }

                tvSingle_ScorePhone.setText("Phone: " + phone);
                tvSingle_ScoreYou.setText("You: " + you);
            }
        });

        ivSingle_Scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSingle_You.setVisibility(View.VISIBLE);
                ivSingle_Phone.setVisibility(View.VISIBLE);

                ivSingle_You.setImageResource(R.drawable.scissors);

                int rand = (int) (Math.random() * 10) %3;

                if(rand == 0) {
                    ivSingle_Phone.setImageResource(R.drawable.paper);
                    you++;
                }
                else if(rand == 1) {
                    ivSingle_Phone.setImageResource(R.drawable.rock);
                    phone++;
                }
                else {
                    ivSingle_Phone.setImageResource(R.drawable.scissors);
                }

                tvSingle_ScorePhone.setText("Phone: " + phone);
                tvSingle_ScoreYou.setText("You: " + you);
            }
        });

        btnSingle_Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SinglePlayer.this.finish();
            }
        });
    }
}
