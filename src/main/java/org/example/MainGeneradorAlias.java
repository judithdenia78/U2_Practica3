package org.example;
import java.util.Scanner;

/**
 * Clase que pide los datos al usuario y los imprime por pantalla con un alias y cidigo generado
 * @author Judith Bartolome
 * @author 1.0
 */
public class MainGeneradorAlias {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Solicita al usuario el nombre, apellido y ciclo que cursa, luego genera un alias y un código
     * @param args Argumentos de la línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args) {

        GeneradorAlias alumno = new GeneradorAlias();
        Scanner lector = new Scanner(System.in);

        System.out.println("Indícame el nombre: ");
        alumno.nombre = lector.nextLine();

        System.out.println("Indícame el apellido: ");
        alumno.apellido = lector.nextLine();

        System.out.println("Ahora indícame el ciclo que cursas: ");
        alumno.ciclo = lector.nextLine();

        System.out.println("Alias: " + alumno.crearAlias());
        System.out.println("Código: " + alumno.crearCodigo());

        lector.close();
    }
}

