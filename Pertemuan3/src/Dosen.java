// Nama File   : Dosen.java
// Deskripsi   : berisi atribut dan method dalam class Dosen
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 03 Maret 2026

public class Dosen {
    /***************** ATRIBUT *****************/
    private String NIP;
    private String Nama;
    private String Prodi;

    /***************** METHOD *****************/
    // Konstruktor tanpa parameter
    public Dosen() {
        NIP = "???";
        Nama = "???";
        Prodi = "???";
    }

    // Konstruktor dengan parameter nip untuk atribut NIP, nama untuk atribut Nama, dan prodi untuk atirbut Prodi 
    public Dosen(String nip, String nama, String prodi) {
        NIP = nip;
        Nama = nama;
        Prodi = prodi;
    }

    // mengembalikan nilai atribut NIP
    public String getNIP() {
        return NIP;
    }

    // mengembalikan nilai atribut Nama
    public String getNama() {
        return Nama;
    }

    // mengembalikan nilai atribut Prodi
    public String getProdi() {
        return Prodi;
    }

    // mengeset nilai atribut NIP
    public void setNIP(String nip) {
        NIP = nip;
    }

    // mengeset nilai atribut Nama
    public void setNama(String nama) {
        Nama = nama;
    }

    // mengeset nilai atribut Prodi
    public void setProdi(String prodi) {
        Prodi = prodi;
    }
}