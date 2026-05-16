// Nama File   : Anabul.java
// Deskripsi   : Realisasi abstract class Anabul sebagai superclass untuk kelas-kelas anaknya
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 28 April 2026

public abstract class Anabul {
    // Atribut
    protected String Nama;

    // Method
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