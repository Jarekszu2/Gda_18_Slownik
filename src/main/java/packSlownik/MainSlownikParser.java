package packSlownik;

import java.util.*;

public class MainSlownikParser {
    public static void main(String[] args) {
        System.out.println();

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Slownik slownik = new Slownik(map);
        System.out.println("Słownik polsko-angielski:");

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz komendę:\na: dodaj tłumaczenie\nb: sprawdź tłumaczenie\nw: wyjście");

        String poPolsku = "";
        char komenda = 'q';
        do {
            System.out.println();
            System.out.println("Podaj komendę:\na: dodaj tłumaczenie\nb: sprawdź tłumaczenie\nw: wyjście");
            komenda = scanner.next().charAt(0);
            switch (komenda) {
                case 'a':
                    System.out.println("Podaj polskie słowo:");
                    poPolsku = scanner.next();
                    System.out.println("Dodaj tłumaczenie na angielski słowa: " + poPolsku + " :\na: dodaj tłumaczenie\nk: koniec tłumaczeń");
                    List<String> list = new ArrayList<String>();
                    char tlumaczenia = 'a';
                    do {
                        System.out.println();
                        System.out.println("Podaj komendę: a lub k.");
                        tlumaczenia = scanner.next().charAt(0);
                        switch (tlumaczenia) {
                            case 'a':
                                System.out.println("Podaj tłumaczenie:");
                                String poAngielsku = scanner.next();
                                list.add(poAngielsku);
                                map.put(poPolsku, list);
                                break;
                            default:
                                if (tlumaczenia != 'k') {
                                    System.out.println("Wybierz a lub k!");
                                }
                        }
                    } while (tlumaczenia != 'k');
                    break;
                case 'b':
                    System.out.println("Podaj słowo do sprawdzenia:");
                    String slowo = scanner.next();
                    slownik.sprawdzTlumaczenie(slowo);
                    break;
                default:
                    if (komenda != 'w') {
                        System.out.println("Wybierz: a, b lub w!");
                    }
                    break;
            }
        } while (komenda != 'w');

    }
}
