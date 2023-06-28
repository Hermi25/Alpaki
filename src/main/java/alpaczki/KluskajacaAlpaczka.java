package alpaczki;

public class KluskajacaAlpaczka extends Alpaczka{

    public KluskajacaAlpaczka(String imie, String kolorfuterka) {
        super(imie, kolorfuterka);
    }

    @Override
    public void obudzSieKluska() {
        System.out.println("NIO, hopsi hopsi");
    }

    public void jestJedzomko(){
        System.out.println("mlem, mlem");
        kluska = false;
    }
}
