package com.example.navigationbarexam.ui.more;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.navigationbarexam.R;

import java.util.List;

public class MoreShopAdapter extends BaseAdapter {
    private final List<MoreShop> mData;
    public MoreShopAdapter(List<MoreShop> data){
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
       MoreShopAdapter.ViewHolder holder;
        if(view == null) {
            holder = new MoreShopAdapter.ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_more_shop, viewGroup, false);

            TextView shopQ = view.findViewById(R.id.txt_more_shop);
            holder.shopQ = shopQ;
        } else {
            holder = (MoreShopAdapter.ViewHolder) view.getTag();
        }
        MoreShop moreShop = mData.get(i);
        holder.shopQ.setText(moreShop.getShopQ());
        return view;
    }
    static class ViewHolder {
        TextView shopQ;
    }
}
