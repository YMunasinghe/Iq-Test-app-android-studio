package com.yasiru5071.iqtest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iqtest.R;

public class PlayiqActivity extends AppCompatActivity implements View.OnClickListener {

    TextView level;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8;
    ImageView img_ans1,img_ans2,img_ans3,img_ans4;

    int count=0;
    int levelTxt=1;
    int totalQuestions= IqTestDetails.answers.length;
    String clickedBtnValue="";

    public static String finalCount="";
    int correctAnswerCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playiq);

        level=findViewById(R.id.count_txt);

        img_ans1=findViewById(R.id.ans_img_1);
        img_ans2=findViewById(R.id.ans_img_2);
        img_ans3=findViewById(R.id.ans_img_3);
        img_ans4=findViewById(R.id.ans_img_4);

        img1=findViewById(R.id.q_img1);
        img2=findViewById(R.id.q_img2);
        img3=findViewById(R.id.q_img3);
        img4=findViewById(R.id.q_img4);
        img5=findViewById(R.id.q_img5);
        img6=findViewById(R.id.q_img6);
        img7=findViewById(R.id.q_img7);
        img8=findViewById(R.id.q_img8);

        img_ans1.setOnClickListener(this);
        img_ans2.setOnClickListener(this);
        img_ans3.setOnClickListener(this);
        img_ans4.setOnClickListener(this);

        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {
        ImageView clickedButton=(ImageView) view;

            count++;
            levelTxt++;
            clickedBtnValue=Integer.toString(view.getId());

            if(clickedBtnValue.equals(Integer.toString(IqTestDetails.answers[correctAnswerCount]))){
                correctAnswerCount++;
            }

            @SuppressLint("UseCompatLoadingForDrawables")
            Drawable enterBack = getResources().getDrawable(
                R.drawable.iqtest_ans_back2);
             view.setBackgroundDrawable(enterBack);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    @SuppressLint("UseCompatLoadingForDrawables")
                    Drawable enterBack2 = getResources().getDrawable(
                            R.drawable.iqtest_ans_back);
                    view.setBackgroundDrawable(enterBack2);
                }
            },400);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    loadNewQuestion();
                    //finish();
                }
            },400);
    }

    void loadNewQuestion() {
        if(count==totalQuestions-1){
            finalCount=Integer.toString(correctAnswerCount);

            finishQuiz();
            return;
        }
        img1.setImageResource(IqTestDetails.iq_test_images[count][0]);
        img2.setImageResource(IqTestDetails.iq_test_images[count][1]);
        img3.setImageResource(IqTestDetails.iq_test_images[count][2]);
        img4.setImageResource(IqTestDetails.iq_test_images[count][3]);
        img5.setImageResource(IqTestDetails.iq_test_images[count][4]);
        img6.setImageResource(IqTestDetails.iq_test_images[count][5]);
        img7.setImageResource(IqTestDetails.iq_test_images[count][6]);
        img8.setImageResource(IqTestDetails.iq_test_images[count][7]);

        img_ans1.setImageResource(IqTestDetails.iq_answer_images[count][0]);
        img_ans2.setImageResource(IqTestDetails.iq_answer_images[count][1]);
        img_ans3.setImageResource(IqTestDetails.iq_answer_images[count][2]);
        img_ans4.setImageResource(IqTestDetails.iq_answer_images[count][3]);

        level.setText(String.valueOf(levelTxt));
    }

    void finishQuiz(){
        Intent intent=new Intent(this,iqResult.class);
        startActivity(intent);
    }
}