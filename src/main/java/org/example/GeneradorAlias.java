package org.example;

/**
 * Clase que pide los daros de un alumno y te crea un alias y un código
 * @author Judith Bartolome
 * @version 1.0
 */

public class GeneradorAlias {

    String nombre;
    String apellido;
    String ciclo;

    /**
     * Método que genera un alias compuesto por los tres primeros caracteres de cada atributo:
     * @return Un alias en formato String, formado por las primeras tres letras de cada atributo
     */
    public String crearAlias() {
        return nombre.substring(0, 3) + apellido.substring(0, 3) + ciclo.substring(0, 3);
    }
    /**
     * Método que genera un código numérico basado en la longitud de los tres atributos:
     * @return Un número entero que es la suma de las longitudes de los tres atributos
     */
    public int crearCodigo() {
        return nombre.length() + apellido.length() + ciclo.length();
    }
}

