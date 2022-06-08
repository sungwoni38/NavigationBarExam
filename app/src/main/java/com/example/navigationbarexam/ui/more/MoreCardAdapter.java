package com.example.navigationbarexam.ui.more;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.navigationbarexam.R;

import java.util.List;


public class MoreCardAdapter extends BaseAdapter {
    private final List<MoreCard> mData;
    public MoreCardAdapter(List<MoreCard> data) {
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
                    .inflate(R.layout.item_more_card, viewGroup, false);

            TextView cardQ = view.findViewById(R.id.txt_more_card);
            holder.cardQ = cardQ;
        } else {
            holder = (ViewHolder) view.getTag();
        }
        MoreCard moreCard = mData.get(i);
        holder.cardQ.setText(moreCard.getCardQ());
        return view;
    }
    static class ViewHolder {
        TextView cardQ;
    }
}
