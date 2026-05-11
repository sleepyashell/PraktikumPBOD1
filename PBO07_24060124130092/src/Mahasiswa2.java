// Nama File: Mahasiswa2.java
// NIM      : 24060124130092
// Nama     : Syuraih Umar Khotthob
// Tanggal  : 21 April 2026

public class Mahasiswa2 extends CivitasAkademika {
    private String nim;
    private Dosen dosenwali;

    public Mahasiswa2(String nim, String nama) {
        super(nama);
        this.nim = nim;
        this.dosenwali = null;
    }

    public String getNim() { return nim; }

    @Override
    public String getNomor() { return nim; }

    public void setWali(Dosen dosen) {
        this.dosenwali = dosen;
    }

    public Dosen getDosenwali() { return dosenwali; }

    public void tampilDataMahasiswa() {
        System.out.println("  NIM            : " + nim);
        System.out.println("  Nama Mahasiswa : " + nama);
        System.out.println("  Nama Dosenwali : " +
            (dosenwali != null ? dosenwali.getNama() : "Belum ditetapkan"));
    }
}