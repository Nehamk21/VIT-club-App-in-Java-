package com.example.vitclubs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AA_RecycleViewAdapter2 extends RecyclerView.Adapter<AA_RecycleViewAdapter2.MyViewHolder> {

    private final RecycleViewInterface2 recycleViewInterface2;
    Context context;
    ArrayList<nontechnical> nontechnicals;

    public AA_RecycleViewAdapter2( Context context, ArrayList<nontechnical> nontechnicals,
                                  RecycleViewInterface2 recycleViewInterface2){
         this.context = context;
        this.nontechnicals = nontechnicals;
        this.recycleViewInterface2 = recycleViewInterface2;

    }

    @NonNull
    @Override
    public AA_RecycleViewAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_view, parent, false);

        return new AA_RecycleViewAdapter2.MyViewHolder(view, recycleViewInterface2);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecycleViewAdapter2.MyViewHolder holder, int pos) {

        holder.tvName1.setText(nontechnicals.get(pos).getnonTechClubName());
        holder.imageView1.setImageResource(nontechnicals.get(pos).getImage2());
    }

    @Override
    public int getItemCount() {
        return nontechnicals.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView1;
        TextView tvName1;


        public MyViewHolder(@NonNull View itemView, RecycleViewInterface2 recycleViewInterface2) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.imageView1);
            tvName1 = itemView.findViewById(R.id.textView3);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recycleViewInterface2 != null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            recycleViewInterface2.onItemClick(pos);
                        }

                    }
                }
            });
        }
    }
}