package alpaczki

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class AlpaczkiSpec extends Specification {

    def "Sprawdzamy czy #imie jest najedzona i jaki ma kolor futerka"(String imie, String kolorfuterka) {

        given: 'Piękne alpaczki'
        def alpaczka = new Alpaczka(imie, kolorfuterka);

        when: 'Karmimy'
        alpaczka.jemSiamko()

        then: 'Pełne brzuszki!'
        alpaczka.najedzona

        and: 'Jaki ma kolor futerka'
        if (alpaczka.imie == "Nadia")
        {
            assert alpaczka.kolorfuterka == "Białe"
        }
        else
        {
            assert alpaczka.kolorfuterka == "Szare"
        }

        where:
        imie    | kolorfuterka
        "Nadia" | "Białe"
        "Imka"  | "Szare"

    }

    def "Sprawdzamy czy wiecznie głodna alpaczka jest ciągle głodna :/"()
    {
        given: 'Oho! Mamy głodomorka'
        def wiecznieGlodna = new WiecznieGlodnaAlpaczka("Klementynka", "Czerwone")

        when: 'Karmimy'
        wiecznieGlodna.jemSiamko()

        then: 'Dalej głodna!!'
        !wiecznieGlodna.najedzona
    }

    def "Karmimy wszystkie alpaczki i sprawdzamy czy najedzone"()
    {
        given: "Zbieramy alpaczki"
        def imka = new Alpaczka("Imka", "Szary")
        def lusia = new Alpaczka("Lusia", "Biały")
        def nadia = new Alpaczka("Nadia", "Teczowy")
        def alpaczkas = [imka, lusia, nadia]

        expect: "Każda jest głodna"
        alpaczkas.forEach({ alpaczka -> assert !alpaczka.isNajedzona() })

        when: 'Karmimy!'
        alpaczkas.forEach({ alpaczka -> alpaczka.jemSiamko() })

        then: 'Wszystkie mają pełne brzuszki :)'
        alpaczkas.forEach({ alpaczka -> assert alpaczka.isNajedzona() })
    }

    def "Sparwdzamy czy Agatka jest grzecza i czy taka pozostanie"()
    {
        given:"Zabieramy Agatke"
        def agatka = new RozrabiajacaAlpaczka("Agatka", "Teczowe")

        expect:"Agatka jest niegrzeczna"
        !agatka.grzeczna

        when:"Uspokajamy Agatke"
        agatka.nieRozrabia()

        then: "Agata wciaz rozrabia"
        !agatka.grzeczna
    }


    def "Sprawdzamy czy alpaczka kluska"()
    {
        given: "Mamy Imke"
        def imka = new Alpaczka("Imka","Szare")

        expect:"Kluska"
        imka.kluska

        when: "Budzimy kluske"
        imka.obudzSieKluska()

        then: "Imka nie kluska"
        !imka.kluska

        when: "Wracaj do spanka"
        imka.kluskaj()

        then:"Imka robi hopsi hopsi"
        imka.kluska
    }


    def "Sprawdzamy czy Kluskajaca alpaczka kluska"()
    {
        given: "Mamy Agatke"
        def agatka = new KluskajacaAlpaczka("Agatka","Teczowe")

        expect:"Kluska"
        agatka.kluska

        when: "Budzimy kluske"
        agatka.obudzSieKluska()

        then: "agatka kluska"
        agatka.kluska

        when:"Dajemy jedzomko"
        agatka.jestJedzomko()

        then: "Agatka sie budzi"
        !agatka.kluska

        when: "Wracaj do spanka"
        agatka.kluskaj()

        then:"agatka robi hopsi hopsi"
        agatka.kluska
    }

    def "Sprawdz czy Carl je mozg"()
    {
        given: " Mamy zombie carla "
        def carl = new ZombieAlpaczka("Carl","Inny")

        expect:"Carl chce mozg"
        !carl.mozg

        when: "Carl dostaje mozg"
        carl.jedzMozg()

        then: "Carl zjadl mozg"
        carl.mozg

    }
    def "Sprawdz czy Carl zjadl mozg"()
    {
        given: " Mamy zombie carla "
        def carl = new ZombieAlpaczka("Carl","Inny")

        expect:"Carl chce mozg"
        !carl.mozg

        when: "Carl szukaj mozg"
        carl.szukajMozg()

        then: "Carl chce mozg"
        !carl.mozg

    }
}
