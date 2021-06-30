package com.example.myapplication.ui;

public class Event {
    private String tanggalEvent;
    private String jamEvent;
    private String namaEvent;

    public Event(String tanggalEvent, String jamEvent, String namaEvent){
        this.tanggalEvent = tanggalEvent;
        this.jamEvent = jamEvent;
        this.namaEvent = namaEvent;
    }

    public String getTanggalEvent() {
        return tanggalEvent;
    }

    public void setTanggalEvent(String tanggalEvent) {
        this.tanggalEvent = tanggalEvent;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public String getJamEvent() {
        return jamEvent;
    }

    public void setJamEvent(String jamEvent) {
        this.jamEvent = jamEvent;
    }
}
