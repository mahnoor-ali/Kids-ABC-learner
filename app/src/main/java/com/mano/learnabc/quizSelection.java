package com.mano.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class quizSelection extends AppCompatActivity implements  View.OnClickListener{
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_selection);

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

        intent = new Intent(quizSelection.this, QuizModule.class);
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.letter_a:
                intent.putExtra("alphabet", "A");
                startActivity(intent);
                break;
            case R.id.letter_b:
                intent.putExtra("alphabet", "B");
                startActivity(intent);
                break;
            case R.id.letter_c:
                intent.putExtra("alphabet", "C");
                startActivity(intent);
                break;
            case R.id.letter_d:
                intent.putExtra("alphabet", "D");
                startActivity(intent);
                break;
            case R.id.letter_e:
                intent.putExtra("alphabet", "E");
                startActivity(intent);
                break;
            case R.id.letter_f:
                intent.putExtra("alphabet", "F");
                startActivity(intent);
                break;
            case R.id.letter_g:
                intent.putExtra("alphabet", "G");
                startActivity(intent);
                break;
            case R.id.letter_h:
                intent.putExtra("alphabet", "H");
                startActivity(intent);
                break;
            case R.id.letter_i:
                intent.putExtra("alphabet", "I");
                startActivity(intent);
                break;
            case R.id.letter_j:
                intent.putExtra("alphabet", "J");
                startActivity(intent);
                break;
            case R.id.letter_k:
                intent.putExtra("alphabet", "K");
                startActivity(intent);
                break;
            case R.id.letter_l:
                intent.putExtra("alphabet", "L");
                startActivity(intent);
                break;
            case R.id.letter_m:
                intent.putExtra("alphabet", "M");
                startActivity(intent);
                break;
            case R.id.letter_n:
                intent.putExtra("alphabet", "N");
                startActivity(intent);
                break;
            case R.id.letter_o:
                intent.putExtra("alphabet", "O");
                startActivity(intent);
                break;
            case R.id.letter_p:
                intent.putExtra("alphabet", "P");
                startActivity(intent);
                break;
            case R.id.letter_q:
                intent.putExtra("alphabet", "Q");
                startActivity(intent);
                break;
            case R.id.letter_r:
                intent.putExtra("alphabet", "R");
                startActivity(intent);
                break;
            case R.id.letter_s:
                intent.putExtra("alphabet", "S");
                startActivity(intent);
                break;
            case R.id.letter_t:
                intent.putExtra("alphabet", "T");
                startActivity(intent);
                break;
            case R.id.letter_u:
                intent.putExtra("alphabet", "U");
                startActivity(intent);
                break;
            case R.id.letter_v:
                intent.putExtra("alphabet", "V");
                startActivity(intent);
                break;
            case R.id.letter_w:
                intent.putExtra("alphabet", "W");
                startActivity(intent);
                break;
            case R.id.letter_x:
                intent.putExtra("alphabet", "X");
                startActivity(intent);
                break;
            case R.id.letter_y:
                intent.putExtra("alphabet", "Y");
                startActivity(intent);
                break;
            case R.id.letter_z:
                intent.putExtra("alphabet", "Z");
                startActivity(intent);
                break;

        }
    }



}