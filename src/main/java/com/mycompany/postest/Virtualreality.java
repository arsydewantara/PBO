package com.mycompany.postest;

public class Virtualreality extends Produk {
    private String merk, jenis, fungsi;
    private long harga;
    private static int jumlahvr;
    
    public Virtualreality(String jenis, String merk, String fungsi, long harga){
        this.merk = merk;
        this.jenis = jenis;
        this.fungsi = fungsi;
        this.harga = harga;
        Virtualreality.jumlahvr++;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getFungsi() {
        return fungsi;
    }

    public void setFungsi(String fungsi) {
        this.fungsi = fungsi;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public static int getJumlahvr() {
        return jumlahvr;
    }

    public static void setJumlahvr(int jumlahvr) {
        Virtualreality.jumlahvr = jumlahvr;
    }
    

    
    
    @Override
    public void spesifikasi() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Merk: " + merk);
        System.out.println("Fungsi: " + fungsi);
        System.out.println("Harga VR: Rp." + harga);
    }
}
    

