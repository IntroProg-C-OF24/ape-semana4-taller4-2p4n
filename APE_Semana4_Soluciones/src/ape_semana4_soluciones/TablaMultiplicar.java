/*
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número ingresado por el usuario; solo en el caso que el valor del número esté entre 2 y 6.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        double numero;
        double total;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero entre 2 y 6");
        numero = teclado.nextDouble();

        if (numero >= 2 && numero <= 6) {
            total = numero * 1;
            System.out.println(numero + "x 1 = " + total);
            total = numero * 2;
            System.out.println(numero + "x 2 = " + total);
            total = numero * 3;
            System.out.println(numero + "x 3 = " + total);
            total = numero * 4;
            System.out.println(numero + "x 4 = " + total);
            total = numero * 5;
            System.out.println(numero + "x 5 = " + total);
            total = numero * 6;
            System.out.println(numero + "x 6 = " + total);
            total = numero * 7;
            System.out.println(numero + "x 7 = " + total);
            total = numero * 8;
            System.out.println(numero + "x 8 = " + total);
            total = numero * 9;
            System.out.println(numero + "x 9 = " + total);
            total = numero * 10;
            System.out.println(numero + "x 10 = " + total);
            total = numero * 11;
            System.out.println(numero + "x 11 = " + total);
            total = numero * 12;
            System.out.println(numero + "x 12 = " + total);
        } else {
            System.out.println("Ingrese un numero entero entre 2 y 6");
        }
    }
}
