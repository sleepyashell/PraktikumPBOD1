// Nama File   : Data.java
// Deskripsi   : Realisasi kelas generik Data dengan larik statik 100 elemen generik
// Pembuat     : Syuraih Umar Khotthob
// Tanggal     : 28 April 2026

public class Data<T> {
    // Atribut
    private Object[] ruang; // array generik pakai Object karena Java tidak izinkan new T[100]
    private int banyak;
    private static final int KAPASITAS = 100;

    // Method
    public Data() {
        this.ruang = new Object[KAPASITAS];
        this.banyak = 0;
    }

    // setIsi: posisi {1..100}, isi elemen di posisi tersebut
    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= KAPASITAS) {
            ruang[posisi - 1] = objek;
            // Update banyak: hitung ulang elemen yang tidak null
            int count = 0;
            for (Object o : ruang) {
                if (o != null) count++;
            }
            this.banyak = count;
        } else {
            System.out.println("Posisi " + posisi + " di luar jangkauan (1-100)!");
        }
    }

    // getIsi: posisi {1..100}, kembalikan elemen di posisi tersebut
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= KAPASITAS) {
            return (T) ruang[posisi - 1];
        } else {
            System.out.println("Posisi " + posisi + " di luar jangkauan (1-100)!");
            return null;
        }
    }

    // getSize: kembalikan banyak elemen efektif
    public int getSize() {
        return this.banyak;
    }
}