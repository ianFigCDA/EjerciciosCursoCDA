package models;

public class TarjetaCredito extends Producto{
    private double limiteCredito;

    public void pagarConTarjeta(double monto){
        limiteCredito -= super.saldo;
        System.out.println("Se bajó el limite de la tarjeta, quedara: " + limiteCredito);
    }

    public void pagarTarjeta(double monto){
        limiteCredito += super.saldo;
        System.out.println("Se incrementó el limite de la tarjeta, quedara: " + limiteCredito);
    }
}
