package org.example.Tarea5.Ejercicio6;

public class Programa6 {

    public static void main(String[] args) {
        int SIZE = 4;
        int i, j, val;
        int[][] tabla2dimensiones = new int[SIZE][SIZE];
        val = 1;
        for (j = 0; j < SIZE; j++) {
            for (i = 0; i < SIZE; i++) {
                tabla2dimensiones[j][i] = val;
                val = val + 1;
            }
        }



        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < SIZE; j++) {
                System.out.print(tabla2dimensiones[j][i] + " ");
            }
            System.out.println();
        }






    }
}
