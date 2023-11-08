/*
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo.
Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class PrestamoPagoMensual {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double montoPrestamo, interesMensual, pagoMensual, montoPrestamo1;
        System.out.println("Ingrese el monto del prestamo: ");
        montoPrestamo = teclado.nextDouble();
        System.out.println("ingrese el interes del prestamo: ");
        interesMensual = teclado.nextDouble();
        interesMensual = interesMensual / 100;
        montoPrestamo1 = montoPrestamo * interesMensual;
        montoPrestamo1 = montoPrestamo1 / 12;
        montoPrestamo = montoPrestamo / 12;
        pagoMensual = montoPrestamo + montoPrestamo1;
        System.out.println("Su pago mensual por el prestamo de un anio es de: " + pagoMensual);
    }
}
