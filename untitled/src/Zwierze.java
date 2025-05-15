public abstract class Zwierze {
    protected String nazwa;
    protected int wiek;

    public Zwierze(int wiek, String nazwa) {
        this.wiek = wiek;
        this.nazwa = nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public abstract String srodowiskoNaturalne();

    public abstract String wydajDzwiek();

    public abstract String poruszajSie();

    public void wyswietlInformacje() {
        System.out.println("nazwa: " + nazwa + ", wiek: " + wiek);
    }
}
