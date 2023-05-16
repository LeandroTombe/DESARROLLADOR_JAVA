package Persona;

import java.util.Random;

public class Persona {

    //create the type of num for the exercise

    private String nombre;
    private Integer edad;
    private String DNI;

    private Double peso;
    private Integer altura;
    private Sexo sexo;

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.sexo= Sexo.HOMBRE;
        this.peso=0.0;
        this.altura=0;
        this.DNI=generarDNI();
    }

    public Persona(String nombre, Integer edad, Sexo sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=0.0;
        this.altura=0;
        this.DNI=generarDNI();
    }

    public Persona(String nombre, Integer edad, Double peso, Integer altura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.DNI = generarDNI();
    }

    private Double CentimetroaMetro(){
        return (altura/100.0);
    }

    public int calcularIMC(){
        Double altura= CentimetroaMetro();
        int pesoIdeal= (int)(this.peso/(altura*altura));

        if (pesoIdeal<20){
            return -1;
        } else if (pesoIdeal>=20 && pesoIdeal<=25 ) {
            return 0;
        }

        return 1;
    }

    private String generarDNI(){
        Random random= new Random();
        int numero= random.nextInt(90000000)+10000000;
        return String.valueOf(numero);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }
}
