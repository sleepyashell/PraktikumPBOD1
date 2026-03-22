// Nama File   : Lingkaran.java
// Deskripsi   : Realisasi class Lingkaran yang merupakan subclass dari BangunDatar
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 17 Maret 2026

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public double getDiameter() {
        return 2 * jari;
    }

    // @Override
    // public void printInfo() {
    //      System.out.println("Jumlah sisi: " + getJmlSisi());
    //      System.out.println("Warna: " + getWarna());
    //      System.out.println("Border: " + getBorder());
    //      System.out.println("Jari: " + jari);
    // }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
    }

    // @Override
    // public static void printCounterBangunDatar() {
    // System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    // } // override method

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
}