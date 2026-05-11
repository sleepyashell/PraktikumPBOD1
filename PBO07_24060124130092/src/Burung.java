// Nama File: Burung.java
// NIM      : 24060124130092
// Nama     : Syuraih Umar Khotthob
// Tanggal  : 21 April 2026

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) bersuara: Cuit-cuit!");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Burung) bergerak: Terbang di udara.");
    }
}