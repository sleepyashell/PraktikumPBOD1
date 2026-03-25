// Nama File   : MPegawai.java
// Deskripsi   : Program utama untuk menguji class Pegawai, Dosen, dan Tendik
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {

        DosenTetap dosen1 = new DosenTetap(
            "9545647548", 
            "78647324", 
            "Andi", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000, 
            "Fakultas Sains dan Matematika"
        );

        DosenTamu dosen2 = new DosenTamu(
            "987654321", 
            "12345678", 
            "Siti", 
            LocalDate.of(1988, 8, 15), 
            LocalDate.of(2023, 9, 1), 
            4500000, 
            "Fakultas Teknik", 
            LocalDate.of(2024, 8, 31)
        );

        Tendik staff1 = new Tendik(
            "123456789", 
            "Budi", 
            LocalDate.of(1985, 10, 20), 
            LocalDate.of(2010, 3, 1), 
            4000000, 
            "Akademik"
        );

        System.out.println("=== DETAIL DATA PEGAWAI ===");
        dosen1.printInfo();
        dosen2.printInfo();
        staff1.printInfo();
    }
}