/*
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class CostoPC {

    public static void main(String[] args) {
        double cpu, teclado1, raton, pantalla, total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto del cpu: ");
        cpu = teclado.nextDouble();
        System.out.println("Ingrese el monto del teclado: ");
        teclado1 = teclado.nextDouble();
        System.out.println("Ingrese el monto de la pantalla: ");
        pantalla = teclado.nextDouble();
        System.out.println("Ingrese el monto del raton: ");
        raton = teclado.nextDouble();
        total = cpu + +teclado1 + pantalla + raton;
        System.out.println("El precio final es de: " + total);
    }
}
