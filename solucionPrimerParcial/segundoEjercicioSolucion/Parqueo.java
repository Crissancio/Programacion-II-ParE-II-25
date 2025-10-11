package solucionPrimerParcial.segundoEjercicioSolucion;

public class Parqueo {
    private int nv;
    private float tariho;
    private String vehiculo[][];
    private int tiempo[][];

    public Parqueo(int nv, float tariho, String vehiculo[][], int tiempo[][]){
        this.nv = nv;
        this.tariho =tariho;
        this.vehiculo = vehiculo;
        this.tiempo = tiempo;
    }

    public Parqueo(int nv, float tariho){
        this.nv = nv;
        this.tariho =tariho;
        this.vehiculo = new String[50][20];
        this.tiempo = new int[50][2];
    }

    public Parqueo(String vehiculo[][], int tiempo[][]){
        this.nv = 0;
        this.tariho =0;
        this.vehiculo = vehiculo;
        this.tiempo = tiempo;
    }

    public String[][] getVehiculo() {
        return vehiculo;
    }

    public int[][] getTiempo() {
        return tiempo;
    }

    public void suma(Parqueo otro){
        String[][] vehi = otro.getVehiculo();
        int[][] tiem = otro.getTiempo();

        this.vehiculo[this.nv][0] = vehi[0][0];
        this.vehiculo[this.nv][1] = vehi[0][1];
        this.tiempo[this.nv][0] = tiem[0][0];
        this.tiempo[this.nv][1] = tiem[0][1];
        this.nv++; 
    }

    public void hallar(String placaZ){
        for(int i=0; i<this.nv; i++){
            if(this.vehiculo[i][0].equals(placaZ)){
                System.out.println("EL CONDUCTOR DE LA PLACA "+placaZ+" ES: "+this.vehiculo[i][1]);
            }
        }
    }

    public void hallar(int horas){
        int cont = 0;
        for(int i=0; i<this.nv; i++){
            if((this.tiempo[i][1] - this.tiempo[i][0]) == horas){
                cont ++;
            }
        }

        System.out.println("EL NUMERO DE VEHICULOS QUE ESTUVIERON "+horas+" HORAS EN EL PARQUEO ES: "+cont);
    }

    public void mostrar(){
        System.out.println("\n\t\t----- Parqueo -----");
        System.out.println("Numero de vehiculos: " + this.nv);
        System.out.println("Tarifa por hora: " + this.tariho);
        System.out.println("Vehiculos en el parqueo:");
        for(int i=0; i<this.nv; i++){
            System.out.println("\tPlaca: " + this.vehiculo[i][0] + ",Nombre: " + this.vehiculo[i][1] +
                    "\n\tEntrada: " + this.tiempo[i][0] + ",salida: " + this.tiempo[i][1] + "\n");
        }
    }
}
