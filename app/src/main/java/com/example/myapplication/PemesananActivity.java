package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.adapter.MakananAdapter;
import com.example.myapplication.obyek.Makanan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigInteger;
import java.util.ArrayList;

public class PemesananActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MakananAdapter makananAdapter;
    private ArrayList<Makanan> makananArrayList;
    private static final String Makanan_URL = "http://192.168.43.164/API.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        recyclerView = findViewById(R.id.rVMakanan);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PemesananActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        makananArrayList = new ArrayList<>();
        showMakanan();
    }

    public void showMakanan(){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, Makanan_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //converting the string to json array object
                            JSONArray array = new JSONArray(response);

                            //traversing through all the object
                            for (int i = 0; i < array.length(); i++) {

                                //getting product object from json array
                                JSONObject makanan = array.getJSONObject(i);
                                BigInteger harga = new BigInteger(makanan.getString("harga"));

                                //adding the product to product list
                                makananArrayList.add(new Makanan(
                                        makanan.getString("id"),
                                        makanan.getString("nama"),
                                        harga,
                                        makanan.getString("detail"),
                                        makanan.getString("gambar")
                                ));
                            }

                            //creating adapter object and setting it to recyclerview
                            MakananAdapter adapter = new MakananAdapter(PemesananActivity.this,makananArrayList);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }
}