import java.util.Arrays;
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("palabra 1:");
        String palabra1= entrada.nextLine();
        System.out.println("palabra 2:");
        String palabra2= entrada.nextLine();

        char[] arraypalabra1= palabra1.toLowerCase().replaceAll(" ","").toCharArray();
        Arrays.sort(arraypalabra1);

        char[] arraypalabra2=palabra2.toLowerCase().toCharArray();
        Arrays.sort(arraypalabra2);

        if (Arrays.equals(arraypalabra1,arraypalabra2)){
            System.out.println("es anagrama");
        } else{
            System.out.println("no es anagrama");
        }






    }

    private static Boolean esPalidromo(String palabra){
        int ultimo= palabra.length()-1;
        for (int i = 0; i <palabra.length() ; i++) {
            if (palabra.charAt(i)!= palabra.charAt(ultimo-i)){

                return false;
            }
        }
        return  true;
    }

}
