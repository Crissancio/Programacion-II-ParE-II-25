package spotify;

import java.util.ArrayList;

public class Usuario {
    private int idUser;
    private String nomUser;
    private ArrayList<Playlist> playlists;

    public Usuario(int idUser, String nomUser) {
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.playlists = new ArrayList<>(); // Se crea vacía
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void agregarPlaylist(Playlist p) {
        playlists.add(p);
    }

    public void mostrar() {
        System.out.println("Usuario [" + idUser + "] " + nomUser);
        if (playlists.isEmpty()) {
            System.out.println("  (Sin playlists)");
        } else {
            for (Playlist p : playlists)
                p.mostrar();
        }
    }
}
