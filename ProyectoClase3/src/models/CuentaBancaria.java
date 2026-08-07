package models;

public class CuentaBancaria extends Producto{

    public void depositar(double monto){
        super.saldo =+ monto;
        System.out.println("Se depositó correctamente el monto: " + monto);
        System.out.println("Su nuevo monto es: " + super.saldo);
    }

    public void retirar(double monto){
        super.saldo =- monto;
        System.out.println("Se retiró correctamente el monto: " + monto);
        System.out.println("Su nuevo monto es: " + super.saldo);
    }
    
}
