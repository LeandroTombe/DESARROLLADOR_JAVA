import Password.Password;

import java.util.Random;

public class MainPassword {
    public static void main(String[] args) {
        Password password1 = new Password();


        System.out.println(password1.toString());


        Password password2= new Password(30);
        System.out.println(password2);

        System.out.println(password1.esFuerte());
        System.out.println(password2.esFuerte());

    }
}
