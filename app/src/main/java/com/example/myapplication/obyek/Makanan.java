package com.example.myapplication.obyek;

public class Makanan {
    private String gambarMakanan;
    private String namaMakanan;
    private String hargaMakanan;
    private String detailMakanan;

    public Makanan(String gambarMakanan, String namaMakanan, String hargaMakanan, String detailMakanan) {
        this.gambarMakanan = gambarMakanan;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.detailMakanan = detailMakanan;
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

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public String getDetailMakanan() {
        return detailMakanan;
    }

    public void setDetailMakanan(String detailMakanan) {
        this.detailMakanan = detailMakanan;
    }
}
