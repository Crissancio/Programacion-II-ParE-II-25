package clase2609mapas;

public class Mapa {
    public String ubicacion;
    public float tamaño;

    public Mapa(String ubicacion, float tamaño) {
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
    }

    public String toSrtring() {
        return "Mapa{" + "ubicacion=" + ubicacion + ", tamaño=" + tamaño + '}';
    }

    public void mostrar(){
        System.out.println("Mapa{" + "ubicacion=" + ubicacion + ", tamaño=" + tamaño + '}');
    }
}
