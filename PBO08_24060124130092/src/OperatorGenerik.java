// Nama File   : OperatorGenerik.java
// Deskripsi   : Realisasi kelas OperatorGenerik
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 28 April 2026

public class OperatorGenerik {
    // Atribut

    // Method
    public static <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T Kucing1, T Kucing2){
        return Kucing1.getBobot() + Kucing2.getBobot();
    }
}