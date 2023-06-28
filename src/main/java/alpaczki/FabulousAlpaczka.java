package alpaczki;

public class FabulousAlpaczka extends Alpaczka {

    private String supermoc;

    public FabulousAlpaczka(String imie, String kolorfuterka, String supermoc) {
        super(imie, createKolorFuterka(kolorfuterka));
        this.supermoc = supermoc;
    }

    @Override
    public void setKolorfuterka(String kolorfuterka) {
        super.setKolorfuterka(createKolorFuterka(kolorfuterka));
    }

    private static String createKolorFuterka(String kolorfuterka)
    {
        return "Świeci się i jest " + kolorfuterka;
    }
}
