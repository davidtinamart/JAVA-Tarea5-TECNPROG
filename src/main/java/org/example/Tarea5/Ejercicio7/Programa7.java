package org.example.Tarea5.Ejercicio7;

public class Programa7 {

    public static void main(String[] args) {

            char[][] tabla2dimensiones = new char[20][30];
            for (int i = 0; i < tabla2dimensiones.length; i++) {
                for (int j = 0; j < tabla2dimensiones[i].length; j++) {
                    tabla2dimensiones[i][j] = (char) (Math.random() * 26 + 'a');
                }
            }


            for (int i = 0; i < tabla2dimensiones.length; i++) {
                for (int j = 0; j < tabla2dimensiones[i].length; j++) {
                    System.out.print(tabla2dimensiones[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }


