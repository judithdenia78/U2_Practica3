package org.example;

/**
 * Clase que hace una calculadora a traves de dos numeros indicados por el usuario
 * @author Judith Bartolomé
 * @version 1.0
 */

public class CalculadoraTexto {

    private int num1;
    private int num2;
/**
 * Constructor que separa los números de la operación.
 * @param numeros Cadena de texto que contiene dos números separados por un símbolo '+'
 */
public CalculadoraTexto(String numeros) {
        separarNumeros(numeros);
    }
    /**
     * Separa la cadena de texto en dos números usando el símbolo '+' .
     * @param numeros Cadena de texto que contiene los números
     */
    private void separarNumeros(String numeros) {
        int posicionmas = numeros.indexOf("+");
        String numero1 = numeros.substring(0, posicionmas);
        String numero2 = numeros.substring(posicionmas + 1);

        num1 = convertir(numero1);
        num2 = convertir(numero2);
    }

    // Método privado para convertir una cadena de texto en un número entero
    /**
     * Convierte una cadena de texto en un número entero.
     * @param texto Cadena que se convertirá en número
     * @return El resultado del numero en la operaciónn
     */
    private int convertir(String texto) {
        return Integer.parseInt(texto);
    }
    /**
     * Realiza la suma de los dos números almacenados.
     * @return El resultado de la suma
     */
    public int suma() {
        return num1 + num2;
    }
    /**
     * Realiza la resta entre los dos números almacenados.
     * @return El resultado de la resta
     */
    public int resta() {
        return num1 - num2;
    }
    /**
     * Realiza la multiplicación de los dos números almacenados.
     * @return El resultado de la multiplicación
     */
    public int multiplicación() {
        return num1 * num2;
    }
}
