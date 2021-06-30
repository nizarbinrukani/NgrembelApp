package com.example.myapplication.actor;

import androidx.recyclerview.widget.RecyclerView;

public class Pembeli {
    private String userName;
    private String namaLengkap;
    private String email;
    private String noTelepon;
    private String passwword;

    public Pembeli(String userName, String namaLengkap, String email, String noTelepon, String passwword) {
        this.userName = userName;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.noTelepon = noTelepon;
        this.passwword = passwword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getPasswword() {
        return passwword;
    }

    public void setPasswword(String passwword) {
        this.passwword = passwword;
    }


}
