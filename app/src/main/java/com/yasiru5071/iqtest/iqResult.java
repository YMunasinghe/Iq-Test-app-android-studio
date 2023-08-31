package com.yasiru5071.iqtest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iqtest.R;

public class iqResult extends AppCompatActivity {

    Button button;
    TextView CORRECT_ANSWER_COUNT_TEXT;

    TextView highlyGiftedTxt,giftedTxt,highTxt,highAverageTxt,averageTxt,lowAverageTxt,bordlineTxt,mentallyDeficientTxt;
    TextView highlyGiftedNumber,giftedNumber,highNumber,highAverageNumber,averageNumber,lowAverageNumber,bordlineNumber,mentallyDeficientNumber;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq_result);

        CORRECT_ANSWER_COUNT_TEXT=findViewById(R.id.correct_answer_count_txt);
        int getCount=Integer.parseInt(PlayiqActivity.finalCount);
        int iq_rate=7*getCount;
        CORRECT_ANSWER_COUNT_TEXT.setText(Integer.toString(iq_rate));

        button=findViewById(R.id.iqtest_mainmenu_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iqResult.this,MainActivity.class);
                startActivity(intent);
            }
        });

        highlyGiftedTxt=findViewById(R.id.highly_gifted_txt);
        giftedTxt=findViewById(R.id.gifted_txt);
        highTxt=findViewById(R.id.high_txt);
        highAverageTxt=findViewById(R.id.high_average_txt);
        averageTxt=findViewById(R.id.average_txt);
        lowAverageTxt=findViewById(R.id.low_average_txt);
        bordlineTxt=findViewById(R.id.bordline_txt);
        mentallyDeficientTxt=findViewById(R.id.mentally_deficient_txt);

        highlyGiftedNumber=findViewById(R.id.highly_gifted_number);
        giftedNumber=findViewById(R.id.gifted_number);
        highNumber=findViewById(R.id.high_number);
        highAverageNumber=findViewById(R.id.high_average_number);
        averageNumber=findViewById(R.id.average_number);
        lowAverageNumber=findViewById(R.id.low_average_number);
        bordlineNumber=findViewById(R.id.bordline_number);
        mentallyDeficientNumber=findViewById(R.id.mentally_deficient_number);

        if (iq_rate>=140){
            highlyGiftedTxt.setTextColor(Color.parseColor("#FAC213"));
            highlyGiftedTxt.setAlpha(1);
            highlyGiftedTxt.setTextSize(23);

            highlyGiftedNumber.setTextColor(Color.parseColor("#FAC213"));
            highlyGiftedNumber.setAlpha(1);
            highlyGiftedNumber.setTextSize(23);

        } else if(iq_rate>=130){
            giftedTxt.setTextColor(Color.parseColor("#FAC213"));
            giftedTxt.setAlpha(1);
            giftedTxt.setTextSize(23);

            giftedNumber.setTextColor(Color.parseColor("#FAC213"));
            giftedNumber.setAlpha(1);
            giftedNumber.setTextSize(23);

        } else if(iq_rate>115&&iq_rate<129){
            highTxt.setTextColor(Color.parseColor("#FAC213"));
            highTxt.setAlpha(1);
            highTxt.setTextSize(23);

            highNumber.setTextColor(Color.parseColor("#FAC213"));
            highNumber.setAlpha(1);
            highNumber.setTextSize(23);

        } else if(iq_rate>110&&iq_rate<115){
            highAverageTxt.setTextColor(Color.parseColor("#FAC213"));
            highAverageTxt.setAlpha(1);
            highAverageTxt.setTextSize(23);

            highAverageNumber.setTextColor(Color.parseColor("#FAC213"));
            highAverageNumber.setAlpha(1);
            highAverageNumber.setTextSize(23);

        } else if(iq_rate>90&&iq_rate<109){
            averageTxt.setTextColor(Color.parseColor("#FAC213"));
            averageTxt.setAlpha(1);
            averageTxt.setTextSize(23);

            averageNumber.setTextColor(Color.parseColor("#FAC213"));
            averageNumber.setAlpha(1);
            averageNumber.setTextSize(23);

        } else if(iq_rate>80&&iq_rate<89){
            lowAverageTxt.setTextColor(Color.parseColor("#FAC213"));
            lowAverageTxt.setAlpha(1);
            lowAverageTxt.setTextSize(23);

            lowAverageNumber.setTextColor(Color.parseColor("#FAC213"));
            lowAverageNumber.setAlpha(1);
            lowAverageNumber.setTextSize(23);

        } else if(iq_rate>=70&&iq_rate<79){
            bordlineTxt.setTextColor(Color.parseColor("#FAC213"));
            bordlineTxt.setAlpha(1);
            bordlineTxt.setTextSize(23);

            bordlineNumber.setTextColor(Color.parseColor("#FAC213"));
            bordlineNumber.setAlpha(1);
            bordlineNumber.setTextSize(23);

        } else{
            mentallyDeficientTxt.setTextColor(Color.parseColor("#FAC213"));
            mentallyDeficientTxt.setAlpha(1);
            mentallyDeficientTxt.setTextSize(23);

            mentallyDeficientNumber.setTextColor(Color.parseColor("#FAC213"));
            mentallyDeficientNumber.setAlpha(1);
            mentallyDeficientNumber.setTextSize(23);

        }

    }
}