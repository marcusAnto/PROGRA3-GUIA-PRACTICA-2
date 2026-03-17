package ejer4_ev2;

import java.util.*;

/**
 *
 * @author Marco Antonio Perez Hernandez
 */
class Ejercicio4 {
    
    public void ejecutar() {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.print("CUANTOS DATOS DESEA INGRESAR?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("INGRESE DATO " + (i + 1) + ": ");
            lista.add(sc.nextLine());
        }

        int[] letras = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            letras[i] = lista.get(i).length();
        }

        System.out.println("\nRESULTAODO:\n");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " -> " + letras[i] + " letras");
        }

    }
}
