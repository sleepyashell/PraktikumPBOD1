// Nama File   : MGaris.java
// Deskripsi   : berisi program utama untuk menguji class Garis
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 24 Februari 2026

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(2.0, 3.0);
        Titik T2 = new Titik(5.0, 7.0);
        Garis G1 = new Garis(T1, T2);

        System.out.println("Panjang garis G1: " + G1.Panjang());
        System.out.println("Gradien garis G1: " + G1.Gradien());
        System.out.println("Persamaan garis G1: " + G1.getPersamaanGaris());

        Titik titikTengahG1 = G1.titikTengah();
        System.out.println("Titik tengah garis G1: (" + titikTengahG1.getAbsis() + ", " + titikTengahG1.getOrdinat() + ")");

        Garis G2 = new Garis(new Titik(3.0, 4.0), new Titik(6.0, 8.0));
        System.out.println("Apakah garis G1 sejajar dengan garis G2? " + G1.isSejajar(G2));
    }
}