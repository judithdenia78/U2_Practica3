package org.example;
import java.util.Scanner;

/**
 * Clase main que pide los usuarios , lo recine y crea una ficha completa con todos los datos
 * @author Judith Bartolome
 * @version 1.0
 */
public class MainFichaPersonal {
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Solicita al usuario que introduzca los datos personales en un formato específico y luego crea la ficha completa
     * @param args Argumentos de la línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce los datos en el formato:");
        System.out.println("\"Nombre Apellido - YYYY-MM-DD - Ciudad\"");
        String datosCompletos = lector.nextLine();

        FichaPersonal ficha = new FichaPersonal(datosCompletos);
        ficha.mostrarFicha();

        lector.close();
    }
}
