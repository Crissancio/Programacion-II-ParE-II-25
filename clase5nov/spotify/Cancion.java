package spotify;

public class Cancion {
    private int idCan;
    private String nomCan;
    private int idAlb;
    private int idArt;

    public Cancion(int idCan, String nomCan, int idAlb, int idArt) {
        this.idCan = idCan;
        this.nomCan = nomCan;
        this.idAlb = idAlb;
        this.idArt = idArt;
    }

    public int getIdCan() {
        return idCan;
    }

    public String getNomCan() {
        return nomCan;
    }

    public int getIdAlb() {
        return idAlb;
    }

    public int getIdArt() {
        return idArt;
    }

    public void mostrar() {
        System.out.println("[" + idCan + "] " + nomCan +
                " (Álbum: " + idAlb + ", Artista: " + idArt + ")");
    }
}
