package clase2609mapas;

public class Geografico extends Mapa {
    public int maximoRelieve;

    public Geografico(String ubicacion, float tamaño, int maximoRelieve) {
        super(ubicacion, tamaño);
        this.maximoRelieve = maximoRelieve;
    }

    @Override
    public String toString() {
        return "Geografico{" + "maximoRelieve=" + maximoRelieve + ", ubicacion=" + ubicacion + ", tamaño=" + tamaño + '}';
    }
    
}
