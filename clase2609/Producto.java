package clase2609;

public class Producto{
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }
    public String getNombre(){
        return this.nombre;
    }
}