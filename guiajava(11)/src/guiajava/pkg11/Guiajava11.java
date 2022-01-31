/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajava.pkg11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class Guiajava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fechaActual = new Date();
        System.out.println("Ingrese un  año: ");
        int anio = scan.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = scan.nextInt();
        System.out.println("Ingrese un dia: ");
        int dia = scan.nextInt();
        Date fecha = new Date(anio, mes, dia);    //cargo la fecha ingresada por el usuraio

        System.out.printf("La feha ingrseada es: %d/%d/%d \n", fecha.getYear(), fecha.getMonth(), fecha.getDate());
        System.out.printf("LA fecha de hoy es: %d/%d/%d \n", fechaActual.getYear() + 1900, fechaActual.getMonth() + 1, fechaActual.getDate());

        int diferencia = fechaActual.getYear() + 1900 - fecha.getYear();
        if (fechaActual.getMonth() + 1 <= fecha.getMonth()) {
            if (fechaActual.getMonth() + 1 == fecha.getMonth()) {
                if (fecha.getDate() > fechaActual.getDate()) {
                    diferencia--;
                }
            } else {
                diferencia--;
            }
        }
        System.out.printf("La cantidad de años que hay entre las dos fechas es %d \n", diferencia);
    }
}
