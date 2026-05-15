// Nama File   : Dosen.java
// Deskripsi   : Realisasi class Dosen sebagai kelas turunan dari CivitasAkademika untuk realisasi polimorfisme Universal Inclusion
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 21 April 2026

public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String nip, String nama) {
        super(nama);
        this.NIP = nip;
    }

    public String getNIP() {
        return NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}