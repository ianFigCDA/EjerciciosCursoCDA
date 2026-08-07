package models;

public class PlazoFijo extends Producto{
    private int plazoDias;
    private double tasaInteres;

    public void simularVencimiento(){
        double montoFinal;
        montoFinal = super.saldo * (tasaInteres / 100.0) * (plazoDias / 365.0);
        System.out.println("El monto final es: " + montoFinal);


    }
}
