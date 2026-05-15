// Nama File   : CivitasAkademika.java
// Deskripsi   : Realisasi abstract class CivitasAkademika sebagai kelas induk untuk realisasi polimorfisme Universal Inclusion
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 21 April 2026

public abstract class CivitasAkademika {
    protected String Nama;

    public CivitasAkademika(String nama) {
        this.Nama = nama;
    }

    public String getNama() {
        return Nama;
    }

    public abstract String getNomor();
}