package org.example;

import java.util.Scanner;

public class GeneradorAlias {

    String nombre;
    String apellido;
    String ciclo;

    String crearAlias() {
        return  nombre.substring(0,3) + apellido.substring(0,3) + ciclo.substring(0,3);
    }

    int crearCodigo ()  {
        return nombre.length() + apellido.length() + ciclo.length();
    }

    public static void main(String [] args) {

        GeneradorAlias alumno = new GeneradorAlias();

        Scanner lector = new Scanner(System.in);
        System.out.println("Indicame el nombre: ");
        alumno.nombre = lector.nextLine();
        System.out.println("Indicame el apellido: ");
        alumno.apellido = lector.nextLine();
        System.out.println("Ahora indicame el ciclo que cursas: ");
        alumno.ciclo = lector.nextLine();

        System.out.println("Alias: " + alumno.crearAlias());
        System.out.println("Código: " + alumno.crearCodigo());

        lector.close();

    }

}
