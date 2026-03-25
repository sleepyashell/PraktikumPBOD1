// Nama File   : Pegawai.java
// Deskripsi   : Realisasi class Pegawai sebagai class parent untuk class Dosen dan class Tendik 
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

abstract class Pegawai {
    /***************** ATRIBUT *****************/
    String nip;
    String nama;
    LocalDate tanggalLahir;
    LocalDate tmt;
    double gajiPokok;

    /***************** METHOD *****************/
    public Pegawai() {
        this.nip = "#";
        this.nama = "#";
        this.tanggalLahir = null;
        this.tmt = null;
        this.gajiPokok = 0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() { 
        return nip; 
    }
    
    public String getNama() { 
        return nama; 
    }
    
    public LocalDate getTanggalLahir() { 
        return tanggalLahir; 
    }
    
    public LocalDate getTmt() { 
        return tmt; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }
    
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setTanggalLahir(LocalDate tanggalLahir) { 
        this.tanggalLahir = tanggalLahir; 
    }

    public void setTmt(LocalDate tmt) { 
        this.tmt = tmt; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    protected Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    protected String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
    }

    protected LocalDate hitungTanggalPensiun(int bupTahun) {
        LocalDate pensiun = tanggalLahir.plusYears(bupTahun);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    public abstract void printInfo();
}