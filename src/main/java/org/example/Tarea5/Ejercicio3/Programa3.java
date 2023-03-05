package org.example.Tarea5.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Programa3 {

       public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            List<Integer> arr = new ArrayList<>();
            int valor = 0;
            while (valor != -1) {
                System.out.println("¿Nota?-(0-10), -1 para realizar la media");
                valor = teclado.nextInt();
                if (valor >= 0 && valor <= 10) {
                    arr.add(valor);
                } else if (valor != -1) {
                    System.out.println("Otro valor, por favor o -1 para terminar...");
                }
            }

            int suma = 0;
            for (int i = 0; i < arr.size(); i++) {
                suma += arr.get(i);
            }
            System.out.println("La media es: " + suma / arr.size());
        }
    }

