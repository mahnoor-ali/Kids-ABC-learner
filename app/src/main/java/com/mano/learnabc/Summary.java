package com.mano.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Summary extends AppCompatActivity {
    ArrayList<Alphabet> a_to_z;
    ListView summary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        ArrayList<Alphabet> a_to_z = new ArrayList<Alphabet>();
        int[] images = new int[]{R.drawable.apple, R.drawable.ball, R.drawable.cat, R.drawable.duck, R.drawable.egg, R.drawable.fish, R.drawable.goat, R.drawable.house, R.drawable.ink, R.drawable.jam, R.drawable.kite, R.drawable.lion, R.drawable.milk, R.drawable.nest, R.drawable.orange, R.drawable.pen, R.drawable.queen, R.drawable.rat, R.drawable.sun, R.drawable.tree, R.drawable.umbrella, R.drawable.van, R.drawable.web, R.drawable.xylo, R.drawable.yoyo, R.drawable.zip};

        Alphabet alph;
        String alphabet;
        //A 65 a 97
        for(int i=0; i<images.length; i++)
        {
            char A = (char)(65+i);
            char a = (char)(97+i);
            alphabet = A + " " + a;
            alph = new Alphabet(alphabet, images[i]);
            a_to_z.add(alph);
        }

        ViewAdapter adapter = new ViewAdapter(this, a_to_z);
        summary = findViewById(R.id.summary);
        summary.setAdapter(adapter);
    }
}