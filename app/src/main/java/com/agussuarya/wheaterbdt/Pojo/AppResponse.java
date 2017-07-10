package com.agussuarya.wheaterbdt.Pojo;

import java.util.List;

/**
 * Created by root on 05/07/17.
 */

public class AppResponse {

    String cod;
    List<WheaterItem> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public List<WheaterItem> getList() {
        return list;
    }

    public void setList(List<WheaterItem> list) {
        this.list = list;
    }

    public AppResponse(String cod, List<WheaterItem> list) {
        this.cod = cod;
        this.list = list;

    }
}
