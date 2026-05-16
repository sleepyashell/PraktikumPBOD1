// Nama File   : Main.java
// Deskripsi   : Main class untuk menjalankan semua soal Praktikum 08 Generik
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 28 April 2026

public class Main {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("  SOAL 1 - KUCING, ANGGORA, KEMBANGTELON");
        System.out.println("============================================");

        Kucing k1 = new Kucing("Putih", 3.5);
        System.out.println("\n--- Kucing ---");
        k1.printInfo();

        Anggora ag1 = new Anggora("Snowie", 4.2);
        System.out.println("\n--- Anggora ---");
        ag1.printInfo();

        Kembangtelon kb1 = new Kembangtelon("Blukutuk", 2.8);
        System.out.println("\n--- Kembangtelon ---");
        kb1.printInfo();

        System.out.println("\n============================================");
        System.out.println("  SOAL 2 - KELAS GENERIK Datum<T>");
        System.out.println("============================================");

        Datum<Integer> datumInt = new Datum<>();
        datumInt.setIsi(42);
        System.out.println("\n--- Datum<Integer> ---");
        System.out.println("Isi awal  : " + datumInt.getIsi());
        datumInt.setIsi(99);
        System.out.println("Isi baru  : " + datumInt.getIsi());

        Datum<String> datumStr = new Datum<>();
        datumStr.setIsi("Halo Generik");
        System.out.println("\n--- Datum<String> ---");
        System.out.println("Isi awal  : " + datumStr.getIsi());
        datumStr.setIsi("Belajar PBO");
        System.out.println("Isi baru  : " + datumStr.getIsi());

        Datum<Anabul> datumAnabul = new Datum<>();
        datumAnabul.setIsi(new Anjing("Rex"));
        System.out.println("\n--- Datum<Anabul> (awal: Anjing) ---");
        datumAnabul.getIsi().printInfo();

        datumAnabul.setIsi(new Kucing("Whiskers", 3.0));
        System.out.println("\n--- Datum<Anabul> (setelah setIsi: Kucing) ---");
        datumAnabul.getIsi().printInfo();

        datumAnabul.setIsi(new Burung("Fury"));
        System.out.println("\n--- Datum<Anabul> (setelah setIsi: Burung) ---");
        datumAnabul.getIsi().printInfo();

        System.out.println("\n============================================");
        System.out.println("  SOAL 3 - OPERATOR GENERIK Tukar & Bobot2");
        System.out.println("============================================");

        // Tukar sesama Integer
        System.out.println("\n--- Tukar<Integer> ---");
        Datum<Integer> dInt1 = new Datum<>();
        dInt1.setIsi(3);
        Datum<Integer> dInt2 = new Datum<>();
        dInt2.setIsi(6);
        System.out.println("Sebelum : a=" + dInt1.getIsi() + ", b=" + dInt2.getIsi());
        OperatorGenerik.Tukar(dInt1, dInt2);
        System.out.println("Sesudah : a=" + dInt1.getIsi() + ", b=" + dInt2.getIsi());

        // Tukar sesama String
        System.out.println("\n--- Tukar<String> ---");
        Datum<String> dStr1 = new Datum<>();
        dStr1.setIsi("Kucing");
        Datum<String> dStr2 = new Datum<>();
        dStr2.setIsi("Anjing");
        System.out.println("Sebelum : a=" + dStr1.getIsi() + ", b=" + dStr2.getIsi());
        OperatorGenerik.Tukar(dStr1, dStr2);
        System.out.println("Sesudah : a=" + dStr1.getIsi() + ", b=" + dStr2.getIsi());

        // Tukar sesama Anabul
        System.out.println("\n--- Tukar<Anabul> ---");
        Datum<Anabul> dAnabul1 = new Datum<>();
        dAnabul1.setIsi(new Anjing("Rex"));
        Datum<Anabul> dAnabul2 = new Datum<>();
        dAnabul2.setIsi(new Kucing("Putih", 3.5));
        System.out.println("Sebelum : a=" + dAnabul1.getIsi().getNama() + " (Anjing), b=" + dAnabul2.getIsi().getNama() + " (Kucing)");
        OperatorGenerik.Tukar(dAnabul1, dAnabul2);
        System.out.println("Sesudah : a=" + dAnabul1.getIsi().getNama() + " (Kucing), b=" + dAnabul2.getIsi().getNama() + " (Anjing)");

        // Bobot2
        System.out.println("\n--- Bobot2<T extends Kucing> ---");
        Anggora ag2 = new Anggora("Hitam", 4.0);
        Kembangtelon kb2 = new Kembangtelon("Ndut", 5.5);
        double total1 = OperatorGenerik.Bobot2(ag2, kb2);
        System.out.println("Bobot " + ag2.getNama() + " (Anggora)      : " + ag2.getBobot() + " kg");
        System.out.println("Bobot " + kb2.getNama() + " (Kembangtelon) : " + kb2.getBobot() + " kg");
        System.out.println("Total bobot (Bobot2)            : " + total1 + " kg");

        double total2 = OperatorGenerik.Bobot2(k1, ag1);
        System.out.println("\nBobot " + k1.getNama() + " (Kucing)       : " + k1.getBobot() + " kg");
        System.out.println("Bobot " + ag1.getNama() + " (Anggora)      : " + ag1.getBobot() + " kg");
        System.out.println("Total bobot (Bobot2)            : " + total2 + " kg");

        System.out.println("\n============================================");
        System.out.println("  SOAL 4 - LARIK GENERIK Data<T>");
        System.out.println("============================================");

        System.out.println("\n--- 4b. setIsi: Data<Anabul> ---");
        Data<Anabul> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Kucing("Putih", 3.5));
        dataAnabul.setIsi(2, new Anjing("Rex"));
        dataAnabul.setIsi(3, new Burung("Fury"));
        dataAnabul.setIsi(4, new Anggora("Snowie", 4.2));
        dataAnabul.setIsi(5, new Kembangtelon("Blukutuk", 2.8));
        System.out.println("5 anabul berhasil dimasukkan ke Data<Anabul>");

        System.out.println("\n--- 4c. getIsi: ambil elemen dari Data<Anabul> ---");
        for (int i = 1; i <= 5; i++) {
            Anabul anabul = dataAnabul.getIsi(i);
            System.out.println("Posisi " + i + ": " + anabul.getNama());
            anabul.printInfo();
            System.out.println();
        }

        System.out.println("--- 4d. getSize ---");
        System.out.println("Jumlah elemen efektif: " + dataAnabul.getSize());

        System.out.println("\n--- Data<Integer> ---");
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 100);
        dataInt.setIsi(2, 200);
        dataInt.setIsi(3, 300);
        System.out.println("Posisi 1: " + dataInt.getIsi(1));
        System.out.println("Posisi 2: " + dataInt.getIsi(2));
        System.out.println("Posisi 3: " + dataInt.getIsi(3));
        System.out.println("getSize : " + dataInt.getSize());

        System.out.println("\n--- Data<String> ---");
        Data<String> dataStr = new Data<>();
        dataStr.setIsi(1, "Generik");
        dataStr.setIsi(2, "Pada");
        dataStr.setIsi(3, "Java");
        System.out.println("Posisi 1: " + dataStr.getIsi(1));
        System.out.println("Posisi 2: " + dataStr.getIsi(2));
        System.out.println("Posisi 3: " + dataStr.getIsi(3));
        System.out.println("getSize : " + dataStr.getSize());
    }
}