// Nama File   : Piaraan.java
// Deskripsi   : Realisasi class Piaraan dengan koleksi antrean Queue<Anabul> menggunakan java.util
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 9 Mei 2026

import java.util.*;

public class Piaraan {
    // Atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // Method
    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        this.nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            this.nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    public void showAnabul() {
        System.out.println("Antrean Klinik (" + nbelm + " hewan):");
        int i = 1;
        for (Anabul a : Lanabul) {
            System.out.println("  " + i + ". " + a.getPanggilan());
            i++;
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) count++;
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Anabul beserta Jenis:");
        int i = 1;
        for (Anabul a : Lanabul) {
            System.out.println("  " + i + ". " + a.getPanggilan()
                    + " [" + a.getClass().getName() + "]");
            i++;
        }
    }
}