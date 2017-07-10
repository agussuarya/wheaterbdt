package com.agussuarya.wheaterbdt.Pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 05/07/17.
 */

public class WheaterData {

    private int id;
    private String main;

    public WheaterData(int id, String main) {
        this.id = id;
        this.main = main;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }
}
