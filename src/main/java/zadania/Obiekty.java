package zadania;

import alpaczki.*;

public class Obiekty {

    public static void obiekty() {
        Alpaczka lusia = new Alpaczka("Lusia", "biało-szary");
        Alpaczka gucio = new Alpaczka("Gucio", "kremowy", 2);
        FabulousAlpaczka nadia = new FabulousAlpaczka("Nadia", "Białe", "Tworzy tecze");
        WiecznieGlodnaAlpaczka klementynka = new WiecznieGlodnaAlpaczka("Klementynka", "Upaćkane");
        RozrabiajacaAlpaczka agatka = new RozrabiajacaAlpaczka("Agatka", "Teczowe");
        ZombieAlpaczka carl = new ZombieAlpaczka("Carl", "Inne");

             System.out.println(nadia.getKolorfuterka());
       System.out.println(lusia);
        System.out.println(gucio);
        System.out.println(klementynka);

        lusia.jemSiamko();
        gucio.jemSiamko();
        klementynka.jemSiamko();
        agatka.rozrabia();

        System.out.println(agatka);

        System.out.println(lusia.isNajedzona());
        System.out.println(gucio.isNajedzona());
        System.out.println(klementynka.isNajedzona());


               gucio.glodnam();
        System.out.println(lusia.isNajedzona());
        System.out.println(gucio.isNajedzona());
    }
}
