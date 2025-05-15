public class ryba extends Zwierze {
    protected int iloscPletew;

    public ryba(int wiek, String nazwa, int iloscPletew) {
        super(wiek, nazwa);
        this.iloscPletew = iloscPletew;
    }

    @Override
    public String srodowiskoNaturalne() {
        return "to zwierze żyje w wodzie";
    }

    @Override
    public String wydajDzwiek() {
        return "bulbul";
    }

    @Override
    public String poruszajSie() {
        return "pływanie";
    }

    public void atak(){
        System.out.printf("ryba atakuje");
    }
}
