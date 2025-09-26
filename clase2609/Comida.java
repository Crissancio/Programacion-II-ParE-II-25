package clase2609;

public class Comida extends Producto{
    private int calorias;

    public Comida(String nombre, double precio, int calorias){
        super(nombre, precio);
        this.calorias = calorias;
    }
}
