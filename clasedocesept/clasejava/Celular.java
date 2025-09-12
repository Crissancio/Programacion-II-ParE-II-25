package clasedocesept.clasejava;

public class Celular extends Dispositivo {
    private int fuerzaLinterna;
    private int cantidadRanurasChip;

    public Celular(float cantidadRam, String tipoProcesador, float almacenamiento, int fuerzaLinterna, int cantidadRanurasChip) {
        super(cantidadRam, tipoProcesador, almacenamiento);
        this.fuerzaLinterna = fuerzaLinterna;
        this.cantidadRanurasChip = cantidadRanurasChip;
    }

    public void mostrar(){
        System.out.println("\nCelular:");
        System.out.println("Cantidad de Ram: "+ this.getCantidadRam());
        System.out.println("Tipo de Procesador: "+this.getTipoProcesador());
        System.out.println("Cantidad de Almacenamiento: "+ this.getAlmacenamiento());
        System.out.println("Fuerza de la linterna: "+this.fuerzaLinterna);
        System.out.println("Cantidad de Ranuras para Chip: "+this.cantidadRanurasChip);
    }
}
