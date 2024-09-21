package com.example.eightclassfinal;

import android.Manifest;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class DrawActivity extends AppCompatActivity {
    private com.example.eightclassfinal.DrawView drawView;
    private ImageButton currPaint;
    private ImageButton new_btn;
    private ImageButton Brush_btn;
    private ImageButton erase_btn;
    private ImageButton color_btn;

    private Bitmap canvasBitmap;

    Uri selectedImageUri;

    String[] permission_list = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    public void clicked(View view) {
        if (view != currPaint) {
            String color = view.getTag().toString();
            drawView.setColor(color);
            currPaint = (ImageButton) view;
        } else {
            drawView.setColor("#00000000");
            currPaint = (ImageButton) view;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        switch (newConfig.orientation) {
            case Configuration.ORIENTATION_LANDSCAPE:
                Toast.makeText(getApplicationContext(), "가로", Toast.LENGTH_SHORT).show();
            case Configuration.ORIENTATION_PORTRAIT:
                Toast.makeText(getApplicationContext(), "세로", Toast.LENGTH_SHORT).show();
                return;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        drawView = (com.example.eightclassfinal.DrawView) findViewById(R.id.drawing);
        LinearLayout paintLayout = (LinearLayout) findViewById(R.id.paint_Colors);
        paintLayout.setVisibility(View.INVISIBLE);
        currPaint = (ImageButton) paintLayout.getChildAt(0);

        Resources r = Resources.getSystem();
        Configuration config = r.getConfiguration();
        onConfigurationChanged(config);

        new_btn = findViewById(R.id.new_btn);
        Brush_btn = findViewById(R.id.Brush_btn);
        erase_btn = findViewById(R.id.erase_btn);
        color_btn = findViewById(R.id.color_btn);

        ImageButton.OnClickListener onClickListener = new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    //새 파일
                    case R.id.new_btn:
                        drawView.setMenu(0);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;

                    //그리기 모드
                    case R.id.Brush_btn:
                        drawView.setMenu(1);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;

                    //지우개 모드
                    case R.id.erase_btn:
                        drawView.setMenu(2);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;

                    //색상선택 모드
                    case R.id.color_btn:
                        drawView.setMenu(3);
                        paintLayout.setVisibility(View.VISIBLE);
                        break;

                    default:
                        break;
                }
            }

        };

        new_btn.setOnClickListener(onClickListener);
        Brush_btn.setOnClickListener(onClickListener);
        erase_btn.setOnClickListener(onClickListener);
        color_btn.setOnClickListener(onClickListener);
    }
}
