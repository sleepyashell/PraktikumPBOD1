// Nama File   : Mahasiswa2.java
// Deskripsi   : Realisasi class Mahasiswa2 sebagai kelas turunan dari CivitasAkademika untuk realisasi polimorfisme Universal Inclusion
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 21 April 2026

public class Mahasiswa2 extends CivitasAkademika {
    private String NIM;
    private Dosen Dosenwali;

    public Mahasiswa2(String nim, String nama) {
        super(nama);
        this.NIM = nim;
        this.Dosenwali = null;
    }

    @Override
    public String getNomor() {
        return this.NIM;
    }

    public Dosen getDosenwali() {
        return Dosenwali;
    }

    public void setWali(Dosen dosen) {
        this.Dosenwali = dosen;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM            : " + this.getNomor());
        System.out.println("Nama Mahasiswa : " + this.getNama());
        System.out.println("Nama Dosenwali : " +
                (Dosenwali != null ? Dosenwali.getNama() : "Belum ditetapkan"));
    }
}