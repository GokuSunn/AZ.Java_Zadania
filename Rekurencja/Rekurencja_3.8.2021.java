
class Rekurencja {
    public static void main(String [] args){
        //rekurencja(5);
        //System.out.println(zwracamJedynke());
        //System.out.println(zwracamTekst());
        //System.out.println(zwracamPotegeWprowadzonejLiczby(5));
        int wartosc = sumaDwochNajwiekszycLiczb(5, 6, 3)
        System.out.println(wartosc);
        wartosc = sumaDwochNajwiekszycLiczb(7, 6, 9);
        System.out.println(sumaDwochNajwiekszycLiczb(5, 6, 3));
        System.out.println(sumaDwochNajwiekszycLiczb(7, 6, 9));
        System.out.println(sumaDwochNajwiekszycLiczb(5, 6, 6));
    }

    private static int sumaDwochNajwiekszycLiczb(int a, int b, inc c){
        int suma = 0;
        if(a>b && b>c){
            suma = a+b;
        } else if(a>b && c>b){
            suma = a+c;
        } else if(b>a && c>a){
            suma = a+c;
        } else if(b>a && b>c)

        return suma;
    }

    private static int zwracamPotegeWprowadzonejLiczby(int liczba){
        return liczba*liczba;
    }

    private static int zwracamJedynke(){
        return 1;
    }

    private static String zwracamTekst(){
        return "Zwracam Stringa";
    }

    private static int rekurencja(int i){
        if(i>0){
            System.out.println("rekurencja "+i);
            i--;
        } else{
            return 0;
        }        
        rekurencja(i);
        return -1;
    }
}