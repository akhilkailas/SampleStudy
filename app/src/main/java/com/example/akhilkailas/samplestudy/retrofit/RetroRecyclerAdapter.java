package com.example.akhilkailas.samplestudy.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.akhilkailas.samplestudy.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class RetroRecyclerAdapter extends RecyclerView.Adapter<RetroRecyclerAdapter.MyViewHolder>{
    private Context mContext;
    private List<DataModel> mDataList;

    public RetroRecyclerAdapter(Context mContext, List<DataModel> mDataList) {
        this.mContext = mContext;
        this.mDataList = mDataList;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvId,tvTitle,tvBody;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tv_id_retro);
            tvBody = itemView.findViewById(R.id.tv_desc_retro);
            tvTitle = itemView.findViewById(R.id.tv_title_retro);
        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_card_retro,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tvId.setText(mDataList.get(i).getmId().toString());
        myViewHolder.tvTitle.setText(mDataList.get(i).getmTitle());
        myViewHolder.tvBody.setText(mDataList.get(i).getmBody());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
