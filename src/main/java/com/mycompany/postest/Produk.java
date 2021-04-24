package com.mycompany.postest;

public class Produk {
    private String merk, jenis, fungsi;
    private long harga;

    protected String getMerk() {
        return merk;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected String getJenis() {
        return jenis;
    }

    protected void setJenis(String jenis) {
        this.jenis = jenis;
    }

    protected String getFungsi() {
        return fungsi;
    }

    protected void setFungsi(String fungsi) {
        this.fungsi = fungsi;
    }
    

    protected long getHarga() {
        return harga;
    }

    protected void setHarga(long harga) {
        this.harga = harga;
    }

    public void spesifikasi(){
        System.out.println(this.merk);
        System.out.println(this.jenis);
        System.out.println(this.fungsi);
        System.out.println(this.harga);
    }
}
