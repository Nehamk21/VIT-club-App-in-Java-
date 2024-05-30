package com.example.vitclubs;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Clubs extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        Button but= (Button) findViewById(R.id.button);
        Button but2= (Button) findViewById(R.id.button2);

        but.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent= new Intent(Clubs.this,cp.class);
                                          startActivity(intent);

                                      }
                                  }
        );
        but2.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent= new Intent(Clubs.this,cp2.class);
                                          startActivity(intent);

                                      }
                                  }
        );


    }
}