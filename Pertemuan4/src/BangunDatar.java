// Nama File   : BangunDatar.java
// Deskripsi   : Realisasi class BangunDatar sebagai contoh untuk Inheritance (pewarisan) dalam Java
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

// public class BangunDatar {
//     private int jmlSisi;
//     private String warna;
//     private String border;
//     private static int counterBangunDatar = 0;

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

// final public class BangunDatar {
//     protected int jmlSisi;
//     protected String warna;
//     protected String border;
//     protected static int counterBangunDatar = 0;

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // final public void printInfo() {
    //     System.out.println("Jumlah Sisi: " + jmlSisi);
    //     System.out.println("Warna: " + warna);
    //     System.out.println("Border: " + border);
    // }
}