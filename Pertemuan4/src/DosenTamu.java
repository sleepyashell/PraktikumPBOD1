// Nama File   : DosenTamu.java
// Deskripsi   : Realisasi class DosenTamu sebagai class child dari class Dosen
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

import java.time.LocalDate;
import java.time.Period;

class DosenTamu extends Dosen {
    /***************** ATRIBUT *****************/
    private String nidk;
    private LocalDate tglBerakhirKontrak;

    /***************** METHOD *****************/
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
            String fakultas, LocalDate tglBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    @Override
    public void printInfo() {
        Period sisaKontrak = Period.between(LocalDate.now(), tglBerakhirKontrak);
        double tunjangan = 0.025 * gajiPokok;

        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Sisa Kontrak    : " + sisaKontrak.getYears() * 12 + sisaKontrak.getMonths() + " bulan");
        System.out.printf("Gaji Pokok      : Rp. %,.2f\n", gajiPokok);
        System.out.printf("Tunjangan       : 2,5%% x Rp. %,.2f = Rp. %,.2f\n", gajiPokok, tunjangan);
        System.out.println("--------------------------------------------------");
    }
}