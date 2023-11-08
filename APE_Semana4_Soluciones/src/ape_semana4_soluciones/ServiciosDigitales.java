/*
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de 
servicios digitales de una persona. Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class ServiciosDigitales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double netflix, dropbox, spotify, youtube, total, edad;
        System.out.println("Cual es su edad: ");
        edad = teclado.nextDouble();
        System.out.println("Cuanto paga por netflix: ");
        netflix = teclado.nextDouble();
        System.out.println("Cuanto paga por spotify: ");
        spotify = teclado.nextDouble();
        System.out.println("Cuanto paga por dropbox: ");
        dropbox = teclado.nextDouble();
        System.out.println("Cuanto paga por youtube: ");
        youtube = teclado.nextDouble();
        total = netflix + spotify + dropbox + youtube;
        if (edad > 30) {
            total = total - (total * 0.20);
            System.out.println("El valor total a pagar es de: " + total);
        } else {
            System.out.println("El valor total a pagar es de: " + total);
        }
    }

}
