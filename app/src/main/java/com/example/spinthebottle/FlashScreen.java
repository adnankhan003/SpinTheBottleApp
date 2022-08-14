package com.example.spinthebottle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;

public class FlashScreen extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_flash_screen);

        textView = findViewById(R.id.mainText);
        textView.animate().alpha(1).scaleXBy(1).scaleYBy(1).setDuration(1000);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(FlashScreen.this,MainActivity.class);
            startActivity(intent);
            finish();
        },2000);
    }
}