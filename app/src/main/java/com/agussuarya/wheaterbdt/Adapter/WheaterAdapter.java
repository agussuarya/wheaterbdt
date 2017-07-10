package com.agussuarya.wheaterbdt.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agussuarya.wheaterbdt.Pojo.WheaterItem;
import com.agussuarya.wheaterbdt.R;
import com.agussuarya.wheaterbdt.ViewHolder.WheaterViewHolder;

import java.util.List;

/**
 * Created by root on 05/07/17.
 */

public class WheaterAdapter extends RecyclerView.Adapter<WheaterViewHolder>{
    private List<WheaterItem> list;

    public WheaterAdapter(List<WheaterItem> list) {
        this.list = list;
    }

    @Override
    public WheaterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_wheater, parent, false);
        return new WheaterViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(WheaterViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}
