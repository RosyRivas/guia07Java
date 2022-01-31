package guiajava.pkg06;

import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;

    // constructores
    public Cafetera() {
        capacidadMaxima=200;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    // gets and sets
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;

    }

    public void servirTaza(int tamañoTaza) {
      
        if (tamañoTaza > capacidadActual) {
            System.out.println("no se a llenado la taza, esta en su capacidad maxima " + capacidadActual);
        } else {
            System.out.println("se ha llenado la taza");
        }
    }

    public void vaciarTaza() {
        capacidadActual = 0;
        System.out.println("se ha vaciado la taza");

    }
// el metodo agrega cafe a la cafetera 
    public void agregarCafe(int cantidadCafe) {
       
        capacidadActual += cantidadCafe;
        System.out.println("La cafetera tine la capacidad actual de :" + capacidadActual);

    }
}
