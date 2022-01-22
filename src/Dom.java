public class Dom implements Budynek{

    private double powBudynku;
    private double powPodworka;
    private double powParkingu;
    private double powierzchnia;
    private double cena;
    private String miejscowosc;
    private String ulica;
    private int nrDomu;
    private String nrLokalu;
    private String kodPocztowy;
    private int value;
    private KolorEnum kolor;


    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        return powBudynku = 12.5;
    }

    @Override
    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy) {
        return null;
    }

    @Override
    public void liczbaOkien(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public void liczbaMieszkancow(int value)
    {
        this.value = value;
    }

    @Override
    public void kolorDomu(KolorEnum kolor)
    {
        this.kolor = kolor;
    }

    public KolorEnum getKolor()
    {
        return kolor;
    }

    @Override
    public double wyliczCene(double powierzchnia, double cena) {
        return 2000;
    }

    public void podsumowanie()
    {
        System.out.println("Cena powierzchni wynosi: " + cena);
    }
}
