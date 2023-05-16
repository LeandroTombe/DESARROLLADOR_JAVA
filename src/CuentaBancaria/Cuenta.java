package CuentaBancaria;

public class Cuenta {
    private String titular;
    private Double cantidad;


    public Cuenta(){}

    public Cuenta(String titular){
        this.titular=titular;
        this.cantidad=0.00;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;

    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString(){
        return "titular:" + getTitular() + " cantidad:" + getCantidad() + "$";
    }

    public void ingresar(Double monto){
        if (monto<0){
            throw new Error("El monto no puede ser negativo");
        }else{
            this.cantidad=this.cantidad+monto;
            System.out.println("se ha agregador correctamente los " + monto + "$");
        }
    }

    public void retirar(Double monto){
        if (this.cantidad<monto){
            this.cantidad=0.0;
            System.out.println("Al ser el monto retirado mayor que la cnatidad pendiente, debimos pasarlo a 0.0");
        }else{
            this.cantidad=cantidad-monto;
            System.out.println("se ha restado: -"+ monto + "$");
        }
    }
}
