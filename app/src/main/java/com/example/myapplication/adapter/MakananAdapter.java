package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.actor.Pembeli;
import com.example.myapplication.obyek.Makanan;

import java.io.InputStream;
import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakanananViewHolder> {
    private ArrayList<Makanan> listMakanan;
    public MakananAdapter(ArrayList<Makanan> listMakanan){
        this.listMakanan=listMakanan;
    }

    @NonNull
    @Override
    public MakananAdapter.MakanananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_menu, parent, false);
        return new MakanananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakanananViewHolder holder, int position) {

        //holder.gambarMakanan.setImageResource(listMakanan.get(position).getGambarMakanan());
        holder.namaMakanan.setText(listMakanan.get(position).getNamaMakanan());
        holder.hargaMakanan.setText(listMakanan.get(position).getHargaMakanan());

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
