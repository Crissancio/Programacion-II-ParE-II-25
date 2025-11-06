package spotify;

public class Main {
    public static void main(String[] args) {

        Spotify app = new Spotify();

        // === ARTISTAS ===
        Artista a1 = new Artista(1, "Bad Bunny", 50000000);
        Artista a2 = new Artista(2, "Kendrick Lamar", 35000000);

        // === ÁLBUMES ===
        Album al1 = new Album(1, "Un Verano Sin Ti", 1, 2022, 120000000);
        Album al2 = new Album(2, "DAMN.", 2, 2017, 95000000);
        Album al3 = new Album(3, "Mr. Morale & The Big Steppers", 2, 2022, 87000000);

        // === CANCIONES ===
        Cancion c1 = new Cancion(1, "Me Porto Bonito", 1, 1);
        Cancion c2 = new Cancion(2, "Die For My Bitch", 2, 2);
        Cancion c3 = new Cancion(3, "N95", 3, 2);

        // === USUARIOS ===
        Usuario u1 = new Usuario(1, "Cristhian");
        Usuario u2 = new Usuario(2, "Ademar");

        // === PLAYLISTS ===
        Playlist p1 = new Playlist(1, "Favoritas");
        p1.agregarCancion(1);
        p1.agregarCancion(3);

        Playlist p2 = new Playlist(2, "Para entrenar");
        p2.agregarCancion(2);

        // Asignar playlists a usuarios
        u1.agregarPlaylist(p1);
        u2.agregarPlaylist(p2);

        // === AGREGAR TODO A SPOTIFY ===
        app.agregarArtista(a1);
        app.agregarArtista(a2);

        app.agregarAlbum(al1);
        app.agregarAlbum(al2);
        app.agregarAlbum(al3);

        app.agregarCancion(c1);
        app.agregarCancion(c2);
        app.agregarCancion(c3);

        app.agregarUsuario(u1);
        app.agregarUsuario(u2);

        // === MOSTRAR TODO ===
        app.mostrar();
    }
}
