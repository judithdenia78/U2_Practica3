package org.example;

/**
 * Clase que te pide los datos de un producto y te dice el ticker completo
 * @author Judith Bartolome
 * @version 1.0
 */

public class FormateadorFactura {

    private String nombreProducto;
    private double precioBase;
    private double porcentajeIVA;
    /**
     * Constructor que inicia los atributos de la clase.
     * Recibe el nombre del producto, el precio base y el porcentaje de IVA.
     * @param nombreProducto El nombre del producto
     * @param precioBase El precio base del producto (sin IVA)
     * @param porcentajeIVA El porcentaje de IVA aplicado al producto
     */
    public FormateadorFactura (String nombreProducto, double precioBase, double porcentajeIVA) {

        this.nombreProducto = nombreProducto;
        this.precioBase = precioBase;
        this.porcentajeIVA = porcentajeIVA;
    }
    /**
     * Método que genera y retorna un ticket de compra formateado con los detalles del producto.
     * @return El ticket formateado como un String
     */

    public String mostrarTicket (){

        double importeIva = precioBase * porcentajeIVA / 100;
        double totalIva= precioBase + importeIva;

        String ticket = "Producto: " + nombreProducto + "\n"
                        + "Precio base: " + String.format("%.2f" , precioBase) + "€\n"
                        + "IVA del producto: " + String.format("%.0f" , porcentajeIVA) + "%\n"
                        + "Total con IVA incluido: " + String.format("%.2f" , totalIva) + "€\n";
        return ticket;

    }
}
