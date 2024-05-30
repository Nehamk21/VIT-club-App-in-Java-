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

public class AA_RecycleViewAdapter extends RecyclerView.Adapter<AA_RecycleViewAdapter.MyViewHolder> {

    private final RecycleViewInterface recycleViewInterface;
      Context context;
      ArrayList<technical> technicals;

    public AA_RecycleViewAdapter(Context context, ArrayList<technical> technicals,
                                 RecycleViewInterface recycleViewInterface){
        this.context = context;
        this.technicals = technicals;
        this.recycleViewInterface = recycleViewInterface;

    }

    @NonNull
    @Override
    public AA_RecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_view_row, parent, false);

        return new AA_RecycleViewAdapter.MyViewHolder(view, recycleViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecycleViewAdapter.MyViewHolder holder, int position) {

        holder.tvName.setText(technicals.get(position).getTechClubName());
        holder.imageView.setImageResource(technicals.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return technicals.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvName;


        public MyViewHolder(@NonNull View itemView, RecycleViewInterface recycleViewInterface) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView4);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recycleViewInterface != null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            recycleViewInterface.onItemClick(pos);
                        }

                    }
                }
            });
        }
    }
}
