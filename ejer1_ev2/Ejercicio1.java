package ejer1_ev2;

import java.util.*;

/**
 *
 * @author Marco Antonio Perez Hernandez 25-2318-2023
 */
public class Ejercicio1 {
    public void ejecutar() {

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[8];
        int[] array2 = new int[8];

        System.out.println("INGRESE OCHO NUMEROS ENTEROS:");

        for (int i = 0; i < array1.length; i++) {

            while (true) {
                try {
                    System.out.print("NUMERO " + (i + 1) + ": ");
                    array1[i] = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("FAVOR DE INGRESAR SOLO NUMEROS.");
                }
            }

            array2[i] = array1[i] * 3;
        }

        System.out.println("\nARRAY 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nARRAY 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}