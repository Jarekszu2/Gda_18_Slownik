package packSlownik;

/*
Stwórz aplikację w formie słownika polsko - angielskiego.
Dodaj w aplikacji parsowanie (interpretowanie wejścia użytkownika).
Stwórz klasę słownik, która posiada Mapę tłumaczeń. (zastanów się na konstrukcją mapy - co powinno być kluczem a co wartością).
Dodaj opcję dodawania tłumaczeń:
- metoda dodajTłumaczenie(String poPolsku, String poAngielsku);
Dodaj opcję sprawdzania tłumaczeń:
- metoda sprawdzTłumaczenie(String poPolsku); - zwraca tłumaczenie angielskie słowa.
Stwórz maina a tam rozbudowany w opcje switch. Użytkownik może wpisać:
dodaj uczyć teach
dodaj sprawdzać check
dodaj rachunek check
Następnie użyć:
tłumacz uczyć
aplikacja powinna zwracać 'teach'
Jesli podamy słowo które nie istnieje zwróć "Brak tłumaczenia":
tłumacz ławka
Brak tłumaczenia
 */

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor

public class Slownik {
    private Map<String, List<String>> map;

    public void dodajTlumaczenie(String poPolsku, String... poAngielsku) {
        List<String> list = new ArrayList<String>();
        for (String element : poAngielsku) {
            list.add(element);
        }
        map.put(poPolsku, list);
    }

    public void sprawdzTlumaczenie(String poPolsku) {
        if (map.containsKey(poPolsku)) {
            System.out.println(poPolsku + " : " + map.get(poPolsku));
        } else {
            System.out.println("Brak tłumaczeń.");
        }
    }
}
