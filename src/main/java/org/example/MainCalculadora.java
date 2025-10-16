package org.example;
import java.util.Scanner;

/**
 * Clase principal que permite al usuario introducir los numeros para realizar las operaciones necesarias
 * @author Judith Bartolome
 * @version 1.0
 */
public class MainCalculadora {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Solicita al usuario dos números en formato "num1+num2", crea una instancia y muestra el resultado de suma, resta y multiplicación.
     * @param args Argumentos
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce dos números en formato: num1 +num2");
        String nums = lector.nextLine();

        CalculadoraTexto calculadora = new CalculadoraTexto(nums);

        System.out.println("El resultado de las operaciones es:");
        System.out.println("Suma: " + calculadora.suma());
        System.out.println("Resta: " + calculadora.resta());
        System.out.println("Multiplicación: " + calculadora.multiplicación());

        lector.close();
    }
}
