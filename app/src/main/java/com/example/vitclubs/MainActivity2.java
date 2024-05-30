package com.example.vitclubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name = getIntent().getStringExtra("NAME");
        String description = getIntent().getStringExtra("DESCRIPTION");
//        int image = getIntent().getIntExtra("IMAGE",0);


        TextView nameTextView3 = findViewById(R.id.TC_Title);
        TextView descriptionTextView = findViewById(R.id.TC_description);
//        ImageView Image = findViewById(R.id.TC_Image);

        nameTextView3.setText(name);
        descriptionTextView.setText(description);
//        Image.setImageResource(image);
    }

}