import Persona.Persona;
import Persona.Sexo;


public class MainPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("leandr", 25,74.0,178,Sexo.HOMBRE);

        System.out.println(persona1.calcularIMC());


        System.out.println(persona1.toString());


    }
}
