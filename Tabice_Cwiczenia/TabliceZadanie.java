import java.util.Random;

class TabliceZadanie
{
    public static void main(String [] args){
        tablica();        
    }

    private static void tablica(){         

        Random r = new Random();        
        int [] tabocena = new int[10];
        
        String tab1[] = {"Marek","Janek","Paweł","Kamil","Mateusz","Maciej","Jakub","Aleksander","Łukasz","Hubert","Piotr"};
        String tab2[] = {"Jabłonowski","Malinowski","Orłowski","Kwaśniewski","Stoch","Kaminśki","Kowalski","Benz","Dziewiąty","Olepa"};
        
        for (int i=0;i<tabocena.length;i++){
            tabocena[i] = r.nextInt(10);
        }
        for(int i=0;i<tab1.length;i++){
            System.out.println(i+" - "+tab1[i]+" "+tab2[i]+" -- "+tabocena);
        }
    }        
}