public class Ssak extends Zwierze {
    protected boolean czydrapieznik;

    public Ssak(int wiek, String nazwa, boolean czydrapieznik) {
        super(wiek, nazwa);
        this.czydrapieznik = czydrapieznik;
    }

    @Override
    public String srodowiskoNaturalne() {
        return "to zwierze żyje na lądzie";
    }

    @Override
    public String wydajDzwiek() {
        return "sss";
    }

    @Override
    public String poruszajSie() {
        return "tuptup";
    }

    public void ssanie() {
        System.out.println("ssanie");
    }

}
