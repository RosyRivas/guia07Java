package guiajava.pkg07;

/*
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
public class Guiajava07 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
       
// Array para recorrer los pesos de cada persona        
        int pesos[] = new int[4];
// Array para recorrer las edades de cada pesona        
        boolean edad[] = new boolean[4];
/// Creacion de primer persona
        persona1.crearPersona();
        System.out.println("su imc es " + persona1.calcularImc());
        pesos[0] = persona1.calcularImc();
        edad[0] = persona1.esMayorDeEdad();
// Creacion de segunda persona
        persona2.crearPersona();
        System.out.println("su imc es " + persona2.calcularImc());
        pesos[1] = persona2.calcularImc();
        edad[1] = persona2.esMayorDeEdad();
// Creacion de tercer persona
        persona3.crearPersona();
        System.out.println("su imc es " + persona3.calcularImc());
        pesos[2] = persona3.calcularImc();
        edad[2] = persona2.esMayorDeEdad();
// Creacion de cuarta persona
        persona4.crearPersona();
        System.out.println("su imc es " + persona4.calcularImc());       
        pesos[3] = persona4.calcularImc();
        edad[3] = persona4.esMayorDeEdad();
// variables para calcular el porcentaje de pesos
        int pesoIdeal = 0;
        int bajoPeso = 0;
        int sobrePeso = 0;
// recorro el array de pesos para acumular cantidades
        for (int i = 0; i < pesos.length; i++) {

            if (pesos[i] == -1) {
                bajoPeso++;
            }
            if (pesos[i] == 0) {
                pesoIdeal++;
            }
            if (pesos[i] == 1) {
                sobrePeso++;
            }

        }
// acumuladores para sabes edades
        int mayor = 0;
        int menor = 0;
// recorremos el array de edades

        for (int j = 0; j < edad.length; j++) {

            if (edad[j] == true) {
                mayor++;
            }
            if (edad[j] == false) {
                menor++;
            }

        }

        System.out.println("bajo Peso  " + bajoPeso);
        System.out.println("peso ideal " + pesoIdeal);
        System.out.println("sobre peso " + sobrePeso);
        
        System.out.println("mayores de edad " + mayor);
        System.out.println("menores de edad " + menor);
        
/// opciones de porcentajes para bajo Peso
        switch (bajoPeso) {
            case 1:
                if (bajoPeso == 0) {
                    System.out.println("el porcentaje de personas con bajo peso es del 0%");
                }
            case 2:
                if (bajoPeso == 1) {
                    System.out.println("el porcentaje de personas con bajo peso es del 25%");
                }

            case 3:
                if (bajoPeso == 2) {
                    System.out.println("el porcentaje de personas con bajo peso es del 50%");
                }

            case 4:
                if (bajoPeso == 3) {
                    System.out.println("el porcentaje de personas con  bajo peso es del 75%");
                }

            case 5:
                if (bajoPeso == 4) {
                    System.out.println("el porcentaje de personas con  bajo peso es del 100%");
                }

        }
/// opciones de porcentajes para peso ideal        
        switch (pesoIdeal) {
            case 1:
                if (pesoIdeal == 0) {
                    System.out.println("el porcentaje de personas con peso ideal es del 0%");
                }
            case 2:
                if (pesoIdeal == 1) {
                    System.out.println("el porcentaje de personas con peso ideal es del 25%");
                }

            case 3:
                if (pesoIdeal == 2) {
                    System.out.println("el porcentaje de personas con  peso ideal es del 50%");
                }

            case 4:
                if (pesoIdeal == 3) {
                    System.out.println("el porcentaje de personas con  peso ideal es del 75%");
                }

            case 5:
                if (pesoIdeal == 4) {
                    System.out.println("el porcentaje de personas con  peso ideal es del 100%");
                }

        }
/// opciones de porcentajes para sobre peso
        switch (sobrePeso) {
            case 1:
                if (sobrePeso == 0) {
                    System.out.println("el porcentaje de personas con  sobre peso es del 0%");
                }
            case 2:
                if (sobrePeso == 1) {
                    System.out.println("el porcentaje de personas con  sobre peso es del 25%");
                }

            case 3:
                if (sobrePeso == 2) {
                    System.out.println("el porcentaje de personas con  sobre peso es del 50%");
                }

            case 4:
                if (sobrePeso == 3) {
                    System.out.println("el porcentaje de personas con  sobre peso es del 75%");
                }

            case 5:
                if (sobrePeso == 4) {
                    System.out.println("el porcentaje de personas con  sobre peso es del 100%");
                }

        }

    /// opciones para menor de edad    
         switch (menor) {
            case 1:
                if (menor == 0) {
                    System.out.println("el porcentaje de personas menores de edad es del 0%");
                }
            case 2:
                if (menor == 1) {
                    System.out.println("el porcentaje de personas menores de edad  es del 25%");
                }

            case 3:
                if (menor == 2) {
                    System.out.println("el porcentaje de personas menores de edad  es del 50%");
                }

            case 4:
                if (menor == 3) {
                    System.out.println("el porcentaje de personas menores de edad  es del 75%");
                }
             case 5:
                if (menor == 4) {
                    System.out.println("el porcentaje de personas menores de edad  es del 100%");
                }   

        }
//opciones para el porcentaje de mayores de edad         
        switch (mayor) {
            case 1:
                if (mayor == 0) {
                    System.out.println("el porcentaje de personas mayores de edad es del 0%");
                }
            case 2:
                if (mayor == 1) {
                    System.out.println("el porcentaje de personas mayores de edad  es del 25%");
                }

            case 3:
                if (mayor == 2) {
                    System.out.println("el porcentaje de personas mayores de edad  es del 50%");
                }

            case 4:
                if (mayor == 3) {
                    System.out.println("el porcentaje de personas mayores de edad  es del 75%");
                }
             case 5:
                if (mayor == 4) {
                    System.out.println("el porcentaje de personas mayores de edad  es del 100%");
                }   

        }  
         
    }

}
