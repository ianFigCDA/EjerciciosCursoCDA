import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
            if (e == nombreFruta) {
                System.out.println("Encontre la fruta en mi lista");
            } else {
                System.out.println("No se encontro la fruta en la lista");
            }
        }

        // * Invocar un método que dada una lista de String y un String como parámetro,
        // retorne una nueva lista con los elementos de la misma
        // que contienen ese String (ejemplo el String "Juan Melo" contiene al String
        // "Melo");
        System.out.println("-------- Ejercicio 3 -----------");
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombreCompleto = new ArrayList<>();
        ArrayList<String> encontrado = new ArrayList<>();

        nombreCompleto.add("Leonel Messi");
        nombreCompleto.add("Cristiano Ronaldo");
        nombreCompleto.add("Fernando Perez");

        System.out.println("Di un nombre o apellido: ");
        String ap = sc.nextLine();
        String minusc = ap.toLowerCase();

        for (int i = 0; i < nombreCompleto.size(); i++) {
            String minusc2 = nombreCompleto.get(i).toLowerCase();
            if (minusc2.contains(minusc)) {
                System.out.println("Se encontro el nombre o apellido..");
                encontrado.add(ap);
                i = nombreCompleto.size();
            }
        }

        for (String e : encontrado) {
            System.out.println("Apellido encontrado: " + e);
        }

        // * invocar un método que genere un Map (clave Long y valor String).
        // Luego invocar a un método que dado este Map retorne si una clave existe o no
        // Luego otro método que dado ese mismo map retorne el valor de una clave.

        System.out.println("-------- Ejercicio 4 -----------");

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Futbol");
        map.put(2, "Voley");
        map.put(3, "Natacion");

        System.out.println(existeMap(map, 1));


        /*
        Encontrar en la lista de apellidos, el apellido por teclado y guardarlo en 
        otra lista de apellidos encontrados

        System.out.println("-------- Ejercicio Extra -----------");
        Scanner sc = new Scanner(System.in);

        ArrayList<String> apellidos = new ArrayList<>();
        ArrayList<String> apellidosEncontrados = new ArrayList<>();

        apellidos.add("Messi");
        apellidos.add("Apellido");
        apellidos.add("Montaner");
        apellidos.add("Perez");

        System.out.println("Di un apellido: ");
        String ap = sc.nextLine();

        for (int i = 0; i < apellidos.size(); i++) {
            if (apellidos.get(i).equals(ap)) {
                System.out.println("Se encontro el apellido..");
                apellidosEncontrados.add(ap);
            }
        }

        for (String e : apellidosEncontrados) {
            System.out.println("Apellido encontrado: " + e);
        }

        */
    }

    public static boolean existeMap(Map<Integer, String> mapa, Integer key){
            return mapa.containsKey(key);
    }
}