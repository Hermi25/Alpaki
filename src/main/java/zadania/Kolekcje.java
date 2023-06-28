package zadania;

import alpaczki.Alpaczka;
import alpaczki.FabulousAlpaczka;
import alpaczki.RozrabiajacaAlpaczka;
import alpaczki.WiecznieGlodnaAlpaczka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kolekcje {

    public static void kolekcje()
    {
        Alpaczka lusia = new Alpaczka("Lusia", "biało-szary");
        Alpaczka gucio = new Alpaczka("Gucio", "kremowy", 2);
        FabulousAlpaczka nadia = new FabulousAlpaczka("Nadia", "Białe", "Tworzy tecze");
        WiecznieGlodnaAlpaczka klementynka = new WiecznieGlodnaAlpaczka("Klementynka", "Upaćkane");
        RozrabiajacaAlpaczka agatka = new RozrabiajacaAlpaczka("Agatka","Teczowe");


        List<Alpaczka> alpaczkas = Arrays.asList(lusia,gucio,nadia,klementynka);
        alpaczkas.forEach(Alpaczka::jemSiamko);

    }
}
