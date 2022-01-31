/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajava.pkg10;

import java.util.Arrays;

public class Guiajava10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arrayA = new double[50];
        double[] arrayB= new double[20];
        //array1
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (double) Math.round(((Math.random() * 20) + 1) * 100) / 100;  //define la cantidad de decimales haciendo un redondeo, capo parra
        }

        System.out.println("Array 1  con valores aleatorios:");
        System.out.println(Arrays.toString(arrayA));                   // <=convierte Este método imprime el arreglo como una cadena
        System.out.println("Arreglo 1 ordenado :");
        Arrays.sort(arrayA);                                             //ordena el array de menor a mayor              
        System.out.println(Arrays.toString(arrayA));                    // <=convierte Este método imprime el arreglo como una cadena ordenada

        //array2
        arrayB = Arrays.copyOfRange(arrayB, 0, 20);                     //copa los primeros 20 valores del array1 en el array 2
        System.out.println("Array 2 combinado :");
        Arrays.fill(arrayB, 10, 20, 0.5);                               //llena el array1 con 0.5 con el rango definido
        System.out.println(Arrays.toString(arrayB));                    //muestro el array2 combinado
    }
}
