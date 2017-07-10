package com.agussuarya.wheaterbdt.Pojo;

import java.util.List;

/**
 * Created by root on 05/07/17.
 */

public class WheaterItem {
    private long dt;
    private String dt_txt;
    private Main main;
    private List<WheaterData> weather;

    public WheaterItem(long dt, String dt_txt, Main main, List<WheaterData> weather) {
        this.dt = dt;
        this.dt_txt = dt_txt;
        this.main = main;
        this.weather = weather;
    }

    public List<WheaterData> getWeather() {
        return weather;
    }

    public void setWeather(List<WheaterData> weather) {
        this.weather = weather;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
