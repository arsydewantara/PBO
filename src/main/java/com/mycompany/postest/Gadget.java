package com.mycompany.postest;

public class Gadget extends Produk {
    private String merk, jenis, fungsi;
    private long harga;
    private static int jumlahgadget;
   
    
    public Gadget(String jenis, String merk, String fungsi, long harga){
        this.merk = merk;
        this.jenis = jenis;
        this.fungsi = fungsi;
        this.harga = harga;
        Gadget.jumlahgadget++;
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

    public static int getJumlahadget() {
        return jumlahgadget;
    }

    public static void setJumlahgadget(int jumlahgadget) {
        Gadget.jumlahgadget = jumlahgadget;
    }
    
    
    
    
   
    @Override
    public void spesifikasi(){
        System.out.println("Jenis: " + jenis);
        System.out.println("Merk Gadget: " + merk);
        System.out.println("Fungsi: " + fungsi);        
        System.out.println("Harga Gadget: Rp." + harga);    
    }
}

   