class Artista:
    def __init__(self, idArt, nomArt, cantSeg):
        self.__idArt = idArt
        self.__nomArt = nomArt
        self.__cantSeg = cantSeg

    # Getters
    def get_idArt(self):
        return self.__idArt

    def get_nomArt(self):
        return self.__nomArt

    def get_cantSeg(self):
        return self.__cantSeg

    def mostrar(self):
        print(f"[{self.__idArt}] {self.__nomArt} - Seguidores: {self.__cantSeg}")


class Album:
    def __init__(self, idAlb, nomAlb, idArt, anioSal, cantOyen):
        self.__idAlb = idAlb
        self.__nomAlb = nomAlb
        self.__idArt = idArt
        self.__anioSal = anioSal
        self.__cantOyen = cantOyen

    def get_idAlb(self):
        return self.__idAlb

    def get_nomAlb(self):
        return self.__nomAlb

    def get_idArt(self):
        return self.__idArt

    def get_anioSal(self):
        return self.__anioSal

    def get_cantOyen(self):
        return self.__cantOyen

    def mostrar(self):
        print(f"[{self.__idAlb}] {self.__nomAlb} "
              f"(Artista: {self.__idArt}, Año: {self.__anioSal}, Oyentes: {self.__cantOyen})")


class Cancion:
    def __init__(self, idCan, nomCan, idAlb, idArt):
        self.__idCan = idCan
        self.__nomCan = nomCan
        self.__idAlb = idAlb
        self.__idArt = idArt

    def get_idCan(self):
        return self.__idCan

    def get_nomCan(self):
        return self.__nomCan

    def get_idAlb(self):
        return self.__idAlb

    def get_idArt(self):
        return self.__idArt

    def mostrar(self):
        print(f"[{self.__idCan}] {self.__nomCan} "
              f"(Álbum: {self.__idAlb}, Artista: {self.__idArt})")


class Playlist:
    def __init__(self, idPlay, nomPlay):
        self.__idPlay = idPlay
        self.__nomPlay = nomPlay
        self.__canciones = []  # Lista de IDs de canciones

    def get_idPlay(self):
        return self.__idPlay

    def get_nomPlay(self):
        return self.__nomPlay

    def get_canciones(self):
        return self.__canciones

    def agregar_cancion(self, idCancion):
        self.__canciones.append(idCancion)

    def mostrar(self):
        print(f"  Playlist [{self.__idPlay}] {self.__nomPlay}")
        if not self.__canciones:
            print("    (Sin canciones)")
        else:
            print(f"    Canciones IDs: {self.__canciones}")


class Usuario:
    def __init__(self, idUser, nomUser):
        self.__idUser = idUser
        self.__nomUser = nomUser
        self.__playlists = []  # Se crea vacía

    def get_idUser(self):
        return self.__idUser

    def get_nomUser(self):
        return self.__nomUser

    def get_playlists(self):
        return self.__playlists

    

    def mostrar(self):
        print(f"Usuario [{self.__idUser}] {self.__nomUser}")
        if not self.__playlists:
            print("  (Sin playlists)")
        else:
            for p in self.__playlists:
                p.mostrar()


class Spotify:
    def __init__(self, arts= [], users = [], albums = [], canciones = []):
        self.__artistas = arts
        self.__usuarios = users
        self.__albums = albums
        self.__canciones = canciones

    def get_artistas(self):
        return self.__artistas

    def get_usuarios(self):
        return self.__usuarios

    def get_albums(self):
        return self.__albums

    def get_canciones(self):
        return self.__canciones

    def agregar_artista(self, artista):
        self.__artistas.append(artista)

    def agregar_usuario(self, usuario):
        self.__usuarios.append(usuario)

    def agregar_album(self, album):
        self.__albums.append(album)

    def agregar_cancion(self, cancion):
        self.__canciones.append(cancion)

    def mostrar(self):
        print("=== SPOTIFY ===")

        print("\nARTISTAS:")
        for a in self.__artistas:
            a.mostrar()

        print("\nALBUMS:")
        for a in self.__albums:
            a.mostrar()

        print("\nCANCIONES:")


app = Spotify()

# === ARTISTAS ===
a1 = Artista(1, "Bad Bunny", 50000000)
a2 = Artista(2, "Kendrick Lamar", 35000000)

# === ÁLBUMES ===
al1 = Album(1, "Un Verano Sin Ti", 1, 2022, 120000000)
al2 = Album(2, "DAMN.", 2, 2017, 95000000)
al3 = Album(3, "Mr. Morale & The Big Steppers", 2, 2022, 87000000)

# === CANCIONES ===
c1 = Cancion(1, "Me Porto Bonito", 1, 1)
c2 = Cancion(2, "Die For My Bitch", 2, 2)
c3 = Cancion(3, "N95", 3, 2)

# === USUARIOS ===
u1 = Usuario(1, "Cristhian")
u2 = Usuario(2, "Ademar")

# === PLAYLISTS ===
p1 = Playlist(1, "Dude")
p1.agregar_cancion(1)
p1.agregar_cancion(3)

p2 = Playlist(2, "Para entrenar")
p2.agregar_cancion(2)

u1.agregar_playlist(p1)
u2.agregar_playlist(p2)

# === AGREGAR A SPOTIFY ===
app.agregar_artista(a1)
app.agregar_artista(a2)

app.agregar_album(al1)
app.agregar_album(al2)
app.agregar_album(al3)

app.agregar_cancion(c1)
app.agregar_cancion(c2)
app.agregar_cancion(c3)

app.agregar_usuario(u1)
app.agregar_usuario(u2)

# === MOSTRAR TODO ===
app.mostrar()
