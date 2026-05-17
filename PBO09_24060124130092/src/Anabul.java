// Nama File   : Anabul.java
// Deskripsi   : Realisasi abstract class Anabul, ditambahkan atribut panggilan untuk Prak09 Koleksi
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 9 Mei 2026

public abstract class Anabul {
    // Atribut
    protected String Nama;
    protected String Panggilan;

    // Method
    public Anabul(String nama, String panggilan) {
        this.Nama = nama;
        this.Panggilan = panggilan;
    }

    public abstract void Gerak();
    public abstract void Bersuara();

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getPanggilan() {
        return Panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.Panggilan = panggilan;
    }

    public void printInfo() {
        System.out.println("Nama Anabul : " + Nama);
        System.out.println("Panggilan   : " + Panggilan);
    }
}