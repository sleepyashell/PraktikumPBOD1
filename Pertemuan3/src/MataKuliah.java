// Nama File   : MataKuliah.java
// Deskripsi   : berisi atribut dan method dalam class MataKuliah
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 03 Maret 2026

public class MataKuliah {
    /***************** ATRIBUT *****************/
    private String idMatkul;
    private String Nama;
    private int SKS;

    /***************** METHOD *****************/
    // konstruktor tanpa parameter
    public MataKuliah() {
        idMatkul = "???";
        SKS = 0;
    }

    // konstruktor dengan parameter idmatkul untuk atribut idMatkul, nama untuk atribut Nama, dan sks untuk atribut SKS 
    public MataKuliah(String idmatkul, String nama, int sks) {
        idMatkul = idmatkul;
        Nama = nama;
        SKS = sks;
    }

    // mengembalikan nilai atribut idMatkul
    public String getIDMatkul() {
        return idMatkul;
    }

    // mengembalikan nilai atribut Nama
    public String getNama() {
        return Nama;
    }

    // mengembalikan nilai atribut SKS
    public int getSKS() {
        return SKS;
    }

    // mengeset nilai atribut idMatkul
    public void setIDMatkul(String idmatkul) {
        idMatkul = idmatkul;
    }

    // mengeset nilai atribut Nama
    public void setNama(String nama) {
        Nama = nama;
    }

    // mengeset nilai atribut SKS
    public void setSKS(int sks) {
        SKS = sks;
    }
}