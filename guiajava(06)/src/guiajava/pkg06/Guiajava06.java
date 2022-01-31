package guiajava.pkg06;

import java.util.Scanner;

public class Guiajava06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Cafetera cafetera = new Cafetera();     
        System.out.println("ingrese la cantidad de cafe a la cafetero");
        cafetera.agregarCafe(scan.nextInt());
        cafetera.llenarCafetera();

        System.out.println("ingrese tamaño de taza");
        cafetera.servirTaza(scan.nextInt());
        cafetera.vaciarTaza();

    }

}
