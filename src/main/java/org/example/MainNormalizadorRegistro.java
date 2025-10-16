package org.example;
import java.util.Scanner;

/**
 * Clase que te pide los datos de usuario, correo y telefono y te extrae los datos mas una clave numerica basada en los datros introducidos
 * @author Judith Bartolome
 * @version 1.0
 */

public class MainNormalizadorRegistro {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Solicita al usuario que ingrese su nombre de usuario, correo electrónico y número de teléfono, luego crea una isntancia y muestra los datos
     * @param args Argumentos
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el nombre de usuario:");
        String usuario = lector.nextLine();

        System.out.println("Introduce el correo electrónico:");
        String correo = lector.nextLine();

        System.out.println("Introduce el número de teléfono:");
        String telefono = lector.nextLine();

        NormalizadorRegistro registro = new NormalizadorRegistro(usuario, correo, telefono);
        registro.mostrarDatos();

        lector.close();
    }
}
