/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajava.pkg04;

import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo (){
    
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese base del rectangulo");
        this.setBase(scan.nextInt());
        System.out.println("ingrese altura del rectangulo");
        this.setAltura(scan.nextInt());
    }
    public void superficie (){
       double sup= this.base* this.altura;
       System.out.println("la superficie es "+ sup);
    }
    
    public void perimetro(){
        double per= (this.base+this.altura) * 2;
        System.out.println("el perimetro es "+ per);
    }
    
    
}
