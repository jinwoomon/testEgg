package com.example.breakingegg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ivEgg;
    private Button btnStart;

    private Random random;

    private int targetCount;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivEgg = (ImageView) findViewById(R.id.ivEgg);
        btnStart = (Button) findViewById(R.id.btnStart);

        ivEgg.setImageResource(R.drawable.egg);

        random = new Random();

        targetCount = random.nextInt(50)+1;

        ivEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>targetCount) {
                    ivEgg.setImageResource(R.drawable.break_egg);
                    btnStart.setEnabled(true);
                }else{
                    count++;
                    btnStart.setEnabled(false);
                }
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count =0;
                ivEgg.setImageResource(R.drawable.egg);
            }
        });
        }





}


