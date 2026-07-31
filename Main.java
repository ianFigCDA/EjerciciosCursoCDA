import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Código a ejecutar
        // *
        // Ejercicios

        // Crear un proyecto básico en Java con método Main
        // * Invocar un método que imprima un listado de nombres (Lista de String)
        System.out.println("-------- Ejercicio 1 -----------");
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ian");
        nombres.add("Gonzalo");
        nombres.add("Alejandro");
        nombres.add("Adriana");

        nombres.forEach(f -> System.out.println(f));

        System.out.println("Forma de foreach: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // * Invocar un método que dada una lista de String y un String como parámetro,
        // retorne si la lista contiene el String
        // (si al menos un elemento es igual)
        System.out.println("-------- Ejercicio 2 -----------");
        ArrayList<String> lista = new ArrayList<>();
        String nombreFruta = "Kiwi";

        lista.add("Banana");
        lista.add("Sandia");
        lista.add("Melon");

        for (String e : lista) {
            if(e == nombreFruta){
                System.out.println("Encontre la fruta en mi lista");
            }else{
                System.out.println("No se encontro la fruta en la lista");
            }
        }

        // * Invocar un método que dada una lista de String y un String como parámetro,
        // retorne una nueva lista con los elementos de la misma
        // que contienen ese String (ejemplo el String "Juan Melo" contiene al String
        // "Melo");
        System.out.println("-------- Ejercicio 3 -----------");
        // * invocar un método que genere un Map (clave Long y valor String).
        // Luego invocar a un método que dado este Map retorne si una clave existe o no
        // Luego otro método que dado ese mismo map retorne el valor de una clave.
        
        System.out.println("Hola Mundo");
    }
}