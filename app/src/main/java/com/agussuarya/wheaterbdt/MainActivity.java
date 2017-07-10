package com.agussuarya.wheaterbdt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.agussuarya.wheaterbdt.Adapter.WheaterAdapter;
import com.agussuarya.wheaterbdt.Pojo.AppResponse;
import com.agussuarya.wheaterbdt.Pojo.WheaterItem;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.w3c.dom.ls.LSException;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private WheaterAdapter adapter;
    private List<WheaterItem> wheaterItems;
    Gson gson = new Gson();
    private AppResponse appResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView)findViewById(R.id.rv);
        loadData();
    }

    private void loadData() {
        String URL = "http://api.openweathermap.org/data/2.5/forecast?q=denpasar&mode=json&appid=f7a65fe6c5aab438c801017a32b8e636";
        RequestQueue q = Volley.newRequestQueue(this);
        StringRequest sr = new StringRequest(
                Request.Method.GET,
                URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.i("Response", response);
                        appResponse = gson.fromJson(response, AppResponse.class);
                        if(appResponse!=null) {
                            setupRv();
                        } else {
                            Toast.makeText(MainActivity.this, "gagal", Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                }
        );

        q.add(sr);
    }

    private void setupRv() {
        adapter = new WheaterAdapter(appResponse.getList());
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}
