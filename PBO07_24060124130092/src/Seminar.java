// Nama File   : Seminar.java
// Deskripsi   : Realisasi class Seminar untuk realisasi polimorfisme Universal Inclusion dengan CivitasAkademika sebagai tipe data peserta
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 21 April 2026

public class Seminar {
    private static final int kapasitas = 100;
    private CivitasAkademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        this.pesertas = new CivitasAkademika[kapasitas];
        this.banyakpeserta = 0;
    }

    public int countPeserta() {
        return this.banyakpeserta;
    }

    public void registrasi(CivitasAkademika peserta) {
        if (this.banyakpeserta < kapasitas) {
            this.pesertas[this.banyakpeserta] = peserta;
            this.banyakpeserta++;
            System.out.println("Berhasil mendaftar: " + peserta.getNama());
        } else {
            System.out.println("Kapasitas penuh! " + peserta.getNama() + " tidak bisa daftar.");
        }
    }

    public void tampilPeserta() {
        System.out.println("=== Daftar Peserta Seminar ===");
        for (int i = 0; i < this.banyakpeserta; i++) {
            System.out.println((i + 1) + ". [" + this.pesertas[i].getNomor() + "] " + this.pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < this.banyakpeserta; i++) {
            if (this.pesertas[i] instanceof Mahasiswa2)
                count++;
        }
        return count;
    }
}