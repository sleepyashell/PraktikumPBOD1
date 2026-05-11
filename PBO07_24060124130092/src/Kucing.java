// Nama File: Kucing.java
// NIM      : 24060124130092
// Nama     : Syuraih Umar Khotthob
// Tanggal  : 21 April 2026

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meong!");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak: Melata di tanah.");
    }
}