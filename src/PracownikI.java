public interface PracownikI extends CzlowiekI
{

    public static void wypiszImie(String imie)
    {
        System.out.println("Ta osoba ma na imie: " + imie);
    }

    public static void wypiszNazwisko(String nazwisko)
    {
        System.out.println("Jego nazwisko to: " + nazwisko);
    }

    public static void wypiszStanowisko(String stanowisko)
    {
        System.out.println("Ta osoba pracuje na stanowisku: " + stanowisko);
    }
}
