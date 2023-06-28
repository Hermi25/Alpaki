package alpaczki;

public class Alpaczka {

    private String imie;
    private String kolorfuterka;
    private int kopytka = 4;
    private boolean grzeczna = true;
    private boolean najedzona;
    protected boolean kluska=true;



    public Alpaczka(String imie, String kolorfuterka) {
        this.imie = imie;
        this.kolorfuterka = kolorfuterka;
    }

    public Alpaczka(String imie, String kolorfuterka, int kopytka) {
        this(imie, kolorfuterka);
        this.kopytka = kopytka;
    }

    public void jemSiamko() {
        System.out.println("Jem siamko!!!! Dejcie wiecej");
        najedzona = true;
    }

    public void glodnam() {
        System.out.println("Glodna, zapomniana opuszczona, nienajedzona");
        najedzona = false;
    }

    public void rozrabia() {
        System.out.println("Zamawiam tone sianka z Zanzibaru");
        setGrzeczna(false);
    }

    public void nieRozrabia() {
        System.out.println("Jestem grzeczna");
        setGrzeczna(true);
    }

    public void kluskaj(){
        System.out.println("Klusku klusku");
        kluska = true;
    }

    public void obudzSieKluska(){
        System.out.println("Szo sie dzieje??");
        kluska = false;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getKolorfuterka() {
        return kolorfuterka;
    }

    public void setKolorfuterka(String kolorfuterka) {
        this.kolorfuterka = kolorfuterka;
    }

    public int getKopytka() {
        return kopytka;
    }

    public void setKopytka(int kopytka) {
        this.kopytka = kopytka;
    }

    public boolean isGrzeczna() {
        return grzeczna;
    }

    public void setGrzeczna(boolean grzeczna) {
        this.grzeczna = grzeczna;
    }

    public boolean isNajedzona() {
        return najedzona;
    }

    public void setNajedzona(boolean najedzona) {
        this.najedzona = najedzona;
    }





    @Override
    public String toString() {
        return "Alpaczka{" +
                "imie='" + imie + '\'' +
                ", kolorfuterka='" + kolorfuterka + '\'' +
                ", kopytka=" + kopytka +
                ", grzeczna=" + grzeczna +
                ", najedzona=" + najedzona +
                '}';
    }


}
