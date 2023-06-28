package alpaczki;

public class RozrabiajacaAlpaczka extends Alpaczka{


    public RozrabiajacaAlpaczka(String imie, String kolorfuterka) {
        super(imie, kolorfuterka);
        setGrzeczna(false);
    }

    @Override
    public void nieRozrabia(){
        System.out.println("Parkur!!!");
    }

    @Override
    public void setGrzeczna(boolean grzeczna) {
        super.setGrzeczna(false);
    }
}
