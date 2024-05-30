package com.example.vitclubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.vitclubs.R;
import com.example.vitclubs.technical;

import java.util.ArrayList;

public class cp extends AppCompatActivity implements RecycleViewInterface {

    ArrayList<technical> technicals = new ArrayList<>();


    int techClubImages[] = {R.drawable.gedit, R.drawable.chesa,R.drawable.isa,R.drawable.tg,R.drawable.er,R.drawable.tlabs,R.drawable.racing,
            R.drawable.compsoc, R.drawable.devsclub, R.drawable.ieee, R.drawable.technorats, R.drawable.trf};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cp);

        RecyclerView recyclerView = findViewById(R.id.mRecycleView);

        setUpTechnicals ();

        AA_RecycleViewAdapter adapter = new AA_RecycleViewAdapter(this,
                technicals, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpTechnicals () {

        String[] TechClubsNames = getResources().getStringArray(R.array.technical_clubs_array);
        String[] Description = getResources().getStringArray(R.array.technical_clubs_description);

        for (int i = 0; i < TechClubsNames.length; i++)
            technicals.add(new technical(TechClubsNames[i], techClubImages[i], Description[i] )
            );
    }


    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(cp.this,MainActivity2.class);

        intent.putExtra("NAME",technicals.get(position).getTechClubName());
        intent.putExtra("DESCRIPTION",technicals.get(position).getDescription());
        intent.putExtra("IMAGE",technicals.get(position).getImage());

        startActivity(intent);

    }
}
