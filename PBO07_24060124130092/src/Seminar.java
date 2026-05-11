// Nama File: Seminar.java
// NIM      : 24060124130092
// Nama     : Syuraih Umar Khotthob
// Tanggal  : 21 April 2026

public class Seminar {
    private static final int kapasitas = 100;
    private CivitasAkademika[] peserta;
    private int banyakpeserta;

    public Seminar() {
        peserta = new CivitasAkademika[kapasitas];
        banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(CivitasAkademika p) {
        if (banyakpeserta < kapasitas) {
            peserta[banyakpeserta] = p;
            banyakpeserta++;
            System.out.println("Berhasil mendaftar: " + p.getNama());
        } else {
            System.out.println("Kapasitas penuh! " + p.getNama() + " tidak bisa daftar.");
        }
    }

    // 4g - tampilPeserta
    public void tampilPeserta() {
        System.out.println("=== Daftar Peserta Seminar ===");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". [" + peserta[i].getNomor() + "] " + peserta[i].getNama());
        }
    }

    // 4h - countMahasiswa (instanceof)
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (peserta[i] instanceof Mahasiswa2)
                count++;
        }
        return count;
    }
}