package ventas;

public class TiendaVegetales extends Negocio implements ITiendaVegetales{
    private int cantidadVegetales;
    private String vegetales[];
    private int precioPorKilo[];
    private float kilosDisponibles[];

    public TiendaVegetales(String nom, float gan, String ubi, String prop, int cant, String veg[], int precios[], float kilos[]){
        super(nom, gan, ubi, prop);
        this.cantidadVegetales = cant;
        this.vegetales = veg;
        this.precioPorKilo = precios;
        this.kilosDisponibles = kilos;
    }

    public TiendaVegetales(String nom, float gan, String ubi, String prop){
        super(nom, gan, ubi, prop);
        this.cantidadVegetales = 0;
        this.vegetales = new String[10];
        this.precioPorKilo = new int[10];
        this.kilosDisponibles = new float[10];
    }

    public int getCantidadVegetales(){
        return  this.cantidadVegetales;
    }

    public float[] getKilosDisponibles(){
        return  this.kilosDisponibles;
    }

    public void resta(TiendaVegetales otro){
        float cantidad1 = 0;
        float cantidad2 = 0;

        for(int i = 0; i < this.cantidadVegetales; i++){
            cantidad1 += this.kilosDisponibles[i];
        }

        for(int i = 0; i < otro.getCantidadVegetales(); i++){
            cantidad2 += otro.getKilosDisponibles()[i];
        }

        if(cantidad1 == cantidad2){
            System.out.println("AMBAS TIENDAS TIENEN LA MISMA DISPONIBILIDAD DE KILOS");
        }else if(cantidad1 > cantidad2){
            System.out.println("TIENDA CON MAYOR DISPONIBILIDAD: "+ this.nombre);
        }else{
            System.out.println("TIENDA CON MAYOR DISPONIBILIDAD: "+ otro.nombre);
        }
    }

    public void metodoSobre(){
        System.out.println("\t\t------"+this.nombre+"------");
        System.out.println("Propietario: "+this.propietario);
        System.out.println("Ubicacion: "+this.ubicacion);
        System.out.println("Ganancias: "+this.ganacias);

        System.out.println("\t-----Productos Disponibles: "+this.cantidadVegetales);

        for(int i = 0; i < this.cantidadVegetales; i++){
            System.out.println(this.vegetales[i] +" "+ this.precioPorKilo[i] + "$ "+ this.kilosDisponibles[i] +"kg.");
        }
    }

    public void metodoSobre(String nombreX, float cantidadY){
        int indice = -1;
        for(int i = 0; i < this.cantidadVegetales; i++){
            if(this.vegetales[i].equals(nombreX)){
                indice = i;
            }
        }

        if(indice != -1){
            if(this.kilosDisponibles[indice] >= cantidadY){
                this.kilosDisponibles[indice] = this.kilosDisponibles[indice] - cantidadY;
                System.out.println("COMPRA EXITOSA: PRECIO A PAGAR: "+ (this.precioPorKilo[indice]*cantidadY));
            }else{
                System.out.println("NO HAY KILOS DISPONIBLES PARA LA VENTA");
            }
        }else{
            System.out.println("NO SE A ENCONTRADO EL VEGETAL "+nombreX);
        }
    }

    public float MostrarCantidadDeKilosEnTotal(){
        float suma = 0;
        for(int i = 0; i < this.cantidadVegetales; i++){
            suma += this.kilosDisponibles[i];
        }
        return  suma;
    }
}
