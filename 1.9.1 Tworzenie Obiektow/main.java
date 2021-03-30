class main {

    static MojeDane mojeDane;
    public static void main(String [] args)
    {
        init();
        System.out.println(mojeDane.toString());
    }

    private static void init()
    {
        mojeDane = new MojeDane();
        mojeDane.imie = "Adrian";
        mojeDane.nazwisko = "Ziębowski";
        mojeDane.klasa = "2PTN";
    }
}