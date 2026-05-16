// Nama File   : Kucing.java
// Deskripsi   : Realisasi class Kucing sebagai kelas turunan dari Anabul untuk realisasi polimorfisme Universal Inclusion
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 28 April 2026

public class Kucing extends Anabul {
    // Atribut
    protected double bobot;

    // Method
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    double getBobot() {
        return this.bobot;
    }

    void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meong!");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gerakan : ");
        this.Gerak();
        System.out.println("Suara   : ");
        this.Bersuara();
        System.out.println("Bobot   : " + this.getBobot() + " kg");
    }
}