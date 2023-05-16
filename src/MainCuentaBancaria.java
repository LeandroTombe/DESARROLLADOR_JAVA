import CuentaBancaria.Cuenta;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        Cuenta cuenta1= new Cuenta("leandro");

        cuenta1.ingresar(3000.00);
        cuenta1.ingresar(10.4576767);
        cuenta1.ingresar(-1000.0);
        cuenta1.retirar(2600.00);
        cuenta1.retirar(500.0);
        System.out.println(cuenta1.toString());
    }
}