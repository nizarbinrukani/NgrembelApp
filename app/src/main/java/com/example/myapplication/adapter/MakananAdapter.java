package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.actor.Pembeli;
import com.example.myapplication.obyek.Makanan;

import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakanananViewHolder> {
    private Context mCtx;
    private ArrayList<Makanan> listMakanan;
    public MakananAdapter(Context mCtx,ArrayList<Makanan> listMakanan){
        this.mCtx=mCtx;
        this.listMakanan=listMakanan;
    }

    @NonNull
    @Override
    public MakananAdapter.MakanananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_menu, parent, false);
        return new MakanananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakanananViewHolder holder, int position) {

        Glide.with(mCtx)
                .load(listMakanan.get(position).getGambarMakanan())
                .into(holder.gambarMakanan);
        holder.namaMakanan.setText(listMakanan.get(position).getNamaMakanan());
        holder.hargaMakanan.setText("Rp "+listMakanan.get(position).getHargaMakanan());

    }

    @Override
    public int getItemCount() {
        return (listMakanan != null) ? listMakanan.size() : 0;
    }

    public class MakanananViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarMakanan;
        TextView namaMakanan, hargaMakanan;

        public MakanananViewHolder(View view){
            super(view);

            gambarMakanan = view.findViewById(R.id.imageView5);
            namaMakanan = view.findViewById(R.id.textView6);
            hargaMakanan = view.findViewById(R.id.textView9);
        }
    }
}
