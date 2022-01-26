/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class JavaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Libro libro = new Libro();

        System.out.println("ingrese nro del libro");
        String isbm = scan.next();

        System.out.println("ingrese el titulo");
        String titulo = scan.next();

        System.out.println("ingrese nombre de autor");
        String autor = scan.next();

        System.out.println("ingrese nro del nroPaginas");
        String nroPaginas = scan.next();

        libro.setIsbn(isbm);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setNroPaginas(nroPaginas);
        
        libro.mostrarLibro();
     
    }

}
