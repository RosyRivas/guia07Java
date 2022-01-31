/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajava.pkg05;

import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;

    }

    public Cuenta() {
        saldoActual = 5000;

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese numero de cuenta");
        this.setNumeroCuenta(scan.nextInt());
        System.out.println("ingrese su DNI");
        this.setDni(scan.nextLong());

    }

    public void ingresarDinero() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese dinero a la cuenta:");
        saldoActual += scan.nextDouble();

    }

    public void retirarDinero() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese dinero a retirar:");
        double retiro = scan.nextDouble();
        if (retiro > saldoActual) {
            saldoActual = 0;

        } else {
            saldoActual -= retiro;

        }

    }

    public void extraccionRapida() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese dinero a retirar ");
        double extraer = scan.nextDouble();
        while (extraer > saldoActual * 0.2) {
            System.out.printf("ERROR saque menos del 20 %% que es %.2f \n", saldoActual * 0.2);
            extraer = scan.nextDouble();
        }
        saldoActual -= extraer;
    }

    public void consultarSaldo() {
        System.out.printf("El saldo actual es %.2f \n", saldoActual);

    }

    public void consultarDatos() {
        System.out.printf("El numero de cuenta es %d \n", numeroCuenta);
        System.out.printf("El DNI es %d \n", dni);

    }
}
