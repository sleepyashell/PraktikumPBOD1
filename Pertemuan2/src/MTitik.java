// Nama File   : MTitik.java
// Deskripsi   : berisi atribut dan method dalam class Titik
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 24 Februari 2026

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        
        T1.setAbsis(3);         // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       // mengubah ordinat T1 dengan nilai 4
        
        T1.printTitik();        // mencetak koordinat T1 ke layar
        
        T1.geser(3, 4);         // menggeser T1 sejauh (3,4)
        
        T1.printTitik();        // menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(15.0,15.0);
        T3.printTitik();

        Titik T4 = new Titik(20.0,20.0);
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T3.getCounterTitik());
        System.out.println("Kuadran T4 = " + T4.getKuadran());
        System.out.println("Jarak T4 dengan titik pusat = " + T4.getJarakPusat());
        System.out.println("Jarak T4 dengan T3 = " + T4.getJarak(T3));
        T4.refleksiX();
        T4.printTitik();

        Titik T5 = new Titik(6.0,17.0);
        T5.printTitik();
        Titik T5RefleksiX = T5.getRefleksiX();
        System.out.println("Titik baru hasil refleksi T5 terhadap X : ");
        T5RefleksiX.printTitik();
    }
}