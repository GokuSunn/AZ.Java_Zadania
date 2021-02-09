import java.util.Scanner;

public class example
{
    public static void main(String [] args)
    {
        Scanner az = new Scanner(System.in);
        //FileWriter file = new FileWriter("Zapis", true);

        System.out.println("Wybierz: kwadrat / prostokat");        
        String or = az.nextLine();  

        String value1 = "kwadrat";
        String value2 = "prostokat";

        System.out.println("Podaj wielkość pola (1): ");  
        int pierwsza = az.nextInt();
        System.out.println("Podaj wielkość pola (2): "); 
        int druga = az.nextInt();       
        
        try
        {        
            if(or.equals(value1))
            {
                System.out.println("1");                
            }else if(or.equals(value2))
            {
                System.out.println("2");
            }        
        }catch(Exception e){
            System.out.print("Error");
        }
    }
}