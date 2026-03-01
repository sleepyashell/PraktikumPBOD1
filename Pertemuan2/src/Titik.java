// Nama File   : Titik.java
// Deskripsi   : berisi atribut dan method dalam class Titik
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 24 Februari 2026

public class Titik {
    /***************** ATRIBUT *****************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************** METHOD *****************/
    // konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // konstruktor untuk membaut titik dengan input x sebagai absis dan input y sebagai ordinat
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengembalikan kuadran titik berada
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    // mengembalikan jarak titik dengan titik pusat (0.0)
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // mengembalikan jarak antara dua titik
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(T.getAbsis() - this.getAbsis(), 2) + Math.pow(T.getOrdinat() - this.getOrdinat(), 2));
    }

    // merefleksi titik dengan sumbu X
    public void refleksiX() {
        ordinat = ordinat * -1.0;
    }

    // merefleksi titik dengan sumbu Y
    public void refleksiY() {
        absis = absis * -1.0;
    }

    // mengembalikan titik baru hasil dari refleksi sebuah titik dengan sumbu X
    public Titik getRefleksiX() {
        Titik T1 = new Titik(absis, ordinat * -1);

        return T1;
    }

    // mengembalikan titik baru hasil dari refleksi sebuah titik dengan sumbu Y
    public Titik getRefleksiY() {
        Titik T1 = new Titik(absis * -1, ordinat);

        return T1;
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

} // end class Titik