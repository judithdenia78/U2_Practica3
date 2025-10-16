package org.example;
import java.util.Scanner;

/**
 * Clase main que imprime y pide los datos al usuario sobre una factura de un producto
 * @author Judith Bartolome
 * @version 1.0
 */
public class MainFactura {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Solicita al usuario el nombre del producto, el precio base y el porcentaje de IVA, luego genera un ticket de compra utilizando la clase
     * @param args Argumentos
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce el nombre del producto: ");
        String nombre = lector.nextLine();

        System.out.print("Introduce el precio base del producto: ");
        double precio = lector.nextDouble();

        System.out.print("Introduce el porcentaje de IVA: ");
        double iva = lector.nextDouble();

        FormateadorFactura factura = new FormateadorFactura(nombre, precio, iva);

        System.out.println("-TICKET DE COMPRA- ");
        System.out.println(factura.mostrarTicket());

        lector.close();
    }
}

