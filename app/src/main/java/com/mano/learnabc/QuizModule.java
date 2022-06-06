package com.mano.learnabc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class QuizModule extends AppCompatActivity implements View.OnClickListener {

    //5 buttons that serve as  options
    ImageButton[] optionBtn;
    int[] images;
    //resources of each button's image
    int btn1Resource;
    int btn2Resource;
    int btn3Resource;
    int btn4Resource;
    int btn5Resource;
    TextView alphabet;
    TextView result;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_module);
        setOptions(); //setup mcq options
        intent = getIntent();
        alphabet = findViewById(R.id.alphabet);
        alphabet.setText(intent.getStringExtra("alphabet"));

       //generate random numbers in range of 26
        Random rand = new Random();
        btn1Resource = rand.nextInt(images.length);
        btn2Resource = rand.nextInt(images.length);
        btn3Resource = (alphabet.getText().toString()).charAt(0); //ascii of current alphabet
        btn3Resource = btn3Resource-65; //set one option corresponding to alphabet
        btn4Resource = rand.nextInt(images.length);
        btn5Resource = rand.nextInt(images.length);
        // put random images as option at all 5 buttons
        optionBtn[0].setImageResource(images[btn1Resource]);
        optionBtn[1].setImageResource(images[btn2Resource]);
        optionBtn[2].setImageResource(images[btn3Resource]);
        optionBtn[3].setImageResource(images[btn4Resource]);
        optionBtn[4].setImageResource(images[btn5Resource]);


        //TODO: add 2 fnctns to avoid data loss

    }

    public void setOptions(){
        //array of images corresponding to each alphabet
        images = new int[]{R.drawable.apple, R.drawable.ball, R.drawable.cat, R.drawable.duck, R.drawable.egg, R.drawable.fish, R.drawable.goat, R.drawable.house, R.drawable.ink, R.drawable.jam, R.drawable.kite, R.drawable.lion, R.drawable.milk, R.drawable.nest, R.drawable.orange, R.drawable.pen, R.drawable.queen, R.drawable.rat, R.drawable.sun, R.drawable.tree, R.drawable.umbrella, R.drawable.van, R.drawable.web, R.drawable.xylo, R.drawable.yoyo, R.drawable.zip};
        //get id of all options
        optionBtn[0]=findViewById(R.id.option1);
        optionBtn[1]=findViewById(R.id.option2);
        optionBtn[2]=findViewById(R.id.option3);
        optionBtn[3]=findViewById(R.id.option4);
        optionBtn[4]=findViewById(R.id.option5);
        result = findViewById(R.id.result);

        optionBtn[0].setOnClickListener(this);
        optionBtn[1].setOnClickListener(this);
        optionBtn[2].setOnClickListener(this);
        optionBtn[3].setOnClickListener(this);
        optionBtn[4].setOnClickListener(this);
    }

    public void checkCorrectness(int imgNo, char letter) {
        int ascii = letter;
        int num = ascii - 65; //A=0, B=1 so on
        //if selected image's initial alphabet is same as quest alphabet, then its correct
        if (imgNo - num == 0)
            result.setText("Well Done!");
        else
            result.setText("Wrong! Keep Learning");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.option1:
                checkCorrectness(btn1Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option2:
                checkCorrectness(btn2Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option3:
                checkCorrectness(btn3Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option4:
                checkCorrectness(btn4Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option5:
                checkCorrectness(btn5Resource, (alphabet.getText().toString()).charAt(0));
                break;
        }

        /*
        // whatever case was executed, always move to next activity when a button is clicked after waiting for 2 sec
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                intent = new Intent(QuizModule.this, quizSelection.class);
                startActivity(intent);
            }
        }, 2000);   //2 seconds
         */

    }
}




