// Nama File   : main.java
// Deskripsi   : Program utama untuk menjalankan contoh inheritance (pewarisan) dalam Java
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 17 Maret 2026

public class MAbstract {
    public static void main(String[] args) {
    // BangunDatar B1 = new BangunDatar();
    BangunDatar P1 = new Persegi(10, "Merah", "Solid");
    Persegi P2 = new Persegi(5, "Biru", "Dotted");
    BangunDatar L1 = new Lingkaran(7, "Hijau", "Dashed");
    Lingkaran L2 = new Lingkaran(3, "Kuning", "Double");

    System.out.println("Apakah luas P1 sama dengan luas P2? " + P1.isEqualLuas(P2));
    System.out.println("Apakah luas L1 sama dengan luas L2? " + L1.isEqualLuas(L2));

    System.out.println("Melakukan zoom in pada P1...");
    P1.zoomIn();
    System.out.println("Luas P1 setelah zoom in: " + P1.getLuas());
    }
}