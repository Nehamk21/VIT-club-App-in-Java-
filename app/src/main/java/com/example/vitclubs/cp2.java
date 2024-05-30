package com.example.vitclubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.vitclubs.R;
import com.example.vitclubs.technical;

import java.util.ArrayList;

public class cp2 extends AppCompatActivity implements RecycleViewInterface2 {

    ArrayList<nontechnical> Nontechnicals = new ArrayList<>();


    int NontechClubImages[] = {R.drawable.viculp,R.drawable.aaroh,R.drawable.mirage,R.drawable.vclick,R.drawable.pdclub,R.drawable.abhi,R.drawable.vc,
            R.drawable.mun,R.drawable.yug,R.drawable.antariksh,R.drawable.ekasutram,R.drawable.tedx,R.drawable.qsoc,R.drawable.epce,R.drawable.veh,R.drawable.diva,R.drawable.vitsocial};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cp2);

        RecyclerView recyclerView = findViewById(R.id.mRecycleView2);

        setUpNonTechnicals ();

        AA_RecycleViewAdapter2 adapter = new AA_RecycleViewAdapter2(this,
                Nontechnicals, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpNonTechnicals () {

        String[] NonTechClubsNames = getResources().getStringArray(R.array.nontechnical_clubs_array);
        String[] Description2 = getResources().getStringArray(R.array.nontechnical_clubs_description);

        for (int i = 0; i < NonTechClubsNames.length; i++)
            Nontechnicals.add(new nontechnical(NonTechClubsNames[i], NontechClubImages[i], Description2[i] )
            );
    }


    @Override
    public void onItemClick(int pos) {
        Intent intent = new Intent(cp2.this,MainActivity21.class);

        intent.putExtra("NAME",Nontechnicals.get(pos).getnonTechClubName());
        intent.putExtra("DESCRIPTION",Nontechnicals.get(pos).getDescription2());
        intent.putExtra("IMAGE",Nontechnicals.get(pos).getImage2());

        startActivity(intent);

    }
}