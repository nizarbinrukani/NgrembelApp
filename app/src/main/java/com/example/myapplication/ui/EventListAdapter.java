package com.example.myapplication.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EventListAdapter extends ArrayAdapter<Event> {

    Context mContext;
    int mResource;

    public EventListAdapter(Context context, int resource, ArrayList<Event> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get info event
        String tanggalEvent = getItem(position).getTanggalEvent();
        String jamEvent = getItem(position).getJamEvent();
        String namaEvent = getItem(position).getNamaEvent();

        //Create event object dengan informasi
        Event event = new Event(tanggalEvent, jamEvent, namaEvent);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvTanggal = (TextView) convertView.findViewById(R.id.tvTanggal);
        TextView tvJam = (TextView) convertView.findViewById(R.id.tvJam);
        TextView tvEvent = (TextView) convertView.findViewById(R.id.tvEvent);

        tvTanggal.setText(tanggalEvent);
        tvJam.setText(jamEvent);
        tvEvent.setText(namaEvent);

        return convertView;
    }
}
