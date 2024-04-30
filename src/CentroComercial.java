public class CentroComercial {
    private String nombreTienda;
    private String tipoDeComercio;
    private double descuento;

    public CentroComercial(String nombreTienda, String tipoDeComercio, double descuento) {
        this.nombreTienda = nombreTienda;
        this.tipoDeComercio = tipoDeComercio;
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        if (tipoDeComercio.equalsIgnoreCase("Ropa de niño")) {
            return descuento * 0.8;
        } else if (tipoDeComercio.equalsIgnoreCase("Dispositivos Electrónicos")) {
            return descuento * 0.4;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Nombre de la tienda: " + nombreTienda + "\nTipo de comercio: " + tipoDeComercio + "\nDescuento aplicado: " + calcularDescuento();
    }
}
