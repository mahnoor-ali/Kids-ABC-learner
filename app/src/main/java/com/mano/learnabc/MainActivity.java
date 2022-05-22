package com.mano.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Intent intent;
ImageButton learn;
ImageButton quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learn=findViewById(R.id.learn);
        quiz = findViewById(R.id.quiz);
        learn.setOnClickListener(this);
        quiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.learn:
                intent = new Intent(MainActivity.this, LearningModule.class);
                startActivity(intent);
                break;
            case R.id.quiz:
                intent = new Intent(MainActivity.this, QuizModule.class );
                startActivity(intent);
                break;
        }
    }



}