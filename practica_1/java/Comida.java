package practica_1.java;

public class Comida{
    public String nombre;
    public float precio;
    public String[] ingredientes;
    public String descripcion;


    public Comida(String nombre, float precio, String ingredientes[], String descripcion){
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.descripcion = descripcion;
    }

    public void vender(){
        System.out.println("Se ha vendido "+this.nombre);
    }

    public boolean cambiarPrecio(float precio){
        if(precio > 0){
            this.precio = precio;
            return true;
        }else{
            System.out.println("El precio enviado es igual o menor a 0");
            return false;
        }
    }

    public void cambiarIngredientes(String[] ingre){
        this.ingredientes = ingre;
        System.out.println("Se han cambiado los ingredientes");
    }

    public void agregarIngrediente(String ingrediente){
        int n = this.ingredientes.length;
        boolean seAgrego = false;
        for(int i = 0; i < n; i++){
            if(this.ingredientes[i] == null){
                this.ingredientes[i] = ingrediente;
                seAgrego = true;
                break;
            }
        }
        if(seAgrego){
            System.out.println("se agrego "+ingrediente);
        }else{
            System.out.println("no hay espacio en ingredientes");
        }
    }

    public String toString(){
        return "Nombre: "+this.nombre+ "\nPrecio "+this.precio+"\nDescricion "+this.descripcion;
    }


}
