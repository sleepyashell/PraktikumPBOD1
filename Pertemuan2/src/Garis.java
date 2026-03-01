// Nama File   : Garis.java
// Deskripsi   : berisi atribut dan method dalam class Garis
// Pembuat     : Syuraih Umar Khotthob 
// Tanggal     : 24 Februari 2026

public class Garis {

    private Titik titik1;
    private Titik titik2;
    private static int counterGaris = 0;

    public Garis() {
        titik1 = new Titik(0.0, 0.0);
        titik2 = new Titik(1.1, 1.1);
        counterGaris++;
    }

    public Garis(Titik T1, Titik T2) {
        titik1 = T1;
        titik2 = T2;
        counterGaris++;
    }

    public Titik getTitik1() {
        return titik1;
    }

    public Titik getTitik2() {
        return titik2;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public void setTitik1(Titik T1) {
        titik1 = T1;
    }

    public void setTitik2(Titik T2) {
        titik2 = T2;
    }

    public double Panjang() {
        return Math.sqrt(Math.pow(titik2.getAbsis() - titik1.getAbsis(), 2)
                + Math.pow(titik2.getOrdinat() - titik1.getOrdinat(), 2));
    }

    public double Gradien() {
        return (titik2.getOrdinat() - titik1.getOrdinat()) / (titik2.getAbsis() - titik1.getAbsis());
    }

    public Titik titikTengah() {
        double absisTengah = (titik1.getAbsis() + titik2.getAbsis()) / 2;
        double ordinatTengah = (titik1.getOrdinat() + titik2.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    public boolean isSejajar(Garis G) {
        return this.Gradien() == G.Gradien();
    }

    public void printGaris() {
        System.out.println("Garis dengan titik awal (" + titik1.getAbsis() + "," + titik1.getOrdinat()
                + ") dan titik akhir (" + titik2.getAbsis() + "," + titik2.getOrdinat() + ")");
    }

    public String getPersamaanGaris() {
        double m = this.Gradien();
        double c = titik1.getOrdinat() - m * titik1.getAbsis();
        return "y = " + m + "x + " + c;
    }
}