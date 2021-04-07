
class ZiebowskiAdrian
{
    static Sprawdzian sprawdzian;
    static Dane dane;
    static Tablica tablica;
    static Tablica tablica2;

    public static void main(String [] args)
    {
        init();
        System.out.println(sprawdzian.toString());
        System.out.println(dane.toString());
        
    }

    private static void init()
    {
        sprawdzian = new Sprawdzian();
        sprawdzian.data = "2021-04-07";
        sprawdzian.ocena = 6;
        sprawdzian.nazwa_przedmiotu = "Obiektowe, ale na desktopowych";     
        
        dane = new Dane();
        dane.imie = "Adrian";
        dane.nazwisko = "Ziębowski";
        dane.data_urodzenia = "13.04.2005";            
    }
}