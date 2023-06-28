package alpaczki;

public class WiecznieGlodnaAlpaczka extends Alpaczka{

    public WiecznieGlodnaAlpaczka(String imie, String kolorfuterka) {
        super(imie, kolorfuterka);
    }

    @Override
    public void jemSiamko() {
        System.out.println("Wciąz głodna!!!");
    }
}
