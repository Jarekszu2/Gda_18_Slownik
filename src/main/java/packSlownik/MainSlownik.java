package packSlownik;

import packSlownik.Slownik;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainSlownik {
    public static void main(String[] args) {
        System.out.println();

        Map<String, List<String >> mapaSlownik = new HashMap<String, List<String>>();

        Slownik slownik = new Slownik(mapaSlownik);
        slownik.dodajTlumaczenie("uczyć", "learn", "study");
        slownik.sprawdzTlumaczenie("uczyć");
        slownik.sprawdzTlumaczenie("liczyć");
        slownik.dodajTlumaczenie("samochód", "car", "vehicle");
        slownik.sprawdzTlumaczenie("samochód");
    }
}
