public class Tienda {
    private String nombre;
    private String tipoComercio;
    private double descuento;

    public Tienda(String nombre, String tipoComercio, double descuento) {
        this.nombre = nombre;
        this.tipoComercio = tipoComercio;
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        if (tipoComercio.equalsIgnoreCase("Ropa de niño")) {
            return descuento * 0.8;
        } else if (tipoComercio.equalsIgnoreCase("Dispositivos Electrónicos")) {
            return descuento * 0.4;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Nombre de la tienda: " + nombre + "\nTipo de comercio: " + tipoComercio + "\nDescuento aplicado: " + calcularDescuento();
    }
}

