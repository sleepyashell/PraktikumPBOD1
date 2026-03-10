// Nama File   : main.java
// Deskripsi   : Program utama untuk menjalankan contoh inheritance (pewarisan) dalam Java
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 10 Maret 2026

public class MInheritance {
    public static void main(String[] args) {

        // ==========BAGIAN 1: SIMPLE INHERITANCE==========
        Persegi persegi1 = new Persegi(5.0, "Merah", "Solid"); // membuat objek persegi
        System.out.println("Informasi Persegi:");
        persegi1.printInfo(); // menampilkan informasi persegi
        persegi1.setSisi(6.0); // Mengubah panjang sisi persegi
        System.out.println("Panjang Sisi: " + persegi1.getSisi()); // menampilkan panjang sisi persegi
        System.out.println("Luas: " + persegi1.getLuas()); // menghitung dan menampilkan luas persegi
        System.out.println("Keliling: " + persegi1.getKeliling()); // menghitung dan menampilkan keliling persegi
        System.out.println("Diagonal: " + persegi1.getDiagonal()); // menghitung dan menampilkan diagonal persegi

        Lingkaran lingkaran1 = new Lingkaran(3.0, "Biru", "Dashed"); // membuat objek lingkaran
        System.out.println("\nInformasi Lingkaran:");
        lingkaran1.printInfo(); // menampilkan informasi lingkaran
        lingkaran1.setJari(4.0); // mengubah jari-jari lingkaran
        System.out.println("Jari-jari: " + lingkaran1.getJari()); // menampilkan jari-jari
        System.out.println("Luas: " + lingkaran1.getLuas()); // menghitung dan menampilkan luas lingkaran
        System.out.println("Keliling: " + lingkaran1.getKeliling()); // menghitung dan menampilkan keliling lingkaran
        System.out.println("Diameter: " + lingkaran1.getDiameter()); // menghitung dan menampilkan diameter lingkaran

        // ==========BAGIAN 2: KEYWORD SUPER==========
        Persegi persegi2 = new Persegi(4.0, "Hijau", "Dotted"); // membuat objek persegi
        System.out.println("\nInformasi Persegi (dengan super):");
        persegi2.printInfo(); // menampilkan informasi persegi dengan method pakai keyword super

        Lingkaran lingkaran2 = new Lingkaran(7.0, "Hitam", "Solid"); // membuat objek lingkaran
        System.out.println("\nInformasi Lingkaran:");
        lingkaran2.printInfo(); // menampilkan informasi lingkaran dengan method pakai keyword super

        // ==========BAGIAN 3: OVERRIDING METHOD==========
        // System.out.print("\n");
        // persegi2.printInfo(); // menampilkan informasi persegi dengan method
        // printInfo() yang sudah di override
        // System.out.print("\n");
        // lingkaran2.printInfo(); // menampilkan informasi lingkaran dengan method
        // printInfo() yang sudah di override
        // // System.out.println("Jumlah Bangun Datar: " + printCounterBangunDatar());
        // // error karena override

        // ==========BAGIAN 4: ACCESS MODIFIER PROTECTED==========
        Persegi persegi3 = new Persegi(14.0, "Cyan", "Solid"); // membuat objek persegi setelah modifier atribut sudah diset menjadi protected
        System.out.println("\nInformasi Persegi:");
        persegi3.printInfo(); // menampilkan informasi persegi

        // ==========BAGIAN 5: KEYWORD FINAL==========
        // final public class BangunDatar {
        //     protected int jmlSisi;
        //     protected String warna;
        //     protected String border;
        //     protected static int counterBangunDatar = 0;
        // menjalankan program setelah menambah keyword final pada class BangunDatar
        // hasil:
        // Exception in thread "main" java.lang.IncompatibleClassChangeError: class
        // Persegi cannot inherit from final class BangunDatar
        // at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        // at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
        // at
        // java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
        // at
        // java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:862)
        // at
        // java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:760)
        // at
        // java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:681)
        // at
        // java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:639)
        // at
        // java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        // at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
        // at MInheritance.main(MInheritance.java:10)

        // menambah keyword final untuk method printInfo() pada class BangunDatar
        // final public void printInfo() {
        //     System.out.println("Jumlah Sisi: " + jmlSisi);
        //     System.out.println("Warna: " + warna);
        //     System.out.println("Border: " + border);
        // } 
        // hasil:
        // Lingkaran.java
        // Cannot override the final method from BangunDatar
        // Persegi.java
        // Cannot override the final method from BangunDatar
    }
}