import javax.naming.spi.InitialContextFactoryBuilder;
import java.util.ArrayList;

public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Ssak Lew = new Ssak(2, "lew", true);
        Ptak wrona = new Ptak(10, "wrona", 25);
        ryba leszcz = new ryba(5, "leszcz", 4);

        ArrayList<Zwierze> zwierzeta = new ArrayList<Zwierze>();
        zwierzeta.add(Lew);
        zwierzeta.add(wrona);
        zwierzeta.add(leszcz);

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println(z.poruszajSie());
            System.out.println(z.wydajDzwiek());
            System.out.println(z.srodowiskoNaturalne());
            System.out.println();
        }
        System.out.println("\nmetody specjalne dla klasy:");
        Lew.ssanie();
        wrona.latanie();
        leszcz.atak();

    }

}