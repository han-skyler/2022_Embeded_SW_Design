package com.example.eightclassfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ImageView btn_parents = findViewById(R.id.btn_parents);
        btn_parents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 학부모 홈화면 이동
                Intent intent = new Intent(SelectActivity.this, com.example.eightclassfinal.ParentsActivity.class);
                startActivity(intent);
                Toast.makeText(SelectActivity.this, "학부모 홈으로 이동합니다 :)", Toast.LENGTH_SHORT).show();
            }

        });

        ImageView btn_kid = findViewById(R.id.btn_kid);
        btn_kid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //학생 홈화면 이동
                Intent intent = new Intent(SelectActivity.this,KidActivity.class);
                startActivity(intent);
                Toast.makeText(SelectActivity.this, "학생 홈으로 이동합니다 :)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}