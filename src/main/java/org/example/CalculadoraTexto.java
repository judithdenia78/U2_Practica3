package org.example;

import java.util.Scanner;

public class CalculadoraTexto {

    private int num1;
    private int num2;

    public CalculadoraTexto(String numeros) {
        separarNumeros(numeros);
    }

    private void separarNumeros(String numeros) {
        int posicionmas = numeros.indexOf("+");
        String numero1 = numeros.substring(0, posicionmas);
        String numero2 = numeros.substring(posicionmas + 1);

        num1 = convertir(numero1);
        num2 = convertir(numero2);
    }

    private int convertir(String texto) {
        return Integer.parseInt(texto);
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicación() {
        return num1 * num2;
    }


    public static void main(String [] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce dos números en formato: num1 +num2");
        String nums = lector.nextLine();


        CalculadoraTexto calculadora = new CalculadoraTexto(nums);
        System.out.println("El resultado de las operaciones es:");
        System.out.println("Suma: " + calculadora.suma());
        System.out.println("Resta: " + calculadora.resta());
        System.out.println("Multiplicación: " + calculadora.multiplicación());



    }

}
