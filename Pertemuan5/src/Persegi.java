// Nama File   : Persegi.java
// Deskripsi   : Realisasi class Persegi yang merupakan subclass dari BangunDatar
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 17 Maret 2026

public class Persegi extends BangunDatar implements IResize {
    /***************** ATRIBUT *****************/
    private double sisi;

    /***************** METHOD *****************/
    public Persegi() {
        setJmlSisi(4);
    }

    // public Persegi(double sisi, String warna, String border) {
    // super(4, warna, border);
    // this.sisi = sisi;
    // }

    public Persegi(double sisi, String warna, String border) {
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // @Override
    // public void printInfo() {
    //     System.out.println("Jumlah sisi: " + getJmlSisi());
    //     System.out.println("Warna: " + getWarna());
    //     System.out.println("Border: " + getBorder());
    //     System.out.println("Sisi: " + sisi);
    // }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public static void printCounterBangunDatar() {
    // System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    // } // override method

    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }
}