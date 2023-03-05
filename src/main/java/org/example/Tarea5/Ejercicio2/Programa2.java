package org.example.Tarea5.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        int valor = 0;
        while (valor != -1) {
            System.out.println("Introduce un valor comprendido entre 0 y 9, -1 para salir del programa:");
            valor = teclado.nextInt();
            if (valor >= 0 && valor <= 9) {
                arr.add(valor); // Añade el valor al final de la lista
            } else if (valor != -1) {
                System.out.println("Otro valor, por favor o -1 para terminar...");
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Cantidad de " + i + ": " + arr.get(i));
        }
    }
}
