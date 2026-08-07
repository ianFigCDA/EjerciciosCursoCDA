package models;

public class Producto {
    protected String numeroProducto;
    protected String clienteId;
    protected double saldo;

    public Producto(){
        System.out.println("Se creo un producto");
    };

    public void consultarEstado() {
        System.out.println("Este producto tiene id: " + numeroProducto + ". \n Su precio es: " + saldo);
    }
}
