package alpaczki;

public class ZombieAlpaczka extends Alpaczka {
    public ZombieAlpaczka(String imie, String kolorfuterka) {
        super(imie, kolorfuterka);
        setMozg(false);
    }
    private boolean mozg;
    public void jedzMozg() {
        System.out.println("mózg jest taki dobry mlem mlem");
        mozg = true;
    }

    public void szukajMozg() {
        System.out.println("Dej zmlemac mozg");
        mozg = false;
    }

    /*
    @Override
    public void jedzMozg() {
        System.out.println("mleeeeeeemmmm");
    }

    @Override
    public void szukajMozg() {
        System.out.println("Gdzie jest mozg? dej zmlemam");
        setMozg(false);
    }
     */
    public boolean isMozg() {
        return mozg;
    }

    public void setMozg(boolean mozg) {
        this.mozg = mozg;
    }
}
