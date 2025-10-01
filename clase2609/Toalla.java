package clase2609;

public class Toalla extends Producto{
    private float largo, ancho;

    public Toalla(String nombre, double precio, float largo, float ancho){
        super(nombre, precio);
        this.largo = largo;
        this.ancho = ancho;

    }

    public String toString(){
        return "Toalla: " + super.toString() + " Largo: " + this.largo + " Ancho: " + this.ancho;
    }
}
