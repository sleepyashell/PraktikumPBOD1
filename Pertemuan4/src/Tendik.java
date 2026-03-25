// Nama File   : Tendik.java
// Deskripsi   : Realisasi class Tendik sebagai class child dari class Pegawai
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

import java.time.LocalDate;
import java.time.Period;

class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        double tunjangan = 0.01 * masaKerja.getYears() * gajiPokok;

        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun(BUP)));
        System.out.printf("Gaji Pokok      : Rp. %,.2f\n", gajiPokok);
        System.out.printf("Tunjangan       : 1%% x %d x Rp. %,.2f = Rp. %,.2f\n", masaKerja.getYears(), gajiPokok, tunjangan);
        System.out.println("--------------------------------------------------");
    }
}