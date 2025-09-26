package clase2609;

public class Bebida extends Producto {
    private double contenido;
    private boolean gaseosa;

    public Bebida(String nombre, double precio, double contenido, boolean gaseosa) {
        super(nombre, precio);
        this.contenido = contenido;
        this.gaseosa = gaseosa;
    }
}
