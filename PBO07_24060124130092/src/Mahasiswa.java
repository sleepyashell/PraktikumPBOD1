// Nama File   : Mahasiswa.java
// Deskripsi   : Realisasi class Mahasiswa untuk realisasi polimorfisme ad hoc overloading
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 21 April 2026

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String programStudi;

    public Mahasiswa() {
        NIM = "-999";
        Nama = "n/a";
        programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programstudi) {
        this.NIM = nim;
        this.Nama = nama;
        this.programStudi = programstudi;
    }

    public Mahasiswa(Mahasiswa lain) {
        this.NIM = lain.NIM;
        this.Nama = lain.Nama;
        this.programStudi = lain.programStudi;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa lain) {
        this.programStudi = lain.programStudi;
    }

    public void printInfo() {
        System.out.println("NIM          : " + this.getNIM());
        System.out.println("Nama         : " + this.getNama());
        System.out.println("Program Studi: " + this.getProgramStudi());
    }
}