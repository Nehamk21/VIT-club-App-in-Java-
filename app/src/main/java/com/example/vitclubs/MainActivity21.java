package com.example.vitclubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity21 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        String name1 = getIntent().getStringExtra("NAME");
        String description1 = getIntent().getStringExtra("DESCRIPTION");
//        int image = getIntent().getIntExtra("IMAGE",0);


        TextView nameTextView2 = findViewById(R.id.NTC_Title);
        TextView descriptionTextView1 = findViewById(R.id.NTC_description);
//        ImageView Image = findViewById(R.id.TC_Image);

        nameTextView2.setText(name1);
        descriptionTextView1.setText(description1);
//        Image.setImageResource(image);
    }

}