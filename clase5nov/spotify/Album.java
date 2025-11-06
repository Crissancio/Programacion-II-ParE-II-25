package spotify;

public class Album {
    private int idAlb;
    private String nomAlb;
    private int idArt;
    private int anioSal;
    private int cantOyen;

    public Album(int idAlb, String nomAlb, int idArt, int anioSal, int cantOyen) {
        this.idAlb = idAlb;
        this.nomAlb = nomAlb;
        this.idArt = idArt;
        this.anioSal = anioSal;
        this.cantOyen = cantOyen;
    }

    public int getIdAlb() {
        return idAlb;
    }

    public String getNomAlb() {
        return nomAlb;
    }

    public int getIdArt() {
        return idArt;
    }

    public int getAnioSal() {
        return anioSal;
    }

    public int getCantOyen() {
        return cantOyen;
    }

    public void mostrar() {
        System.out.println("[" + idAlb + "] " + nomAlb + " (Artista: " + idArt +
                ", Año: " + anioSal + ", Oyentes: " + cantOyen + ")");
    }
}
