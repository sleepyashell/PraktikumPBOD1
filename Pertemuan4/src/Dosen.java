// Nama File   : Dosen.java
// Deskripsi   : Realisasi class Dosen sebagai class child dari class Pegawai
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

import java.time.LocalDate;

abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}