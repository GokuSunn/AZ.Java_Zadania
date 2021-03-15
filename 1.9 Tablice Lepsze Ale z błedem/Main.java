import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

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
                
                try{
                    File file = new File("baza.txt");
                    Scanner sc = new Scanner(file);            
                    String zdanie;                        
                    while((zdanie = sc.nextLine()) != null) System.out.println(zdanie);                                               
                }catch(FileNotFoundException ex){
                    System.out.println("Błąd");
                }

                break;

            case "2":
                try{
                    File file = new File("dane.txt");
                    Scanner sc = new Scanner(file);            
                    String zdanie;                        
                    while((zdanie = sc.nextLine()) != null) System.out.println(zdanie);                                               
                }catch(FileNotFoundException ex){
                    System.out.println("Błąd");
                }
                
            break;

            case "3":
                try{
                    File file = new File("jelenie.txt");
                    Scanner sc = new Scanner(file);            
                    String zdanie;                        
                    while((zdanie = sc.nextLine()) != null) System.out.println(zdanie);                                               
                }catch(FileNotFoundException ex){
                    System.out.println("Błąd");
                }
                
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
    