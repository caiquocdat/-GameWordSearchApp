package com.caiquocdat.wordsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.caiquocdat.wordsearch.data.DataGenerator;
import com.caiquocdat.wordsearch.databinding.ActivityHomeBinding;
import com.caiquocdat.wordsearch.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding homeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = homeBinding.getRoot();
        setContentView(view);
        hideSystemUI();
        homeBinding.imgEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        });
    }
    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
    @Override
    protected void onResume() {
        super.onResume();
        hideSystemUI();
    }

    @Override
    protected void onStart() {
        DataGenerator.resetQuestions();
        Toast.makeText(this, ""+DataGenerator.getEasyQuestions().size(), Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    public void onBackPressed() {
        // Không làm gì cả để ngăn người dùng nhấn nút back
    }
}