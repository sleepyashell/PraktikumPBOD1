// NIM    : [NIM_ANDA]
// Nama   : [NAMA_ANDA]
// Tanggal: [TANGGAL]
// Main - Implementasi semua soal Praktikum 7 Polimorfisme

public class Main {
    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("  SOAL 1 - POLIMORFISME AD HOC COERSION");
        System.out.println("============================================");

        System.out.println("\n--- 1a. Konversi Tipe Dasar ---");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;
        System.out.println("Sebagai int    : " + nilaiInt);
        System.out.println("Sebagai char   : " + nilaiChar);
        System.out.println("Sebagai double : " + nilaiDouble);

        System.out.println("\n--- 1b. Real ke Integer (variabel berbeda) ---");
        double real = 65.9;
        int kembaliInt = (int) real;
        System.out.println("Nilai real    : " + real);
        System.out.println("Kembali ke int: " + kembaliInt);

        System.out.println("\n--- 1c. Konkatenasi dan Penjumlahan Integer ---");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        System.out.println("\n--- 1d. Konkatenasi dan Penjumlahan Double ---");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        System.out.println("\n--- 1e. Integer A dari konversi S ---");
        Integer A = Integer.parseInt(S);
        System.out.println("A = " + A);

        System.out.println("\n--- 1f. String T dari konversi A ---");
        String T = A.toString();
        System.out.println("T = " + T);

        System.out.println("\n============================================");
        System.out.println("  SOAL 2 - POLIMORFISME AD HOC OVERLOADING");
        System.out.println("============================================");

        System.out.println("\n--- 2c. Konstruktor Default ---");
        Mahasiswa m1 = new Mahasiswa();
        m1.tampil();

        System.out.println("\n--- 2d. Konstruktor Tiga Parameter ---");
        Mahasiswa m2 = new Mahasiswa("24060124120030", "An Al Rivaldi", "Informatika");
        m2.tampil();

        System.out.println("\n--- 2e. Konstruktor Kloning ---");
        Mahasiswa m3 = new Mahasiswa(m2);
        m3.tampil();

        System.out.println("\n--- 2b. setProgramStudi Varian 1 (tanpa parameter) ---");
        m1.setProgramStudi();
        m1.tampil();

        System.out.println("\n--- 2b. setProgramStudi Varian 2 (String) ---");
        m1.setProgramStudi("Sistem Informasi");
        m1.tampil();

        System.out.println("\n--- 2b. setProgramStudi Varian 3 (dari objek Mahasiswa lain) ---");
        Mahasiswa m4 = new Mahasiswa("24060124130092", "Syuraih Umar Khotthob", "Informatika");
        m4.setProgramStudi(m2);
        m4.tampil();

        System.out.println("\n============================================");
        System.out.println("  SOAL 3 - INCLUSION (ANABUL)");
        System.out.println("============================================");

        Anabul[] daftarAnabul = {
            new Kucing("Mimi"),
            new Anjing("Rex"),
            new Burung("Tweety")
        };

        System.out.println();
        for (Anabul anabul : daftarAnabul) {
            anabul.bersuara();
            anabul.gerak();
            System.out.println();
        }

        System.out.println("============================================");
        System.out.println("  SOAL 4 - INCLUSION (SEMINAR)");
        System.out.println("============================================");

        Dosen d1 = new Dosen("198501012010011001", "Dinar Mutiara");
        Dosen d2 = new Dosen("197803152005012002", "Dhena Kamalia");

        Mahasiswa2 ms1 = new Mahasiswa2("24060124120030", "An Al Rivaldi");
        Mahasiswa2 ms2 = new Mahasiswa2("24060124140149", "Devano Trestanto");
        Mahasiswa2 ms3 = new Mahasiswa2("24060124130054", "Raffie Aditya Akbar");
        Mahasiswa2 ms4 = new Mahasiswa2("24060124140196", "Saburo Rafqi Hidayat");
        Mahasiswa2 ms5 = new Mahasiswa2("24060124130092", "Syuraih Umar Khotthob");

        ms1.setWali(d1);
        ms2.setWali(d1);
        ms3.setWali(d2);
        ms4.setWali(d2);
        ms5.setWali(d1);

        Seminar seminar = new Seminar();

        System.out.println("\n--- 4f. Registrasi Peserta ---");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(ms1);
        seminar.registrasi(ms2);
        seminar.registrasi(ms3);
        seminar.registrasi(ms4);
        seminar.registrasi(ms5);

        System.out.println("\n--- 4c. Count Peserta ---");
        System.out.println("Total peserta: " + seminar.countPeserta());

        System.out.println();
        seminar.tampilPeserta();

        System.out.println("\n--- 4h. Count Mahasiswa ---");
        System.out.println("Jumlah peserta mahasiswa: " + seminar.countMahasiswa());

        System.out.println("\n--- 4j. Data Mahasiswa Peserta ---");
        Mahasiswa2[] daftarMhs = {ms1, ms2, ms3, ms4, ms5};
        for (Mahasiswa2 ms : daftarMhs) {
            ms.tampilDataMahasiswa();
            System.out.println();
        }
    }
}