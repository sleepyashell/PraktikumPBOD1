// Nama File   : Anabul.java
// Deskripsi   : Realisasi abstract class Anabul sebagai kelas induk untuk realisasi polimorfisme Universal Inclusion
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 21 April 2026

public abstract class Anabul {
    protected String Nama;

    public Anabul(String nama) {
        this.Nama = nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void printInfo() {
        System.out.println("Nama Anabul: " + Nama);
    }
}