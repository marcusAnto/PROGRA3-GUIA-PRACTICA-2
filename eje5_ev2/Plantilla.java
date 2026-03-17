package eje5_ev2;

import java.util.*;

/**
 *
 * @author Marco Antonio Perez Hernandez 25-2318-2023
 */
class Plantilla {
private final LinkedList<String> colores = new LinkedList<>();
    private final Scanner sc = new Scanner(System.in);

    public Plantilla() {

        colores.add("ROJO");
        colores.add("AZUL");
        colores.add("VERDE");
        colores.add("GRIS");
        colores.add("MORADO");
        colores.add("BLANCO");
        colores.add("AQUA");

    }
    
    public void mostrarLista(String mensaje) {

        System.out.println("\n" + mensaje);

        for (String color : colores) {
            System.out.print(color + " ");
        }
        System.out.println("\n");
    }

    public void buscarYReemplazar() {

        System.out.print("INGRESE UN COLOR PARA BUSCAR: ");
        String buscar = sc.nextLine().toUpperCase();

        boolean encontrado = false;
        ListIterator<String> it = colores.listIterator();

        while (it.hasNext()) {
            String actual = it.next();

            if (actual.equals(buscar)) {
                encontrado = true;
                System.out.print("INGRESAR UN NUEVO VALOR: ");
                String nuevo = sc.nextLine().toUpperCase();
                it.set(nuevo);
                System.out.println("\nINFORMACION ACTULIZADA.");
            }
        }

        if (!encontrado) {

            System.out.println("\nNO HUBO CAMBIOS.");
        }
        mostrarLista("LISTADO LUEGO DEL REMPLAZO:");

    }
}
