package com.example.navigationbarexam.ui.more;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.navigationbarexam.R;

import java.util.List;

public class MoreNotiAdapter extends BaseAdapter {
    private final List<Notification> mData;

    public MoreNotiAdapter(List<Notification> data) {
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
                    .inflate(R.layout.item_noti, viewGroup, false);

            TextView title = view.findViewById(R.id.txt_title);
            TextView contents = view.findViewById(R.id.txt_contents);
            TextView date = view.findViewById(R.id.txt_date);
            holder.title = title;
            holder.contents = contents;
            holder.date = date;
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Notification notification = mData.get(i);
        holder.title.setText(notification.getTitle());
        holder.contents.setText(notification.getContents());
        holder.date.setText(notification.getDate());
        return view;
    }
    static class ViewHolder {
        TextView title;
        TextView contents;
        TextView date;
    }
}
