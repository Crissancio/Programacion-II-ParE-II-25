package clasedocesept.clasejava;

public class Laptop extends Dispositivo {
    private String teclado;
    private String lectorDisco;
    private String tarjetaGrafica;

    public Laptop(float cantRam, String tipoProcesador, float almacenamiento, String teclado, String lectorDisco, String tarjetaGrafica) {
        super(cantRam, tipoProcesador, cantRam);
        this.teclado = teclado;
        this.lectorDisco = lectorDisco;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void mostrar(){
        System.out.println("LAPTOP");
        System.out.println("Cantidad de Ram: "+ this.getCantidadRam());
        System.out.println("Tipo de Procesador: "+this.getTipoProcesador());
        System.out.println("Cantidad de Almacenamiento: "+ this.getAlmacenamiento());
        System.out.println("Tipo de Teclado "+this.teclado);
        System.out.println("Lector de Disco: "+this.lectorDisco);
        System.out.println("TARJETA GRAFICA "+this.tarjetaGrafica);
    }
}