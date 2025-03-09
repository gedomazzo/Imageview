package com.example.imageview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;

    ImageView imw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

        imw = findViewById(R.id.imw);

    }

    public void onPush(View view) {

        int[] id = new int[3];
        id[0] = R.drawable.gnome;
        id[1] = R.drawable.crist;
        id[2] = R.drawable.night;

        int x = (int)(Math.random() * 3);
        imw.setImageResource(id[x]);
    }
}

