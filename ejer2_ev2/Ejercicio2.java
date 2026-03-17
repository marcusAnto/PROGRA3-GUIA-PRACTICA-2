package ejer2_ev2;

import java.util.*;

/**
 *
 * @author Marco Antonio Perez Hernandez 25-2318-2023
 */
public class Ejercicio2 {
    
    private final ArrayList<String> lista = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void iniciar() {

        System.out.println("INGRESAR 10 DATOS:");

        for (int i = 0; i < 10; i++) {
            System.out.print("DATOS " + (i + 1) + ": ");
            lista.add(sc.nextLine());
        }

        int opcion;

        do {

            limpiar();

            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1 -> agregar();

                case 2 -> actualizar();

                case 3 -> eliminar();

                case 4 -> mostrarAZ();

                case 5 -> mostrarZA();

                case 6 -> System.out.println("PROGRAMA FINALIZADO.");

                default -> System.out.println("OPCION NO VALIDA.");
            }

            if (opcion != 6) {
                System.out.println("\nENTER PARA CONTINUAR...");
                sc.nextLine();
            }

        } while (opcion != 6);

    }

    private void mostrarMenu() {

        System.out.println("===== MENU =====");
        System.out.println("1. INGRESAR DATO");
        System.out.println("2. ACTUALIZAR DATO");
        System.out.println("3. ELIMINAR DATO");
        System.out.println("4. MOSTRAR A-Z");
        System.out.println("5. MOSTRAR Z-A");
        System.out.println("6. SALIR");
        System.out.print("ELIGE UNA OPCION: ");

    }

    private void agregar() {

        System.out.print("NUEVO DATO: ");
        lista.add(sc.nextLine());
        System.out.println("DATO AGREGADO.");

    }

    private void actualizar() {

        System.out.print("DATO A ACTULIZAR: ");
        String buscar = sc.nextLine();

        if (lista.contains(buscar)) {

            int pos = lista.indexOf(buscar);

            System.out.print("NUEVO DATO: ");
            lista.set(pos, sc.nextLine());

            System.out.println("DATO ACTUALIZADO.");

        } else {

            System.out.println("EL DATO NO EXISTE.");

        }

    }

    private void eliminar() {

        System.out.print("DATO A ELIMINAR: ");
        String eliminar = sc.nextLine();

        if (lista.remove(eliminar)) {

            System.out.println("DATO ELIMINADO.");

        } else {

            System.out.println("EL DATO NO EXISTE.");

        }

    }

    private void mostrarAZ() {

        ArrayList<String> copia = new ArrayList<>(lista);
        Collections.sort(copia);

        System.out.println("LISTADO DE A-Z:");
        copia.forEach(System.out::println);

    }

    private void mostrarZA() {

        ArrayList<String> copia = new ArrayList<>(lista);
        Collections.sort(copia);
        Collections.reverse(copia);

        System.out.println("LISTADO DE Z-A:");
        copia.forEach(System.out::println);

    }

    private void limpiar() {

        for (int i = 0; i < 25; i++) {
            System.out.println();
        }

    }
}
