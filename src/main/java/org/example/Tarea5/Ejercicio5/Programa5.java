package org.example.Tarea5.Ejercicio5;
import java.util.Scanner;

public class Programa5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una palabra y despues #, todo en minusculas o la primera y la ultima en mayusculas");
        String palabra = teclado.nextLine();

        if(palabra.charAt(palabra.length()-1) != '#'){
            System.out.println("La palabra no termina en #");

        }else {

            palabra = palabra.substring(0, palabra.length() - 1);
            boolean esPalindromo = true;

            for (int i = 0; i < palabra.length()-1 / 2; i++) {
                if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                    esPalindromo = false;
                    break;
                }else if(palabra.length()-1==0){
                    System.out.println("La palabra debe tener mas de 1 caracter");
                    esPalindromo = false;
                    break;
                }
            }
            if (esPalindromo) {
                System.out.println("Si es palíndromo");
            } else {
                System.out.println("No es palíndromo");
            }
        }
    }
}
