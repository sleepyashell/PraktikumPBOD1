// Nama File   : Anjing.java
// Deskripsi   : Realisasi class Anjing sebagai kelas turunan dari Anabul
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 9 Mei 2026

public class Anjing extends Anabul {
    // Atribut

    // Method
    public Anjing(String nama, String panggilan) {
        super(nama, panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Guk-guk!");
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