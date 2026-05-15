// Nama File   : Kucing.java
// Deskripsi   : Realisasi class Kucing sebagai kelas turunan dari Anabul untuk realisasi polimorfisme Universal Inclusion
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 21 April 2026

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
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
    }
}