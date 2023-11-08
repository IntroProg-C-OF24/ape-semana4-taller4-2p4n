/*
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class PlanillaTelefono {

    public static void main(String[] args) {
        double costoMin, consumoMin, valorTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo de los minutos: ");
        costoMin = teclado.nextDouble();
        System.out.println("Ingrese el numero de los minutos consumidos: ");
        consumoMin = teclado.nextDouble();
        valorTotal = costoMin * consumoMin;
        System.out.println("El valor total es de: " + valorTotal);
    }
}
