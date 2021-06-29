package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Informasi extends AppCompatActivity {
    TextView textView;
    String Scroll="Ngrembel Asri Semarang merupakan salah satu tempat rekreasi/ wisata keluarga Semarang yang terletak di Jalan Raya Manyaran – Gunung Pati. Dengan area seluas 3 hektar Ngrembel Asri menyediakan fasilitas – fasilitas rekreasi yang menarik seperti Paint Ball serta Taman Dino.\n" +
            "\n" +
            "Taman Dino merupakan areal rekreasi yang dihiasi oleh patung – patung Dinosaurus. Di dalam Taman Dino dapat anda temukan berbagai jenis sarana rekreasi, di antaranya Kolam renang, Target Shooting dan berkuda, Flying Fox, juga Paint Ball yang merupakan suatu permainan simulasi perang dengan menggunakan replica senjata api berpeluru yang berisikan cat yang aman bagi manusia dan lingkungan (non toxic). Jenis jenis permainan lainnya yaitu ATV, Target Shooting, Taman Sesat, Paint Ball, Out Bound, Mini Boat, Mini Bonbin, Kolam Renang, Berkuda, Bungee Trampolin, Canopy, Climbing Wall, Floating Ball, Floating Silinder, Flying Fox, Kolam Pancing, Kolam Pasir serta Kampung Anggrek.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);
        textView=findViewById(R.id.wikiNgrembel);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(Scroll);

        ListView mListView = (ListView) findViewById(R.id.listviewEvent);

        //Create event object
        Event acara1 = new Event("29-06-2021", "13:00", "Kunjungan Walikota Semarang");
        Event acara2 = new Event("30-06-2021", "13:00", "Kunjungan Gubernur Jawa Tengah");
        Event acara3 = new Event("01-07-2021", "13:00", "Kunjungan Presiden Republik Indonesia");
        Event acara4 = new Event("02-07-2021", "13:00", "Rombongan Rekreasi Karyawan Kimia Farma");
        Event acara5 = new Event("03-07-2021", "13:00", "Rombongan Rekreasi Karyawan UDINUS");
        Event acara6 = new Event("04-07-2021", "13:00", "Rombongan Rekreasi Karyawan Telkom Semarang");

        //Create event object to array
        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(acara1);
        eventList.add(acara2);
        eventList.add(acara3);
        eventList.add(acara4);
        eventList.add(acara5);
        eventList.add(acara6);

        EventListAdapter adapter = new EventListAdapter(this, R.layout.adapter_view_layout, eventList);
        mListView.setAdapter(adapter);
    }
}