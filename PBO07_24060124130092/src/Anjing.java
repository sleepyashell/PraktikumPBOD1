// Nama File: Anjing.java
// NIM      : 24060124130092
// Nama     : Syuraih Umar Khotthob
// Tanggal  : 21 April 2026

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anjing) bersuara: Guk-guk!");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Anjing) bergerak: Melata di tanah.");
    }
}