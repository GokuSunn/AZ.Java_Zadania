class main {

    static MojeDane mojeDane; 
    static Logowanie logowanie;   
    
    public static void main(String [] args)
    {
        init();        
        System.out.println(mojeDane.toString());    
        System.out.println(logowanie.toString());    
    }

    private static void init()
    {
        mojeDane = new MojeDane();
        mojeDane.imie = "Adrian";
        mojeDane.nazwisko = "Ziębowski";
        mojeDane.klasa = "2PTN";

        logowanie = new Logowanie();
        logowanie.login = "WeeWooWeeWee";
        logowanie.haslo = "2515ASD6244f@";

    }    
}