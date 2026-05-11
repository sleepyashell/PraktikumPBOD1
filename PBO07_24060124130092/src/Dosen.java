// Nama File: Dosen.java
// NIM      : 24060124130092
// Nama     : Syuraih Umar Khotthob
// Tanggal  : 21 April 2026

public class Dosen extends CivitasAkademika {
    private String nip;

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}