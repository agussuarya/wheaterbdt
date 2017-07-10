package com.agussuarya.wheaterbdt.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.agussuarya.wheaterbdt.Pojo.WheaterItem;
import com.agussuarya.wheaterbdt.R;

/**
 * Created by root on 05/07/17.
 */

public class WheaterViewHolder extends RecyclerView.ViewHolder {

    private TextView time, mak, min, cuaca;

    public WheaterViewHolder(View itemView) {
        super(itemView);

        cuaca = (TextView)itemView.findViewById(R.id.tvCuaca);
        time = (TextView)itemView.findViewById(R.id.tvTime);
        mak = (TextView)itemView.findViewById(R.id.tvMinTemp);
        min = (TextView)itemView.findViewById(R.id.tvMaxTemp);
    }

    public void bind(WheaterItem data) {
        cuaca.setText(data.getWeather().get(0).getMain());
        time.setText(data.getDt_txt());
        min.setText(String.valueOf(data.getMain().getTemp_min()));
        mak.setText(String.valueOf(data.getMain().getTemp_max()));

        min.setText(
                data.getMain().getRedableTemp(data.getMain().getTemp_min())
        );
        mak.setText(
                data.getMain().getRedableTemp(data.getMain().getTemp_max())
        );

    }
}
