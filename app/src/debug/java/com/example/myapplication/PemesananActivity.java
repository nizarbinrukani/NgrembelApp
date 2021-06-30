package com.example.myapplication;

import android.os.Bundle;

import com.example.myapplication.adapter.MakananAdapter;
import com.example.myapplication.obyek.Makanan;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;

public class PemesananActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MakananAdapter makananAdapter;
    private ArrayList<Makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        recyclerView = findViewById(R.id.rVMakanan);
        makananAdapter = new MakananAdapter(makananArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PemesananActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(makananAdapter);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void getData(){
        makananArrayList = new ArrayList<>();

    }
}