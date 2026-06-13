import java.util.HashMap;
import java.util.Map;

/**
 * File         : LambdaMap.java
 * Deskripsi    : Implementasi lambda pada Map untuk menampilkan NIM dan nama mahasiswa.
 * Pembuat      : Syuraih Umar Khotthob
 * Tanggal      : 26 Mei 2026
 */

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124130092", "Syuraih");
        mahasiswaMap.put("24060124130001", "Adi");
        mahasiswaMap.put("24060124130002", "Bambang");
        mahasiswaMap.put("24060124130003", "Cici");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " | Nama: " + nama));
    }
}