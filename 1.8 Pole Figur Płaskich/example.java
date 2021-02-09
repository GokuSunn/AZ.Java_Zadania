import java.util.Scanner;

public class example
{
    public static void main(String [] args)
    {
        Scanner az = new Scanner(System.in);        

        System.out.println("Wybierz: kwadrat / prostokat");        
        String or = az.nextLine();  

        String value1 = "kwadrat";
        String value2 = "prostokat";

        try
        {        
            if(or.equals(value1))
            {
                System.out.println("Podaj wielkość pola (1): ");  
                int szer1 = az.nextInt();                 

                int pkwadr = szer1 * szer1;

                int obkwadr = szer1 + szer1 + szer1 + szer1;

                if(or.equals(value1)){
                    System.out.println("Pole kwadratu wynosi: "+pkwadr);
                    System.out.println("Obwód kwadratu wynosi: "+obkwadr);
                }else{            
                }

                for (int i = 0; i < szer1; i++)

            {

                for (int j = 0; j < szer1; j++)

                    if((i == 0)||(i == szer1-1))

                    	System.out.print("*");

                    else

                    if((j == 0)||(j == szer1-1))System.out.print("*");

                    else System.out.print(" "); 

                System.out.println();
            }        

            }else if(or.equals(value2))            
            {
                System.out.println("Podaj wielkość pola (1): ");  
                int szer2 = az.nextInt();
                System.out.println("Podaj wielkość pola (2): "); 
                int wys2 = az.nextInt();

                int pprost = wys2 * szer2;
                int obprost = wys2 + wys2 + szer2 + szer2;

                if(or.equals(value2)){
                    System.out.println("Pole prostokątu wynosi: "+pprost);
                    System.out.println("Obwód kwadratu wynosi: "+obprost);
                }else{           
        
                }                

                for (int i = 0; i < wys2; i++)

            {

                for (int j = 0; j < szer2; j++)

                    if((i == 0)||(i == wys2-1))

                    	System.out.print("*");

                    else

                    if((j == 0)||(j == szer2-1))System.out.print("*");

                    else System.out.print(" "); 

                System.out.println();
            } 
            }       
        }catch(Exception e){
            System.out.print("Error");
        }                
        
        Scanner az1 = new Scanner(System.in);

        System.out.println("Wpisz EXIT aby zamknąć program!");
        String exit = az1.nextLine();                

        if(exit.equals("EXIT")){            
            System.exit(1);
        }else{
            System.out.print("Nie poprawna komenda");
        }return;        
    }
}