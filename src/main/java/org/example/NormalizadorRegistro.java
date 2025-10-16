package org.example;

/**
 * Clase que pide los datos y te crea una clave numerica a raiz de los datos introducidos
 * @author Judith Bartolome
 * @version 1.0
 */

public class NormalizadorRegistro {
    String usuario;
    String correo;
    String telefono;

    String usuarioFormateado;
    String correoCanonico;
    String prefijoTelefono;
    int claveNumerica;

    /**
     * Constructor que recibe los datos del usuario, los normaliza y calcula una clave numérica.
     * @param usuario Nombre de usuario introducido por el usuario
     * @param correo Correo electrónico introducido por el usuario
     * @param telefono Número de teléfono introducido por el usuario
     */
    public NormalizadorRegistro(String usuario, String correo, String telefono) {
        this.usuario = usuario;
        this.correo = correo;
        this.telefono = telefono;


        usuarioFormateado = usuario.trim().toLowerCase();
        correoCanonico = correo.trim().toLowerCase();


        prefijoTelefono = telefono.substring(0, 3);


        int suma = usuarioFormateado.length() + correoCanonico.length();
        char ultimo = telefono.charAt(telefono.length() - 1);
        String ultimoTexto = String.valueOf(ultimo);
        int digitoFinal = Integer.parseInt(ultimoTexto.replaceAll("[^0-9]", "0"));
        claveNumerica = suma + digitoFinal;
    }

    /**
     * Muestra los datos  y la clave numérica generada.
     */
    public void mostrarDatos() {
        System.out.println("----- Registro Normalizado -----");
        System.out.println("Usuario formateado: " + usuarioFormateado);
        System.out.println("Correo canónico: " + correoCanonico);
        System.out.println("Prefijo del teléfono: " + prefijoTelefono);
        System.out.println("Clave numérica generada: " + claveNumerica);
    }
}

