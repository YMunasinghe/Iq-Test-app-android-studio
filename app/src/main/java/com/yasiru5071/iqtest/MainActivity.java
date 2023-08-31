package com.yasiru5071.iqtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iqtest.R;

public class MainActivity extends AppCompatActivity {

    Button iq_test_btn;
    Animation anim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iq_test_btn=findViewById(R.id.iqtest_btn);

        anim1= AnimationUtils.loadAnimation(MainActivity.this,R.anim.scaling);
        iq_test_btn.startAnimation(anim1);

        iq_test_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, iqtest_activity.class).setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
    }
}