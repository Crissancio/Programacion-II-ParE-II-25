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

        // Asignar playlists a usuarios
        u1.crearPLaylist("Favoritas");
        u1.crearPLaylist("N-Word");
        u2.crearPLaylist("Para entrenar");

        // === AGREGAR TODO A SPOTIFY ===
        app.agregarArtista(a1);
        app.agregarArtista(a2);

        app.agregarAlbum(al1);
        app.agregarAlbum(al2);
        app.agregarAlbum(al3);
        app.agregarAlbum(new Album(4, "YHLQMDLG", 1, 2020, 999900000));

        app.agregarCancion(c1);
        app.agregarCancion(c2);
        app.agregarCancion(c3);
        app.agregarCancion(new Cancion(4, "La Zona", 4, 1));
        app.agregarCancion(new Cancion(5, "Si Veo a Tu Mama", 4, 1));

        app.agregarUsuario(u1);
        app.agregarUsuario(u2);

        app.agregarCancionUserXPlayListY("Cristhian", "Favoritas", 1);
        app.agregarCancionUserXPlayListY("Cristhian", "Favoritas", 3);
        app.agregarCancionUserXPlayListY("Ademar", "Para entrenar", 1);
        app.agregarCancionUserXPlayListY("Ademar", "Para entrenar", 2);
        app.agregarCancionUserXPlayListY("Ademar", "Para entrenar", 3);
        app.agregarCancionUserXPlayListY("Ademar", "Para entrenar", 5);
        app.agregarCancionUserXPlayListY("Ademar", "Para entrenar", 4);

        // === MOSTRAR TODO ===
        app.mostrar();

        System.out.println("\t\tb======================");
        app.mostrarAlbumesArtistaX("Bad Bunny");

        System.out.println("\t\tC)======================");
        app.mostrarCancionesAlbumX("YHLQMDLG");

        System.out.println("\t\tD)======================");
        app.mostrarCancionesInfoCompleta();
        System.out.println("\t\tE)======================");
        app.mostrarNombresPlayListUserX("Cristhian");

        System.out.println("\t\tF)======================");
        app.mostrarUsuariosEscucharonCancionX("N95");
        System.out.println("\t\tG)======================");
        app.mostrarArtistaConMasOyentes();

        System.out.println("\t\tH)======================");
        app.mostrarPLaylistUserX("Ademar");
    }
}
