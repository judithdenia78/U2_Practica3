package org.example;

/**
 * Clase que te pide los datos de un usuario y tienes que hacer la ficha completa
 * @author Judith Bartolomé
 * @version 1.0
 */
public class FichaPersonal {


    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String ciudad;
    private int anioNacimiento;
    private int edadAproximada;
    /**
     * Constructor que inicializa los datos de la ficha personal a partir de una cadena.
     * La cadena debe contener la información en el siguiente formato:
     * "Nombre Apellido - Fecha de nacimiento (AAAA-MM-DD) - Ciudad".
     * @param datos Cadena que contiene los datos de la persona
     */
    public FichaPersonal(String datos) {
        int primerGuion = datos.indexOf("-");
        int segundoGuion = datos.indexOf("-" , primerGuion + 1);

        String nombreApellido = datos.substring(0, primerGuion);
        fechaNacimiento = datos.substring(primerGuion + 3 , segundoGuion);
        ciudad = datos.substring(segundoGuion + 3);

        int espacio = nombreApellido.indexOf("");
        nombre = nombreApellido.substring(0, espacio);
        apellido = nombreApellido.substring(espacio + 1);

        anioNacimiento = Integer.parseInt(fechaNacimiento.substring(0, 4));

        edadAproximada = 2025 - anioNacimiento;

    }

    /**
     * Muestra la ficha personal completa con todos los datos.
     * Imprime la información de la persona de forma legible.
     */
    public void mostrarFicha() {
        System.out.println("- Ficha Personal -");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Edad aproximada: " + edadAproximada + " años");
    }
}
