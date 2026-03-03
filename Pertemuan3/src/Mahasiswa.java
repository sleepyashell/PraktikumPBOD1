// Nama File   : Mahasiswa.java
// Deskripsi   : berisi atribut dan method dalam class Mahasiswa
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 03 Maret 2026

import java.util.ArrayList;

public class Mahasiswa {
    /***************** ATRIBUT *****************/
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***************** METHOD *****************/
    // konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>();
    }

    // konstruktor dengan parameter nim untuk atribut NIM, nama untuk atribut Nama, dan prodi untuk atribut Prodi
    public Mahasiswa(String nim, String nama, String prodi) {
        NIM = nim;
        Nama = nama;
        Prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // mengembalikan nilai atribut NIM
    public String getNIM() {
        return NIM;
    }

    // mengembalikan nilai atribut Nama
    public String getNama() {
        return Nama;
    }

    // mengembalikan nilai atribut Prodi
    public String getProdi() {
        return Prodi;
    }

    // mengembalikan nilai atribut listMatkul
    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    // mengembalikan nilai atribut dosenWali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // mengembalikan nilai atribut kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // mengeset nilai atribut NIM
    public void setNIM(String nim) {
        NIM = nim;
    }

    // mengeset nilai atribut Nama
    public void setNama(String nama) {
        Nama = nama;
    }

    // mengeset nilai atribut Prodi
    public void setProdi(String prodi) {
        Prodi = prodi;
    }

    // mengeset nilai atribut listMatkul
    public void addMatkul(MataKuliah Matkul) {
        listMatkul.add(Matkul);
    }
    
    // mengeset nilai atribut dosenWali
    public void setDosenWali(Dosen DosenWali) {
        dosenWali = DosenWali;
    }

    // mengeset nilai atribut kendaraan
    public void setKendaraan(Kendaraan Kendaraan) {
        kendaraan = Kendaraan;
    }

    // menghitung dan mengembalikan jumlah SKS yang diambil oleh mahasiswa
    public int getJumlahSKS() {
        int jumlahSKS = 0;
        for (int i = 0; i < listMatkul.size(); i++) {
            jumlahSKS = jumlahSKS + listMatkul.get(i).getSKS();
        }
        return jumlahSKS;
    }

    // menghitung dan mengembalikan jumlah mata kuliah yang diambil oleh mahasiswa
    public int getJumlahMatKul() {
        int jumlahMatKul = 0;
        for (int i = 0; i < listMatkul.size(); i++) {
            jumlahMatKul++;
        }
        return jumlahMatKul;
    }

    // menampilkan detail mahasiswa, data dosen wali, dan data kendaraan yang dimiliki oleh mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
        System.out.println("Mata Kuliah yang Diambil: ");
        for (int i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("===Data Dosen Wali===");
        System.out.println("NIP Dosen: " + dosenWali.getNIP());
        System.out.println("Nama Dosen: " + dosenWali.getNama());
        System.out.println("Prodi Dosen: " + dosenWali.getProdi());
        System.out.println("===Data Kendaraan=== ");
        System.out.println("Nomor Plat Kendaraan: " + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
    }
}