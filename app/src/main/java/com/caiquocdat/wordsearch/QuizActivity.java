package com.caiquocdat.wordsearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.caiquocdat.wordsearch.adapter.AnswerAdapter;
import com.caiquocdat.wordsearch.adapter.WordAdapter;
import com.caiquocdat.wordsearch.custom_progressbar.CircularCountdownView;
import com.caiquocdat.wordsearch.data.DataGenerator;
import com.caiquocdat.wordsearch.databinding.ActivityHomeBinding;
import com.caiquocdat.wordsearch.databinding.ActivityQuizBinding;
import com.caiquocdat.wordsearch.model.OnClickAnswer;
import com.caiquocdat.wordsearch.model.QuestionModel;
import com.caiquocdat.wordsearch.model.WordModel;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    private ProgressBar circularProgressBar;
    private TextView countdownTextView;
    CircularCountdownView circularCountdown;
    private static final int TOTAL_TIME = 30000;
    private static final int PROGRESS_STEP = 3;
    float totalTime = 10;
    private ActivityQuizBinding quizBinding;
    private CountDownTimer countDownTimer;
    int point = 0;
    String pointStr;
    String checkCorrect = "false";
    QuestionModel questions;
    List<String> selectList;
    AnswerAdapter answerAdapter;
    LinearLayoutManager layoutManager;
    String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        quizBinding = ActivityQuizBinding.inflate(getLayoutInflater());
        View view = quizBinding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        type = intent.getStringExtra("type");


        hideSystemUI();
        setUpCountTime();
        setUpQuestion();


        quizBinding.againImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type.equals("easy")) {
                    DataGenerator.resetEasyQuestions();
                }else  if (type.equals("hard")) {
                    DataGenerator.resetHardQuestions();
                } else  if (type.equals("veryhard")) {
                    DataGenerator.resetVeryHardQuestions();
                }
                quizBinding.pointTv.setText("0");
                point = 0;
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
                pointStr = quizBinding.pointTv.getText().toString();
                point = Integer.parseInt(pointStr);
                if (point > 90) {
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
        if (type.equals("easy")) {
            questions = DataGenerator.getRandomEasyQuestion();
        } else if (type.equals("hard")) {
            questions = DataGenerator.getRandomHardQuestion();
        } else if (type.equals("veryhard")) {
            questions = DataGenerator.getRandomVeryHardQuestion();
        }

        //setup question
        quizBinding.questionTv.setText(questions.getQuestionText());
        //setup rcv
        List<WordModel> words = questions.getWords();
        List<String> answers = questions.getAnswer();
        //
        answerAdapter = new AnswerAdapter(answers, selectList, QuizActivity.this);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        quizBinding.answerRcv.setLayoutManager(layoutManager);
        quizBinding.answerRcv.setAdapter(answerAdapter);
        //
        WordAdapter adapter = new WordAdapter(this, words, questions);
        quizBinding.wordRcv.setLayoutManager(new GridLayoutManager(this, 5));
        quizBinding.wordRcv.setAdapter(adapter);
        adapter.setOnClickAnswer(new OnClickAnswer() {
            @Override
            public void onClick(List<String> check) {
                List<String> getAllCorrect = questions.getAnswer();
                Log.d("Test_2", "size: " + check);
                if (check.size() > getAllCorrect.size()) {
                    answerAdapter = new AnswerAdapter(answers, selectList, QuizActivity.this);
                    answerAdapter.notifyDataSetChanged();
                    quizBinding.answerRcv.setAdapter(answerAdapter);
                } else if (check.equals(getAllCorrect)) {
                    point = point + 10;
                    quizBinding.pointTv.setText(point + "");
                    countDownTimer.cancel();
                    checkCorrect = "true";
                    answerAdapter = new AnswerAdapter(answers, check, QuizActivity.this);
                    answerAdapter.notifyDataSetChanged();
                    quizBinding.answerRcv.setAdapter(answerAdapter);
                    new CountDownTimer(500, 1000) {

                        public void onTick(long millisUntilFinished) {
                            // Các hành động cần thực hiện sau mỗi "tick", trong trường hợp này là 1000 mili giây (1 giây)
                        }

                        public void onFinish() {
                            // Các hành động cần thực hiện khi hết thời gian đếm ngược
                            setUpNext();
                        }
                    }.start();
                } else {
//                   AnswerAdapter answerAdapter_reset= new AnswerAdapter(answers,selectList,QuizActivity.this);
//                   LinearLayoutManager layoutManager_reset = new LinearLayoutManager(QuizActivity.this,LinearLayoutManager.HORIZONTAL, false);
//                   quizBinding.answerRcv.setLayoutManager(layoutManager_reset);
//                   quizBinding.answerRcv.setAdapter(answerAdapter_reset);
                    answerAdapter = new AnswerAdapter(answers, check, QuizActivity.this);
                    answerAdapter.notifyDataSetChanged();
                    quizBinding.answerRcv.setAdapter(answerAdapter);
                }
            }
        });
    }

    private void setUpCountTime() {
        if (type.equals("easy")){
            totalTime=15;
        }else if (type.equals("hard")){
            totalTime=10;
        } else if (type.equals("veryhard")){
            totalTime=5;
        }
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
        quizBinding.answerRcv.setVisibility(View.GONE);
    }

    private void setUpNext() {
        quizBinding.trueRel.setVisibility(View.VISIBLE);
        quizBinding.questionRel.setVisibility(View.GONE);
        quizBinding.wordRcv.setVisibility(View.GONE);
        quizBinding.answerRcv.setVisibility(View.GONE);
    }

    private void setUp() {
        quizBinding.trueRel.setVisibility(View.GONE);
        quizBinding.timeUpRel.setVisibility(View.GONE);
        quizBinding.questionRel.setVisibility(View.VISIBLE);
        quizBinding.wordRcv.setVisibility(View.VISIBLE);
        quizBinding.answerRcv.setVisibility(View.VISIBLE);
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
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onBackPressed() {
        // Không làm gì cả để ngăn người dùng nhấn nút back
    }
}