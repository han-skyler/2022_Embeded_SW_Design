package com.example.eightclassfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ParentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents);

        ImageView btn_setting = findViewById(R.id.btn_setting);
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParentsActivity.this,SettingActivity.class);
                startActivity(intent);
            }
        });

        //  계정변경
        ImageView btn_user = findViewById(R.id.btn_user);
        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ParentsActivity.this, "계정을 변경합니다", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(ParentsActivity.this,SelectActivity.class);
                startActivity(intent2);
            }
        });

        //  투두리스트
        ImageView btn_todo = findViewById(R.id.btn_todo);
        btn_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ParentsActivity.this,MainActivity.class);
                startActivity(intent3);
            }
        });

        //  그림판
        ImageView btn_canvas = findViewById(R.id.btn_canvas);
        btn_canvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(ParentsActivity.this,DrawActivity.class);
                startActivity(intent4);
            }
        });

    }

    //  네이버카페
    public void clickcafe(View view) {
        Intent intentUrl1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/eightedu?iframe_url=/MyCafeIntro.nhn%3Fclubid=30573061"));
        startActivity(intentUrl1);
    }

    //  어린이뉴스
    public void clicknews(View view) {
        Intent intentUrl2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.koreacen.com/"));
        startActivity(intentUrl2);
    }

    // 어린이우산
    public void clickchild(View view) {
        Intent intentUrl3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.childfund.or.kr/main.do"));
        startActivity(intentUrl3);
    }
    //  유니세프
    public void clickunicef(View view) {
        Intent intentUrl4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.unicef.or.kr/"));
        startActivity(intentUrl4);
    }


}