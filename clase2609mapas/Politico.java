package clase2609mapas;

public class Politico extends Mapa {
    public int nroPaisesLimitrofes;

    public Politico(String ubicacion, float tamaño, int nroPaisesLimitrofes) {
        super(ubicacion, tamaño);
        this.nroPaisesLimitrofes = nroPaisesLimitrofes;
    }

    @Override
    public String toString() {
        return "Politico{" + "nroPaisesLimitrofes=" + nroPaisesLimitrofes + ", ubicacion=" + ubicacion + ", tamaño=" + tamaño + '}';
    }
}
