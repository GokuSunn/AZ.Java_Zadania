import java.util.Scanner;
import java.util.Random;
import javax.sound.midi.SysexMessage;

class tablice{
    public static void main(String [] args)
    {
        pierwsze();
        menu();
    }

    public static void pierwsze()
    {
        System.out.println("====================");

        String[] tabImie = new String[10];
        tabImie[0] = "Magda";
        tabImie[1] = "Tomasz";
        tabImie[2] = "Michał";
        tabImie[3] = "Mateusz";
        tabImie[4] = "Tymek";
        tabImie[5] = "Szpaku";
        tabImie[6] = "Igor";
        tabImie[7] = "Harry";
        tabImie[8] = "Anna";
        tabImie[9] = "Amelia";

        String[] tabNazw = new String[10];
        tabNazw[0] = "Stara";
        tabNazw[1] = "Gwiazda";
        tabNazw[2] = "Dobrychłop";
        tabNazw[3] = "Masnyted";
        tabNazw[4] = "Techno";
        tabNazw[5] = "ToSyf";
        tabNazw[6] = "Sz";
        tabNazw[7] = "Gmach";
        tabNazw[8] = "Slonce";
        tabNazw[9] = "Witt";

        Random rd = new Random(); 
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rd.nextInt(6); 
            System.out.println(tabImie[i]+"  "+tabNazw[i]+"  "+tab[i]);            
        }

        System.out.println("====================");

        System.out.println(" ");        
    }    
        


    public static void menu()
    {
        System.out.println("============================================");
        System.out.println("1. Całość");
        System.out.println("2. Z jednego woj");
        System.out.println("3. Wartość jelenia w 2009r i 2010r");
        System.out.println("4. To nic nie robi");
        System.out.println("5. Zamknij");
        System.out.println("============================================");

        Scanner az = new Scanner(System.in);
        String number = az.nextLine();        
        
        switch(number){
            case "1":
                //System.out.println("");
                System.out.println("Jednostka            Jelenie                                        Sarny                                            Dziki");
                System.out.println("terytorialna                                                                                                                                          ");
                System.out.println("                     ilosc     wartosc    wartosc      wartosc       ilosc      ilosc      wartosc      wartosc    ilosc     ilosc     wartosc    wartosc ");
                System.out.println("                     2009      2010       2009         2010          2009       2010       2009         2010       2009      2010      2009       2010");
                System.out.println("(t)                   ");
                System.out.println("ŁÓDZKIE            | 36        50         2254         374           48         64         4104         673        12        17        306        68");
                System.out.println("MAZOWIECKIE	   | 43        257        2603         22158         51         222        4809         26132      13        202       31         9942");
                System.out.println("MAŁOPOLSKIE	   | 78        89         5132         6894          54         52         5189         535        9         13        344        628"); 
                System.out.println("ŚLĄSKIE		   | 115       119        7602         8937          74         70         633          666        138       155       4121       5392");
                System.out.println("LUBELSKIE	   | 31        54         197          4565          60         82         5592         9486       14        59        37         2479");
                System.out.println("PODKARPACKIE       | 262       187        16766        15094         127        104        12126        12756      39        48        1238       2084");
                System.out.println("PODLASKIE          | 86        130        5151         9388          36         50         3134         5333       18        76        462        4799");
                System.out.println("ŚWIĘTOKRZYSKIE	   | 14        20         918          1443          16         16         1576         165        3         3         72         177"); 
                System.out.println("LUBUSKIE	   | 233       224        14571        17175         135        108        12633        12034      196       254       5503       11966");   
                System.out.println("WIELKOPOLSKIE	   | 314       317        19526        23095         211        183        20361        19856      259       419       7039       17662");    
                System.out.println("ZACHODNIOPOMORSKIE | 562       657        35519        4753          251        243        23971        26632      597       970       16909      4364"); 
                System.out.println("DOLNOŚLĄSKIE	   | 286       275        1953         22537         223        207        20763        22068      243       352       7239       1553");   
                System.out.println("OPOLSKIE	   | 269       189        1848         1457          172        107        13472        9883       372       271       11159      10441");    
                System.out.println("KUJAWSKO-POMORSKIE | 149       196        917          1436          86         86         8388         9564       64        127       1577       5224");    
                System.out.println("POMORSKIE	   | 228       263        14033        18961         106        97         1018         1070       69        158       1654       6723");    
                System.out.println("WARMIŃSKO-MAZURSKIE| 310       393        18902        29731         170        218        16048        24764      255       519       7094       24186");                    
            break;

            case "2":
                System.out.println("Jednostka            Jelenie                                        Sarny                                            Dziki");
                System.out.println("terytorialna                                                                                                                                          ");
                System.out.println("                     ilosc     wartosc    wartosc      wartosc       ilosc      ilosc      wartosc      wartosc    ilosc     ilosc     wartosc    wartosc ");
                System.out.println("                     2009      2010       2009         2010          2009       2010       2009         2010       2009      2010      2009       2010");
                System.out.println("(t)                   ");                
                System.out.println("LUBUSKIE	   | 233       224        14571        17175         135        108        12633        12034      196       254       5503       11966");   
                  
            break;

            case "3":
                System.out.println("Jednostka            Jelenie                                        ");
                System.out.println("terytorialna                                                                                                                                          ");
                System.out.println("                     ilosc     wartosc    wartosc      wartosc       ");
                System.out.println("                     2009      2010       2009         2010          ");
                System.out.println("(t)                   ");
                System.out.println("ŁÓDZKIE            | 36        50         2254         374           ");
                System.out.println("MAZOWIECKIE	   | 43        257        2603         22158         ");
                System.out.println("MAŁOPOLSKIE	   | 78        89         5132         6894          "); 
                System.out.println("ŚLĄSKIE		   | 115       119        7602         8937          ");
                System.out.println("LUBELSKIE	   | 31        54         197          4565          ");
                System.out.println("PODKARPACKIE       | 262       187        16766        15094         ");
                System.out.println("PODLASKIE          | 86        130        5151         9388          ");
                System.out.println("ŚWIĘTOKRZYSKIE	   | 14        20         918          1443          "); 
                System.out.println("LUBUSKIE	   | 233       224        14571        17175         ");   
                System.out.println("WIELKOPOLSKIE	   | 314       317        19526        23095         ");    
                System.out.println("ZACHODNIOPOMORSKIE | 562       657        35519        4753          "); 
                System.out.println("DOLNOŚLĄSKIE	   | 286       275        1953         22537         ");   
                System.out.println("OPOLSKIE	   | 269       189        1848         1457          ");    
                System.out.println("KUJAWSKO-POMORSKIE | 149       196        917          1436          ");    
                System.out.println("POMORSKIE	   | 228       263        14033        18961         ");    
                System.out.println("WARMIŃSKO-MAZURSKIE| 310       393        18902        29731         ");
            break;

            case "4":
                System.out.println("tutaj sie nic nie robi... :(");
            break;

            case "5":
                System.exit(1);
            break;            
        }      
                      
    }
}
    