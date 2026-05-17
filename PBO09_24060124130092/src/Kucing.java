// Nama File   : Kucing.java
// Deskripsi   : Realisasi class Kucing sebagai kelas turunan dari Anabul
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 9 Mei 2026

public class Kucing extends Anabul {
    // Atribut
    protected double bobot;

    // Method
    public Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
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
        System.out.print("Gerakan     : ");
        this.Gerak();
        System.out.print("Suara       : ");
        this.Bersuara();
        System.out.println("Bobot       : " + this.bobot + " kg");
    }
}