// Nama File: CivitasAkademika.java
// NIM      : 24060124130092
// Nama     : Syuraih Umar Khotthob
// Tanggal  : 21 April 2026

public abstract class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}