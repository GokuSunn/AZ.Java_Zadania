
public class Kolo
{
    private double liczba_pi = 3.1415;
    private double promien_kola = 4.20;

    public double pole_kola;
    public double obwod_kola;

    public void pole_kola()
    {
        double pole_kola = (promien_kola * promien_kola) * liczba_pi;        
    }

    public void obwod_kola()
    {
        double obwod_kola = (promien_kola + promien_kola) * liczba_pi;
    }    
}