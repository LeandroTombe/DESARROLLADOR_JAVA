package Password;

import java.util.Random;

public class Password {
    private String contrasenia;
    private int longitud;


    public Password(int longitud){
        this.longitud=longitud;
        contrasenia=generarContrasenia();
    }
    public Password(){
        this.longitud=8;
        contrasenia= generarContrasenia();
    }

    public Boolean esFuerte(){
       int longitudPassword= this.contrasenia.length();
       int cantidadMayuscula=0;
       int cantidadMinuscula=0;
       int cantidadNumeros=0;
        for (int i = 0; i <longitudPassword ; i++) {
            if (Character.isDigit(contrasenia.charAt(i)) ){
                cantidadNumeros+=1;
            } else if (Character.isUpperCase(contrasenia.charAt(i))){
                cantidadMayuscula+=1;
            } else if (Character.isLowerCase(contrasenia.charAt(i))){
                cantidadMinuscula +=1;
            }
        }

        if ( cantidadNumeros>=5 && cantidadMayuscula>=2 && cantidadMinuscula>=1){
            return true;
        }

        return false;
    }


    private String generarContrasenia(){
        Random random= new Random();
        StringBuilder contrasenia= new StringBuilder();

        int cantMinus= this.longitud*13/100;
        int cantMayus= this.longitud*25/100;
        int cantDigit= this.longitud*63/100;

        for (int i = 0; i <cantMinus ; i++) {
            char minuscula= (char) (random.nextInt(26)+ 'a');
            contrasenia.append(minuscula);
        }

        for (int i= 0; i<cantMayus;i++){
            char mayuscula= (char) (random.nextInt(26)+ 'A');
            contrasenia.append(mayuscula);
        }

        for (int i=0; i<cantDigit;i++){
            char digito = (char) (random.nextInt(10) + '0');
            contrasenia.append(digito);
        }

        return String.valueOf(contrasenia);

    }

    @Override
    public String toString() {
        return "Password{" +
                "contrasenia='" + contrasenia + '\'' +
                ", longitud=" + longitud +
                '}';
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
