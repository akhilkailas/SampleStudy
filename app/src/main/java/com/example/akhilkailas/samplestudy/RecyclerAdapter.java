package com.example.akhilkailas.samplestudy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> implements View.OnClickListener {
    ArrayList<String> data;
    Context mContext;

    @Override
    public void onClick(View v) {
        Toast.makeText(mContext, "", Toast.LENGTH_SHORT).show();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvRecy;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRecy = (TextView) itemView.findViewById(R.id.tv_recycler);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int item = getLayoutPosition();
                    Toast.makeText(mContext, "" + data.get(item), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public RecyclerAdapter(Context context, ArrayList<String> dataList) {
        this.data = dataList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_content, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        myViewHolder.tvRecy.setText(data.get(i));
    }

    @Override
    public int getItemCount() {

        return data.size();
    }
}
