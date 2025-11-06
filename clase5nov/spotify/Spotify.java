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

    public Spotify(ArrayList<Artista> artista, ArrayList<Usuario> usuarios, ArrayList<Album> albums,
            ArrayList<Cancion> canciones) {

        this.artistas = artista;
        this.albums = albums;
        this.usuarios = usuarios;
        this.canciones = canciones;
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

    // a) implementar un metodo para agregar canciones a la playlist de nombre X de
    // un usuario X
    public void agregarCancionUserXPlayListY(String user, String play, int idCan) {
        for (Usuario u : this.usuarios) {
            if (u.getNomUser().equals(user)) {
                for (Playlist p : u.getPlaylists()) {
                    if (p.getNomPlay().equals(play)) {
                        p.agregarCancion(idCan);
                        System.out.println("La cancion fue agregadad de forma exitosa!!");
                        return;
                    }
                }
            }
        }
        System.out.println("No se encontraron coincidencias");
    }

    // b) del artista con nombreX, mostrar el nombre de todos sus albumes
    public void mostrarAlbumesArtistaX(String nom) {
        int id = -1;

        for (Artista a : this.artistas) {
            if (a.getNomArt().equals(nom)) {
                id = a.getIdArt();
            }
        }

        if (id != -1) {
            System.out.println("Albums del Artista: " + nom);
            for (Album a : this.albums) {
                if (a.getIdArt() == id) {
                    System.out.println("\t" + a.getNomAlb());
                }
            }
        } else {
            System.out.println("NO se encontro al artista " + nom);
        }

    }
    // c) muestra todas las canciones del album X

    public void mostrarCancionesAlbumX(String nom) {
        int id = -1;
        for (Album a : this.albums) {
            if (a.getNomAlb().equals(nom)) {
                id = a.getIdAlb();
            }
        }

        if (id != -1) {
            System.out.println("\nCANCIONES DEL ALBUM: " + nom);
            for (Cancion c : this.canciones) {
                if (c.getIdAlb() == id) {
                    System.out.println("\t" + c.getNomCan());
                }
            }
        }
    }

    // d) muestra todas las canciones con informacion completa (nombre, album,
    // artista)

    public Artista conseguirArtistaPorId(int id) {
        for (Artista artista : this.artistas) {
            if (artista.getIdArt() == id) {
                return artista;
            }
        }
        return null;
    }

    public Album conseguirAlbumPorId(int id) {
        for (Album album : this.albums) {
            if (album.getIdAlb() == id) {
                return album;
            }
        }
        return null;
    }

    public void mostrarCancionesInfoCompleta() {
        for (Cancion cancion : this.canciones) {
            Album alb = this.conseguirAlbumPorId(cancion.getIdAlb());
            Artista art = this.conseguirArtistaPorId(cancion.getIdArt());

            if (alb != null && art != null) {
                System.out.println(cancion.getNomCan() + " - " + art.getNomArt() + " - " + alb.getNomAlb());
            }
        }
    }

    // e) muestra el nombre de las playlist el usuario X
    public void mostrarNombresPlayListUserX(String nom) {
        for (Usuario user : this.usuarios) {
            if (user.getNomUser().equals(nom)) {
                user.mostrarNombresPlayList();
            }
        }
    }

    // f) muestra que usuarios escucharon la cancion con nombre X
    public void mostrarUsuariosEscucharonCancionX(String nomCan) {
        int id = -1;
        for (Cancion cancion : this.canciones) {
            if (cancion.getNomCan().equals(nomCan)) {
                id = cancion.getIdCan();
            }
        }

        if (id != -1) {
            System.out.println("USUARIOS QUE ESCUCHARON LA CANCION " + nomCan);
            for (Usuario user : this.usuarios) {
                boolean escucho = false;
                for (Playlist play : user.getPlaylists()) {
                    for (int idNum : play.getCanciones()) {
                        if (idNum == id) {
                            escucho = true;
                            break;
                        }
                    }
                }
                if (escucho) {
                    System.out.println("\t" + user.getNomUser());
                }
            }
        }
    }

    // g) muestra al artista con mas oyentes

    public int oyentesTotales(int idArt) {
        int total = 0;
        for (Album album : this.albums) {
            if (album.getIdArt() == idArt) {
                total = total + album.getCantOyen();
            }
        }
        return total;
    }

    public void mostrarArtistaConMasOyentes() {
        Artista artMasOye = this.artistas.getFirst();
        int mayor = oyentesTotales(artMasOye.getIdArt());
        for (Artista artista : this.artistas) {
            int oyentes = oyentesTotales(artista.getIdArt());
            if (oyentes > mayor) {
                artMasOye = artista;
                mayor = oyentes;
            }
        }
        System.out.println(artMasOye.getNomArt() + " tiene mas oyentes con " + mayor + " oyentes");
    }

    // h) del usuario de nombre X muestra, todas sus playlist y sus canciones
    // (nombre, album, artista)

    public Cancion conseguirCancionPorId(int idCan) {
        for (Cancion cancion : this.canciones) {
            if (cancion.getIdCan() == idCan) {
                return cancion;
            }
        }
        return null;
    }

    public void mostrarPLaylistUserX(String nomUser) {
        for (Usuario user : this.usuarios) {
            if (user.getNomUser().equals(nomUser)) {
                System.out.println("PLaylist del usuario: " + nomUser);
                for (Playlist play : user.getPlaylists()) {
                    System.out.println("\tPlaylist: " + play.getNomPlay());
                    for (int idCan : play.getCanciones()) {
                        Cancion cancion = this.conseguirCancionPorId(idCan);
                        if (cancion != null) {
                            Album alb = this.conseguirAlbumPorId(cancion.getIdAlb());
                            Artista art = this.conseguirArtistaPorId(cancion.getIdArt());
                            if (alb != null && art != null) {
                                System.out.println("\t\t" +

                                        cancion.getNomCan() + " - " + art.getNomArt() + " - " + alb.getNomAlb());
                            }
                        }
                    }
                }
            }
        }
    }
}
