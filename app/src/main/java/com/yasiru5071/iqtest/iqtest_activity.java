package com.yasiru5071.iqtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iqtest.R;

public class iqtest_activity extends AppCompatActivity {

    Button iq_test_continue_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqtest);

        iq_test_continue_btn=findViewById(R.id.iqtest_continue_btn);

        iq_test_continue_btn.startAnimation(AnimationUtils.loadAnimation(this,R.anim.alpha));

        iq_test_continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(iqtest_activity.this,PlayiqActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
    }
}