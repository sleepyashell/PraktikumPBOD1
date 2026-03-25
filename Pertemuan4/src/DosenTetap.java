// Nama File   : DosenTetap.java
// Deskripsi   : Realisasi class DosenTetap sebagai class child dari class Dosen
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

import java.time.LocalDate;
import java.time.Period;

class DosenTetap extends Dosen {
    /***************** ATRIBUT *****************/
    private String nidn;
    private final int BUP = 65;

    /***************** METHOD *****************/
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
            String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        double tunjangan = 0.02 * masaKerja.getYears() * gajiPokok;

        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun(BUP)));
        System.out.printf("Gaji Pokok      : Rp. %,.2f\n", gajiPokok);
        System.out.printf("Tunjangan       : 2%% x %d x Rp. %,.2f = Rp. %,.2f\n", masaKerja.getYears(), gajiPokok,
                tunjangan);
        System.out.println("--------------------------------------------------");
    }
}