package clasedocesept.clasejava;

public class Laptop extends Dispositivo {
    private String teclado;
    private String lectorDisco;
    private String tarjetaGrafica;

    public Laptop(float cantRam, String tipoProcesador, float almacenamiento, String teclado, String lectorDisco, String tarjetaGrafica) {
        super(cantRam, teclado, cantRam);
        this.teclado = teclado;
        this.lectorDisco = lectorDisco;
        this.tarjetaGrafica = tarjetaGrafica;
    }
}