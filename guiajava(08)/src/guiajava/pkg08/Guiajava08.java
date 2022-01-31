package guiajava.pkg08;

import java.util.Scanner;

public class Guiajava08 {

    public static void main(String[] args) {

        Cadena cadena = new Cadena();
        String frase;
        String letra;
        int longitud;
        System.out.println("ingrese una frase ");
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        frase = scan.next();
        cadena.setFrase(frase);
         System.out.println("ingrese su longitud ");
        longitud = scan.nextInt();
        cadena.setLongitud(longitud);
        
        cadena.mostrarVocales();
        cadena.invertirFrase();
        System.out.println("ingrese un caracter ver cuantas veces aparece ");
        letra = scan.next();

        cadena.vecesRepetido(letra);
        System.out.println("ingrese otra frase para comparar longitud ");
        frase = scan.next();
        cadena.compararLongitud(frase);

        System.out.println("ingrese otra frase para unir frase ");
        frase = scan.next();
        cadena.unirFrase(frase);

        System.out.println("ingrese un caracter para remplazar en la frase ");
        letra = scan.next();
        cadena.reemplazarCaracter(letra);

        System.out.println("ingrese un caracter para ver si contiene la frase ");
        letra = scan.next();
        cadena.contieneCaracter(letra);

    }

}
