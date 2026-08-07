package models;

public class CuentaCorriente extends CuentaBancaria{
    private double limiteSobregiro;

    @Override
    public void retirar(double monto){
        super.saldo =- monto;

        if (super.saldo > limiteSobregiro) {
            System.out.println("Monto extraido");
        }else{
            super.saldo =+ monto;
            System.out.println("No se puede realizar la operacion, monto excede al sobre-giro");
        }
    }
}
