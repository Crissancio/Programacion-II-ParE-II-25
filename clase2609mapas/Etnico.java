package clase2609mapas;

public class Etnico extends Mapa {
    public int nroEtnias;
    public String etnias[] = new String[20];

    public Etnico(String ubicacion, float tamaño, int nroEtnias, String[] etnias) {
        super(ubicacion, tamaño);
        this.nroEtnias = nroEtnias;
        this.etnias = etnias;
    }

    @Override
    public String toString() {
        String etniasStr = "";
        for (int i = 0; i < nroEtnias; i++) {
            etniasStr += etnias[i]+"\n";    
        }
        return "Etnico{" + "nroEtnias=" + nroEtnias + ", etnias=" + etniasStr + ", ubicacion=" + ubicacion + ", tamaño=" + tamaño + '}';
    }

    @Override
    public void mostrar(){
        System.out.println("Ubicacion: "+this.ubicacion);
        System.out.println("Tamaño: "+this.tamaño);
        System.out.println("Nro Etnias: "+this.nroEtnias);
        System.out.println("Etnias: ");
        for(String etnia: this.etnias){
            if(etnia != null)
                System.out.println("- "+etnia);
        }
    }

}

