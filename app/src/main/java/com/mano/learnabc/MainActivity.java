package com.mano.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Intent intent;
ImageButton learn;
ImageButton quiz;
Button summary;
Button repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learn=findViewById(R.id.learn);
        quiz = findViewById(R.id.quiz);
        repo = findViewById(R.id.repo);
        summary = findViewById(R.id.Summary);

        summary.setOnClickListener(this);
        repo.setOnClickListener(this);
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
            case R.id.repo:
                Uri webpage = Uri.parse("https://github.com/Mahnoor786-dev/Kids-ABC-learner");
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            case R.id.Summary:
                intent = new Intent(MainActivity.this, Summary.class );
                startActivity(intent);
                break;
        }
    }



}