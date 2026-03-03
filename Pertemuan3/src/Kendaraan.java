// Nama File   : Kendaraan.java
// Deskripsi   : berisi atribut dan method dalam class Kendaraan
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 03 Maret 2026

public class Kendaraan {
    /***************** ATRIBUT *****************/
    private String noPlat;
    private String Jenis;

    /***************** METHOD *****************/
    // Konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = "???";
        Jenis = "???";
    }

    // Konstruktor dengan parameter noplat untuk atribut noPlat dan jenis untuk atribut Jenis 
    public Kendaraan(String noplat, String jenis) {
        noPlat = noplat;
        Jenis = jenis;
    }

    // mengembalikan nilai atribut noPlat
    public String getNoPlat() {
        return noPlat;
    }

    // mengembalikan nilai atribut Jenis
    public String getJenis() {
        return Jenis;
    }

    // mengeset nilai atribut noPlat
    public void setNoPlat(String noplat) {
        noPlat = noplat;
    }

    // mengeset nilai atribut Jenis
    public void setJenis(String jenis) {
        Jenis = jenis;
    }
}