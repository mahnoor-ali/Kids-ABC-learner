package com.mano.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LearningModule extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    ImageView img;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton a = findViewById(R.id.letter_a);
        a.setOnClickListener(this);
        ImageButton b = findViewById(R.id.letter_b);
        b.setOnClickListener(this);
        ImageButton c = findViewById(R.id.letter_c);
        c.setOnClickListener(this);
        ImageButton d = findViewById(R.id.letter_d);
        d.setOnClickListener(this);
        ImageButton e = findViewById(R.id.letter_e);
        e.setOnClickListener(this);
        ImageButton f = findViewById(R.id.letter_f);
        f.setOnClickListener(this);
        ImageButton g = findViewById(R.id.letter_g);
        g.setOnClickListener(this);
        ImageButton h = findViewById(R.id.letter_h);
        h.setOnClickListener(this);
        ImageButton i = findViewById(R.id.letter_i);
        i.setOnClickListener(this);
        ImageButton j = findViewById(R.id.letter_j);
        j.setOnClickListener(this);
        ImageButton k = findViewById(R.id.letter_k);
        k.setOnClickListener(this);
        ImageButton l = findViewById(R.id.letter_l);
        l.setOnClickListener(this);
        ImageButton m = findViewById(R.id.letter_m);
        m.setOnClickListener(this);
        ImageButton n = findViewById(R.id.letter_n);
        n.setOnClickListener(this);
        ImageButton o = findViewById(R.id.letter_o);
        o.setOnClickListener(this);
        ImageButton p = findViewById(R.id.letter_p);
        p.setOnClickListener(this);
        ImageButton q = findViewById(R.id.letter_q);
        q.setOnClickListener(this);
        ImageButton r = findViewById(R.id.letter_r);
        r.setOnClickListener(this);
        ImageButton s = findViewById(R.id.letter_s);
        s.setOnClickListener(this);
        ImageButton t = findViewById(R.id.letter_t);
        t.setOnClickListener(this);
        ImageButton u = findViewById(R.id.letter_u);
        u.setOnClickListener(this);
        ImageButton v = findViewById(R.id.letter_v);
        v.setOnClickListener(this);
        ImageButton w = findViewById(R.id.letter_w);
        w.setOnClickListener(this);
        ImageButton x = findViewById(R.id.letter_x);
        x.setOnClickListener(this);
        ImageButton y = findViewById(R.id.letter_y);
        y.setOnClickListener(this);
        ImageButton z = findViewById(R.id.letter_z);
        z.setOnClickListener(this);

        img = findViewById(R.id.word);
        intent = new Intent(LearningModule.this, Words.class);
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.letter_a:
                image = R.drawable.word_a;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_b:
                image = R.drawable.word_b;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_c:
                image = R.drawable.word_c;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_d:
                image = R.drawable.word_d;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_e:
                image = R.drawable.word_e;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_f:
                image = R.drawable.word_f;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_g:
                image = R.drawable.word_g;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_h:
                image = R.drawable.word_h;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_i:
                image = R.drawable.word_i;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_j:
                image = R.drawable.word_j;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_k:
                image = R.drawable.word_k;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_l:
                image = R.drawable.word_l;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_m:
                image = R.drawable.word_m;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_n:
                image = R.drawable.word_n;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_o:
                image = R.drawable.word_o;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_p:
                image = R.drawable.word_p;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_q:
                image = R.drawable.word_q;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_r:
                image = R.drawable.word_r;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_s:
                image = R.drawable.word_s;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_t:
                image = R.drawable.word_t;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_u:
                image = R.drawable.word_u;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_v:
                image = R.drawable.word_v;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_w:
                image = R.drawable.word_w;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_x:
                image = R.drawable.word_x;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_y:
                image = R.drawable.word_y;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_z:
                image = R.drawable.word_z;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;

        }
    }


}