public interface StudentI extends CzlowiekI
{

    public static void wypiszImie(String imie)
    {
        System.out.println("Ta osoba ma na imie: " + imie);
    }

    public static void wypiszNazwisko(String nazwisko)
    {
        System.out.println("Jego nazwisko to: " + nazwisko);
    }

    public static void wypiszSemetsr(int semestr)
    {
        System.out.println("Uczy sie w: " + semestr + "semestrze.");
    }

}
