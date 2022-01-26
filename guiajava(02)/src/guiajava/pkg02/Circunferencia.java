/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajava.pkg02;

import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese el radio");
        this.setRadio(scan.nextDouble());

    }

    public void area() {
        double area = (3.14 * (Math.pow(this.radio, 2)));
        System.out.println("El area es : " + area);
    }

    public void perimetro() {
        double perimetro = (2 * 3.14 * this.radio);
        System.out.println("El perimetro es : " + perimetro);

    }
}
