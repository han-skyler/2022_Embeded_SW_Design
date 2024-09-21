package com.example.eightclassfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ArtActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1,card2,card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);

        ImageView btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArtActivity.this,KidActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.card1:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/gnjSr9H7IpM"));
                startActivity(intent);
                break;

            case R.id.card2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/zo2ssk_ymx4"));
                startActivity(intent);
                break;
            case R.id.card3:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/UsEnAwBWuxI\n"));
                startActivity(intent);
                break;


        }

    }

}