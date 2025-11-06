package spotify;

import java.util.ArrayList;

public class Spotify {
    private ArrayList<Artista> artistas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Album> albums;
    private ArrayList<Cancion> canciones;

    public Spotify() {
        this.artistas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.canciones = new ArrayList<>();
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void agregarArtista(Artista a) {
        artistas.add(a);
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void agregarAlbum(Album a) {
        albums.add(a);
    }

    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }

    public void mostrar() {
        System.out.println("=== SPOTIFY ===");
        System.out.println("\nARTISTAS:");
        for (Artista a : artistas)
            a.mostrar();

        System.out.println("\nALBUMS:");
        for (Album a : albums)
            a.mostrar();

        System.out.println("\nCANCIONES:");
        for (Cancion c : canciones)
            c.mostrar();

        System.out.println("\nUSUARIOS:");
        for (Usuario u : usuarios)
            u.mostrar();
    }
}
