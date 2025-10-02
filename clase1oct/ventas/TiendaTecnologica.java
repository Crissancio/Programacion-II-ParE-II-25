package ventas;

public class TiendaTecnologica extends Negocio implements ITiendaTecnologica{
    private int cantidadProductos;
    private String productos[][];
    private int disponibilidad[];

    public TiendaTecnologica(String nom, float gan, String ubi, String prop, int cant, String prod[][], int dispo[]){
        super(nom,gan,ubi, prop);
        this.cantidadProductos = cant;
        this.productos = prod;
        this.disponibilidad = dispo;
    }

    public TiendaTecnologica(String nom, float gan, String ubi, String prop){
        super(nom, gan, ubi, prop);
        this.cantidadProductos = 0;
        this.productos = new String[10][2];
        this.disponibilidad = new int[10];
    }

    public void suma(TiendaTecnologica otro){
        int indice = -1;
        int maxDispo = 0;

        for(int i = 0; i < this.cantidadProductos; i++){
            if(this.disponibilidad[i]> maxDispo){
                maxDispo = this.disponibilidad[i];
                indice = i;
            }
        }

        System.out.println("\tPRODUCTO CON MAYOR DISPONIBILIDAD\n"+"NOMBRE: "+this.productos[indice][0]+"\nMARCA: "+this.productos[indice][1]);
    }

    public void metodoSobre(){
        System.out.println("\t\t------"+this.nombre+"------");
        System.out.println("Propietario: "+this.propietario);
        System.out.println("Ubicacion: "+this.ubicacion);
        System.out.println("Ganancias: "+this.ganacias);

        System.out.println("\t-----Productos Disponibles: "+this.cantidadProductos);

        for(int i = 0; i < this.cantidadProductos; i++){
            System.out.println(this.productos[i][0] +" "+ this.productos[i][1] + " "+ this.disponibilidad[i] +"u.");
        }
    }

    public void metodoSobre(String nombreX){
        boolean seEncontro = false;

        for (int i = 0; i < this.cantidadProductos ; i++) {
            if(this.productos[i][0].equals(nombreX)){
                System.out.println(this.productos[i][0] +" "+ this.productos[i][1] + " "+ this.disponibilidad[i] +"u.");
                seEncontro = true;
                break;
            }
        }

        if(! seEncontro){
            System.out.println("NO SE ENCONTRO EL PRODUCTO "+ nombreX);
        }
    }

    public int verCantidadDeProductosDisponibles(){
        int suma = 0;
        for(int i = 0; i < this.cantidadProductos; i++){
            suma += this.disponibilidad[i];
        }
        return  suma;
    }
}
