package com.example.eightclassfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class KidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid);

        //  설정버튼
        ImageView btn_setting = findViewById(R.id.btn_setting);
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(KidActivity.this,SettingActivity.class);
                startActivity(intent1);
            }
        });

        //  계정변경
        ImageView btn_user = findViewById(R.id.btn_user);
        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(KidActivity.this, "계정을 변경합니다", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(KidActivity.this,SelectActivity.class);
                startActivity(intent2);
            }
        });

        //  그림판
        ImageView btn_canvas = findViewById(R.id.btn_canvas);
        btn_canvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent7 = new Intent(KidActivity.this,DrawActivity.class);
                startActivity(intent7);
            }
        });

        //  투두리스트
        ImageView btn_todo = findViewById(R.id.btn_todo);
        btn_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(KidActivity.this,MainActivity.class);
                startActivity(intent3);
            }
        });

        //  국어
        ImageView btn_kor = findViewById(R.id.btn_kor);
        btn_kor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(KidActivity.this,KorActivity.class);
                startActivity(intent4);
            }
        });

        //  수학
        ImageView btn_math = findViewById(R.id.btn_math);
        btn_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(KidActivity.this,MathActivity.class);
                startActivity(intent5);
            }
        });

        //  영어
        ImageView btn_eng = findViewById(R.id.btn_eng);
        btn_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(KidActivity.this,EngActivity.class);
                startActivity(intent5);
            }
        });

        //  미술
        ImageView btn_art = findViewById(R.id.btn_art);
        btn_art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(KidActivity.this,ArtActivity.class);
                startActivity(intent6);
            }
        });





    }

}