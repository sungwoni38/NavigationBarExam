package com.example.navigationbarexam.ui.like;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationbarexam.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LikeRecyclerAdapter extends RecyclerView.Adapter<LikeRecyclerAdapter.ViewHolder>{
    private final List<LikeCardItem> mDataList;

    public LikeRecyclerAdapter(List<LikeCardItem> dataList) {
        mDataList = dataList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.item_cardview, parent, false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LikeCardItem item = mDataList.get(position);
        holder.txt_name.setText(item.getName());
        holder.txt_call.setText(item.getCall());
        holder.txt_add.setText(item.getAdd());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_name, txt_call, txt_add;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_call = itemView.findViewById(R.id.txt_call);
            txt_add = itemView.findViewById(R.id.txt_add);
        }
    }
}
