package spotify;

import java.util.ArrayList;

public class Playlist {
    private int idPlay;
    private String nomPlay;
    private ArrayList<Integer> canciones; // IDs de canciones

    public Playlist(int idPlay, String nomPlay) {
        this.idPlay = idPlay;
        this.nomPlay = nomPlay;
        this.canciones = new ArrayList<>();
    }

    public int getIdPlay() {
        return idPlay;
    }

    public String getNomPlay() {
        return nomPlay;
    }

    public ArrayList<Integer> getCanciones() {
        return canciones;
    }

    public void agregarCancion(int idCancion) {
        canciones.add(idCancion);
    }

    public void mostrar() {
        System.out.println("  Playlist [" + idPlay + "] " + nomPlay);
        if (canciones.isEmpty()) {
            System.out.println("    (Sin canciones)");
        } else {
            System.out.println("    Canciones IDs: " + canciones);
        }
    }
}
