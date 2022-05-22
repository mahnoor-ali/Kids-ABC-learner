package com.mano.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

import java.util.Random;

public class QuizModule extends AppCompatActivity {
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_module);
        btn1=findViewById(R.id.image1);
        btn2=findViewById(R.id.image2);
        btn3=findViewById(R.id.image3);
        btn4=findViewById(R.id.image4);
        btn5=findViewById(R.id.image5);
        //array of images relevant to each alphabet
        int[] images = {R.drawable.apple,R.drawable.ball,R.drawable.cat,R.drawable.duck, R.drawable.egg,R.drawable.fish,R.drawable.goat,R.drawable.house, R.drawable.ink,R.drawable.jam,R.drawable.kite,R.drawable.lion, R.drawable.milk,R.drawable.nest,R.drawable.orange,R.drawable.pen, R.drawable.queen,R.drawable.rat, R.drawable.sun,R.drawable.tree,R.drawable.umbrella,R.drawable.van, R.drawable.web,R.drawable.xylo,R.drawable.yoyo,R.drawable.zip };
        Random rand = new Random();
        // put random images as option at all 5 buttons
        btn1.setImageResource(images[rand.nextInt(images.length)]);
        btn2.setImageResource(images[rand.nextInt(images.length)]);
        btn3.setImageResource(images[rand.nextInt(images.length)]);
        btn4.setImageResource(images[rand.nextInt(images.length)]);
        btn5.setImageResource(images[rand.nextInt(images.length)]);

        //TODO: set click listener on all btns, chrck correctness

    }
}