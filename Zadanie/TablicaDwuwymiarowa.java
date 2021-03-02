

class TablicaDwuwymiarowa{

    public static void main(String [] args){
        int [][] tab2d = new int[2][2];        
        tab2d[0][0] = 1;
        tab2d[0][1] = 2;
        tab2d[1][1] = 3;
        tab2d[1][0] = 4;        

        for (int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
                System.out.println(" "+tab2d[i][j]);
            }            
        }

        tablicaTabliczkaMnożenia();
    }
    
        
    public static void tablicaTabliczkaMnożenia(){
        int [][] tab = new int[10][10];
        //Wypełnienei talbiczki.
        for (int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                tab[i][j] = (i+1)*(j+1);
            }            
        }

        System.out.println("tabliczka mnożenia:\n"); 
        for (int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();            
        }
    }
}