// Nama File   : Datum.java
// Deskripsi   : Realisasi kelas generik Datum dengan atribut isi bertipe generik T
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 28 April 2026

public class Datum<T> {
    // Atribut
    private T isi;

    // Method
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    public T getIsi() {
        return this.isi;
    }
}