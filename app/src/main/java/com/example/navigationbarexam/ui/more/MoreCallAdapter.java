package com.example.navigationbarexam.ui.more;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.navigationbarexam.R;

import java.util.List;

public class MoreCallAdapter extends BaseAdapter {
    private final List<MoreCall> mData;
    public MoreCallAdapter(List<MoreCall> data) {
        mData = data;
    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_more_call, viewGroup, false);
            TextView local = view.findViewById(R.id.txt_more_local);
            TextView call = view.findViewById(R.id.txt_more_call);
            holder.local = local;
            holder.call = call;
        } else {
            holder = (ViewHolder) view.getTag();
        }
        MoreCall moreCall = mData.get(i);
        holder.local.setText(moreCall.getLocal());
        holder.call.setText(moreCall.getCall());
        return view;
    }
    static class ViewHolder {
        TextView local;
        TextView call;
    }
}
