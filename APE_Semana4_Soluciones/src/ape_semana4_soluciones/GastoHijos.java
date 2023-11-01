/*
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
*/
package ape_semana4_soluciones;
import java.util.Scanner;
public class GastoHijos {
    public static void main(String[] args) {
        double gastoHijo1, gastoHijo2, gastoHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar gastos del primer descendiente: ");
        gastoHijo1 = teclado.nextDouble();
        System.out.println("Ingresar gastos del segundo descendiente: ");
        gastoHijo2 = teclado.nextDouble();
        System.out.println("Ingresar gastos del tercero descendiente: ");
        gastoHijo3 = teclado.nextDouble();
        gastosTotales = gastoHijo1 + gastoHijo2 + gastoHijo3;
        System.out.println("Los gastos totales entre los descendientes es de: " + gastosTotales);
        
        
    }
    
}
