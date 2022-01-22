
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI,
        b) zadeklarować 2 metody,

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI,
        d) zadeklarować 3 metody,

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI,
        f) zadeklarować 3 metody,
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI,
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI,
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować:
        --Code/Prawy myszy-->Generate-->getters/setters/toString),
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */

        Student student1 = new Student();
        student1.setImie("Andrzej");
        student1.setNazwisko("Antagonista");
        student1.setWaga(65);
        student1.setWzrost(187);
        student1.setSemestr(4);
        System.out.println(student1.toString());

        Student student2 = new Student();
        student2.setImie("Barbara");
        student2.setNazwisko("Bachor");
        student2.setWaga(59);
        student2.setWzrost(173);
        student2.setSemestr(3);
        System.out.println(student1.toString());

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setImie("Cecylia");
        pracownik1.setNazwisko("Cudna");
        pracownik1.setWaga(68);
        pracownik1.setWzrost(168);
        pracownik1.setStanowisko("Wykladowca");
        System.out.println(pracownik1.toString());

        Pracownik pracownik2 = new Pracownik();
        pracownik2.setImie("Damian");
        pracownik2.setNazwisko("Doigralski");
        pracownik2.setWaga(77);
        pracownik2.setWzrost(171);
        pracownik2.setStanowisko("Ochroniaz");
        System.out.println(pracownik2.toString());

        /* zad.4* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę,
        b) dokończyć implementację metod z interfejsów,
        c) stworzyć pola w metodzie main() i wywołać metody
        */
    }
}
