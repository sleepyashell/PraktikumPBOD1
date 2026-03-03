// Nama File   : Mahasiswa.java
// Deskripsi   : berisi program utama untuk menguji class Mahasiswa dan class yang berelasi
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 03 Maret 2026

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("067", "Jeffrey Aditya", "Informatika");
        Dosen D1 = new Dosen("069", "Donald  Rivaldi", "Informatika");
        Kendaraan K1 = new Kendaraan("6767", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah yang diambil M1: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS yang diambil M1: " + M1.getJumlahSKS());
    }
}