package com.mycompany.postest;

public class Main {
    public static void main(String[] args){
        Virtualreality virtualreality1 = new Virtualreality(
        "High-Level Virtual Reality",
        "Occulus Rift",
        "Menampilkan gambar hasil simulasi dari komputer",
        7000000);
        Virtualreality virtualreality2 = new Virtualreality(
        "Virtual Mobile Theater",
        "Sony HMZ-T1",
        "Memberikan Sensasi mengagumkan pada pengguna saat menonton film",
        9600000);
        Virtualreality virtualreality3 = new Virtualreality(
        "Entry-Level Mobile VR",
        "Cardboard Mobile VR",
        "Digunakan untuk bermain game berbasis smartphone Android hingga melihat foto dan video 360 derajat",
        200000);
        
        Gadget gadget1 = new Gadget(
        "18W Fast Charging",
        "BLAVOR 20.000mAh Portable Charger",
        "Untuk mengisi daya Baterai Smartphone",
        630000);
        Gadget gadget2 = new Gadget(
        "Pin, Smartlock",
        "Samsung Smart Door Lock",
        "Mengunci pintu melalui perangkat elektronik",
        2100000);
        
       
    virtualreality1.spesifikasi();
    System.out.println(" ");
    virtualreality2.spesifikasi();
    System.out.println(" ");
    virtualreality3.spesifikasi();
    System.out.println("Jumlah Barang: " + Virtualreality.getJumlahvr() );
    System.out.println("-----------------------------");
    gadget1.spesifikasi();
    System.out.println(" ");
    gadget2.spesifikasi();
    System.out.println("Jumlah Barang: " + Gadget.getJumlahadget());
    }
}
