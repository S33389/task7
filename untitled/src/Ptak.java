public class Ptak extends Zwierze {
    protected int dlugoscSkrzydla;

    public Ptak(int wiek, String nazwa, int dlugoscSkrzydla) {
        super(wiek, nazwa);
        this.dlugoscSkrzydla = dlugoscSkrzydla;
    }

    @Override
    public String srodowiskoNaturalne() {
        return "to zwierze żyje w powietrzu";
    }

    @Override
    public String wydajDzwiek() {
        return "krakrkakakak";
    }

    @Override
    public String poruszajSie() {
        return "frufrufruf";
    }

    public void latanie(){
        System.out.println("lot");
    }
}
