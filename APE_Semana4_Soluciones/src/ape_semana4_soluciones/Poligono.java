/*
El programa debe calcular el área del polígono. La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos 
iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo que uno 
de los lados del cuadrado, mientras que la altura mide lo mismo que la altura de los triángulos. Se pide que haga un programa 
que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; el área de un triángulo 
rectángulo se calcula multiplicando su base por su altura, y luego dividiendo el resultado entre dos; finalmente, el área de un 
cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class Poligono {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double baseTri, ladoCua, area;
        System.out.println("Cual es la base del triangulo: ");
        baseTri = teclado.nextDouble();
        System.out.println("Cual es el lado del cuadrado: ");
        ladoCua = teclado.nextDouble();
        area = ladoCua * ladoCua + (baseTri * ladoCua / 2) * 5;
        System.out.println("El area total del poligono es igual a: " + area);

    }
}
