// Nama File   : Burung.java
// Deskripsi   : Realisasi class Burung sebagai kelas turunan dari Anabul untuk realisasi polimorfisme Universal Inclusion
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 21 April 2026

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("Cuit-cuit!");
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