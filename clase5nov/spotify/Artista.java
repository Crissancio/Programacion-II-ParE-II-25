package spotify;

public class Artista {
    private int idArt;
    private String nomArt;
    private int cantSeg;

    public Artista(int idArt, String nomArt, int cantSeg) {
        this.idArt = idArt;
        this.nomArt = nomArt;
        this.cantSeg = cantSeg;
    }

    public int getIdArt() {
        return idArt;
    }

    public String getNomArt() {
        return nomArt;
    }

    public int getCantSeg() {
        return cantSeg;
    }

    public void mostrar() {
        System.out.println("[" + idArt + "] " + nomArt + " - Seguidores: " + cantSeg);
    }
}
