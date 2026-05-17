// Nama File   : Burung.java
// Deskripsi   : Realisasi class Burung sebagai kelas turunan dari Anabul
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 9 Mei 2026

public class Burung extends Anabul {
    // Atribut

    // Method
    public Burung(String nama, String panggilan) {
        super(nama, panggilan);
    }

    @Override
    public void Gerak() { System.out.println("Terbang"); }

    @Override
    public void Bersuara() { System.out.println("Cuit-cuit!"); }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("Gerakan     : "); this.Gerak();
        System.out.print("Suara       : "); this.Bersuara();
    }
}