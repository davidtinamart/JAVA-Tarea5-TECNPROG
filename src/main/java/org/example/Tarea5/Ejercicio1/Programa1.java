package org.example.Tarea5.Ejercicio1;

public class Programa1 {

        public static void main (String[]args){
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
