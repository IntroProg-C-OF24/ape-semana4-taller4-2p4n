/*
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class GastoHijos {

    public static void main(String[] args) {
        double gastoHijo1, gastoHijo2, gastoHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar gastos del primer hijo: ");
        gastoHijo1 = teclado.nextDouble();
        System.out.println("Ingresar gastos del segundo hijo: ");
        gastoHijo2 = teclado.nextDouble();
        System.out.println("Ingresar gastos del tercer hijo: ");
        gastoHijo3 = teclado.nextDouble();
        gastosTotales = gastoHijo1 + gastoHijo2 + gastoHijo3;
        System.out.println("Los gastos totales entre los hijos es de: " + gastosTotales);

    }

}
