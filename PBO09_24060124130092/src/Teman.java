// Nama File   : Teman.java
// Deskripsi   : Realisasi class Teman dengan koleksi List<String> menggunakan java.util
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 9 Mei 2026

import java.util.*;

public class Teman {
    // Atribut
    private int nbelm;
    private List<String> Lnama;

    // Method
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            this.nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
            }
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman (" + nbelm + " orang):");
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + Lnama.get(i));
        }
    }
}