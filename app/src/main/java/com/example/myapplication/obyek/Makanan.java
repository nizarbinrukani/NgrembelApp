package com.example.myapplication.obyek;


import java.math.BigInteger;
import java.util.ArrayList;

public class Makanan {
    private String idMakanan;
    private String namaMakanan;
    private BigInteger hargaMakanan;
    private String detailMakanan;
    private String gambarMakanan;

    public Makanan(String idMakanan, String namaMakanan, BigInteger hargaMakanan, String detailMakanan, String gambarMakanan) {
        this.idMakanan = idMakanan;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.detailMakanan = detailMakanan;
        this.gambarMakanan = gambarMakanan;
    }

    public String getIdMakanan() {
        return idMakanan;
    }

    public void setIdMakanan(String idMakanan) {
        this.idMakanan = idMakanan;
    }

    public BigInteger getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(BigInteger hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public String getGambarMakanan() {
        return gambarMakanan;
    }

    public void setGambarMakanan(String gambarMakanan) {
        this.gambarMakanan = gambarMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDetailMakanan() {
        return detailMakanan;
    }

    public void setDetailMakanan(String detailMakanan) {
        this.detailMakanan = detailMakanan;
    }


}
