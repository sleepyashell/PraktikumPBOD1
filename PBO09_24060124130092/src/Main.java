// Nama File   : Main.java
// Deskripsi   : Main class untuk menjalankan semua soal Praktikum 09 Koleksi
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 9 Mei 2026

public class Main {
    public static void main(String[] args) {
        // Kamus Lokal

        // Algoritma
        System.out.println("============================================");
        System.out.println("  SOAL 1 - KOLEKSI KELAS DASAR (Teman)");
        System.out.println("============================================");

        Teman teman = new Teman();

        System.out.println("\n--- 1d. addNama ---");
        teman.addNama("Syuraih");
        teman.addNama("Devano");
        teman.addNama("Raffie");
        teman.addNama("Saburo");
        teman.addNama("An Al");
        teman.addNama("Devano"); // duplikat untuk uji countNama & gantiNama
        teman.showTeman();

        System.out.println("\n--- 1a. getNbelm ---");
        System.out.println("Banyak teman: " + teman.getNbelm());

        System.out.println("\n--- 1b. getNama ---");
        System.out.println("Nama indeks 0: " + teman.getNama(0));
        System.out.println("Nama indeks 2: " + teman.getNama(2));

        System.out.println("\n--- 1c. setNama ---");
        System.out.println("Sebelum setNama(3): " + teman.getNama(3));
        teman.setNama(3, "Saburo Rafqi");
        System.out.println("Sesudah setNama(3): " + teman.getNama(3));

        System.out.println("\n--- 1f. isMember ---");
        System.out.println("isMember(\"Syuraih\")  : " + teman.isMember("Syuraih"));
        System.out.println("isMember(\"Budi\")     : " + teman.isMember("Budi"));

        System.out.println("\n--- 1h. countNama ---");
        System.out.println("countNama(\"Devano\")  : " + teman.countNama("Devano"));

        System.out.println("\n--- 1g. gantiNama ---");
        teman.gantiNama("Devano", "Devano Trestanto");
        teman.showTeman();

        System.out.println("\n--- 1e. delNama ---");
        teman.delNama("Raffie");
        teman.showTeman();

        System.out.println("\n--- 1i. showTeman (final) ---");
        teman.showTeman();

        System.out.println("\n============================================");
        System.out.println("  SOAL 2 - KOLEKSI KELAS BENTUKAN (Piaraan)");
        System.out.println("============================================");

        Piaraan klinik = new Piaraan();

        Kucing k1       = new Kucing("Felis Catus", "Putih", 3.5);
        Anjing a1       = new Anjing("Canis Lupus", "Rex");
        Burung b1       = new Burung("Psittacus", "Fury");
        Anggora ag1     = new Anggora("Felis Anggora", "Snowie", 4.2);
        Kembangtelon kb1= new Kembangtelon("Felis Kembangtelon", "Blukutuk", 2.8);
        Anjing a2       = new Anjing("Canis Beagle", "Alex");
        Kucing k2       = new Kucing("Felis Domesticus", "Belang", 3.0);

        System.out.println("\n--- 2b-ii. enqueueAnabul ---");
        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(b1);
        klinik.enqueueAnabul(ag1);
        klinik.enqueueAnabul(kb1);
        klinik.enqueueAnabul(a2);
        klinik.enqueueAnabul(k2);
        System.out.println("7 anabul berhasil masuk antrean klinik");

        System.out.println("\n--- 2b-i. getNbelm ---");
        System.out.println("Banyak anabul: " + klinik.getNbelm());

        System.out.println("\n--- 2b-iii. isMember ---");
        System.out.println("isMember(Rex)    : " + klinik.isMember(a1));
        System.out.println("isMember(Anjing baru): " + klinik.isMember(new Anjing("X", "X")));

        System.out.println("\n--- 2b-iv. getAnabul (peek) ---");
        System.out.println("Anabul pertama: " + klinik.getAnabul().getPanggilan());
        System.out.println("Jumlah setelah peek: " + klinik.getNbelm()); // tetap sama

        System.out.println("\n--- 2c. showAnabul ---");
        klinik.showAnabul();

        System.out.println("\n--- 2d. countKucing ---");
        System.out.println("Jumlah keluarga kucing: " + klinik.countKucing());

        System.out.println("\n--- 2e. bobotKucing ---");
        System.out.println("Total bobot kucing: " + klinik.bobotKucing() + " kg");

        System.out.println("\n--- 2f. showJenisAnabul ---");
        klinik.showJenisAnabul();

        System.out.println("\n--- 2b-v. dequeueAnabul ---");
        Anabul dilayani = klinik.dequeueAnabul();
        System.out.println("Anabul dilayani: " + dilayani.getPanggilan()
                + " [" + dilayani.getClass().getName() + "]");
        System.out.println("Sisa antrean: " + klinik.getNbelm());
        klinik.showAnabul();
    }
}