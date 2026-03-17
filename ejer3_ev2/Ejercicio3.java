package ejer3_ev2;
import java.util.*;

/**
 *
 * @author Marco Antonio Perez Hernandez 25-2318-2023
 */
class Ejercicio3 {
    public void mostrarDatos() {

        LinkedHashMap<Integer, String> frutas = new LinkedHashMap<>();

        frutas.put(1, "Manzana");
        frutas.put(2, "Banano");
        frutas.put(3, "Naranja");
        frutas.put(4, "Mango");
        frutas.put(5, "Uva");

        ArrayList<Map.Entry<Integer, String>> lista =
                new ArrayList<>(frutas.entrySet());

        ListIterator<Map.Entry<Integer, String>> it =
                lista.listIterator(lista.size());

        System.out.println("DATOS A LA INVERSA:\n");

        while (it.hasPrevious()) {

            Map.Entry<Integer, String> elemento = it.previous();

            System.out.println(
                    "Clave: " + elemento.getKey() +
                    " | Valor: " + elemento.getValue()
            );

        }

    }   
}
