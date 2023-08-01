package com.caiquocdat.wordsearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.caiquocdat.wordsearch.adapter.WordAdapter;
import com.caiquocdat.wordsearch.custom_progressbar.CircularCountdownView;
import com.caiquocdat.wordsearch.data.DataGenerator;
import com.caiquocdat.wordsearch.databinding.ActivityHomeBinding;
import com.caiquocdat.wordsearch.databinding.ActivityQuizBinding;
import com.caiquocdat.wordsearch.model.OnClickAnswer;
import com.caiquocdat.wordsearch.model.QuestionModel;
import com.caiquocdat.wordsearch.model.WordModel;

import java.util.List;

public class QuizActivity extends AppCompatActivity {
    private ProgressBar circularProgressBar;
    private TextView countdownTextView;
    CircularCountdownView circularCountdown;
    private static final int TOTAL_TIME = 30000;
    private static final int PROGRESS_STEP = 3;
    float totalTime = 100;
    private ActivityQuizBinding quizBinding;
    private CountDownTimer countDownTimer;
    int point = 0;
    String checkCorrect = "false";
    QuestionModel questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        quizBinding = ActivityQuizBinding.inflate(getLayoutInflater());
        View view = quizBinding.getRoot();
        setContentView(view);

        hideSystemUI();
        setUpCountTime();
        setUpQuestion();


        quizBinding.againImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUp();
                setUpCountTime();
                setUpQuestion();
            }
        });
        quizBinding.homeTimeUpImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        quizBinding.homeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        quizBinding.nextImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pointStr = quizBinding.pointTv.getText().toString();
                int point = Integer.parseInt(pointStr);
                if (point == 50) {
                    Toast.makeText(QuizActivity.this, "Bạn đã trả lời hết câu hỏi !", Toast.LENGTH_SHORT).show();
                } else {
                    setUpCountTime();
                    setUpQuestion();
                    setUp();
                }
            }
        });

    }


    private void setUpQuestion() {
        if (checkCorrect.equals("false")) {
            questions = DataGenerator.getRandomNewQuestion();
        } else {
            questions = DataGenerator.getRandomQuestion();
        }
        //setup question
        quizBinding.questionTv.setText(questions.getQuestionText());
        //setup rcv
        List<WordModel> words = questions.getWords();
        WordAdapter adapter = new WordAdapter(this, words, questions);
        quizBinding.wordRcv.setLayoutManager(new GridLayoutManager(this, 5));
        quizBinding.wordRcv.setAdapter(adapter);
        adapter.setOnClickAnswer(new OnClickAnswer() {
            @Override
            public void onClick(String check) {
                if (check.equals("true")) {
                    point = point + 10;
                    quizBinding.pointTv.setText(point + "");
                    countDownTimer.cancel();
                    checkCorrect = "true";
                    setUpNext();
                }
            }
        });
    }

    private void setUpCountTime() {
        countDownTimer = new CountDownTimer((long) (totalTime * 1000), 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                float secondsRemaining = millisUntilFinished / 1000f;
                quizBinding.circularCountdown.update(secondsRemaining, totalTime);
            }

            @Override
            public void onFinish() {
                quizBinding.circularCountdown.update(0, totalTime);
                setUpTimeUp();


            }
        }.start();
    }

    private void setUpTimeUp() {
        quizBinding.timeUpRel.setVisibility(View.VISIBLE);
        quizBinding.questionRel.setVisibility(View.GONE);
        quizBinding.wordRcv.setVisibility(View.GONE);
    }

    private void setUpNext() {
        quizBinding.trueRel.setVisibility(View.VISIBLE);
        quizBinding.questionRel.setVisibility(View.GONE);
        quizBinding.wordRcv.setVisibility(View.GONE);
    }

    private void setUp() {
        quizBinding.trueRel.setVisibility(View.GONE);
        quizBinding.timeUpRel.setVisibility(View.GONE);
        quizBinding.questionRel.setVisibility(View.VISIBLE);
        quizBinding.wordRcv.setVisibility(View.VISIBLE);
    }


    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
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
    public void onBackPressed() {
        // Không làm gì cả để ngăn người dùng nhấn nút back
    }
}