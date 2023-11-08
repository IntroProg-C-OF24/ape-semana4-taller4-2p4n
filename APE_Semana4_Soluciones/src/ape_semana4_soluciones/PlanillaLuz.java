/*
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class PlanillaLuz {

    public static void main(String[] args) {
        double kilovatio, gasto, total, edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es su edad: ");
        edad = teclado.nextDouble();
        System.out.println("Cual es el costo de Kilovatio/hora: ");
        kilovatio = teclado.nextDouble();
        System.out.println("Cual es el consumo mensual de kilovatios: ");
        gasto = teclado.nextDouble();
        total = kilovatio * gasto;
        if (edad >= 65) {
            total = total - (total * 0.10);
            System.out.println("El valor total a pagar es de: " + total);
        } else {
            System.out.println("El valor total a pagar es de: " + total);
        }

    }

}
