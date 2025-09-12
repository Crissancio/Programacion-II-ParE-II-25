package clasedocesept.clasejava;

public class Dispositivo {
    private float cantidadRam;
    private String tipoProcesador;
    private float almacenamiento;

    public Dispositivo(float a, String b, float c){
        this.cantidadRam = a;
        this.tipoProcesador = b;
        this.almacenamiento = c;
    }

    public float getCantidadRam(){
        return this.cantidadRam;
    }

    public String getTipoProcesador(){
        return this.tipoProcesador;
    }

    public float getAlmacenamiento(){
        return this.almacenamiento;
    }
}
