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

    def crearPlaylist(self, nom):
        idNuevo = len(self.__playlists) + 1
        self.__playlists.append(Playlist(idNuevo, nom))
    
    def agregarCancionPlaylistX(self, play, idCan):
        for p in self.__playlists:
            if(p.get_nomPlay() == play):
                p.agregar_cancion(idCan)
    
    def escucho_cancion_id(self, idCan):
        for play in self.__playlists:
            if idCan in play.get_canciones():
                return True
            """
            for c in play.getC_canciones():
                if(c == idCan):
                return True
            return Dalse
            """
        return False
    
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

    def agregarCancionUserXPlaListY(self, nom, play, idCan):
        for user in self.__usuarios:
            if user.get_nomUser() == nom:
                user.agregarCancionPlaylistX(play, idCan)
    def mostrar_albumes_artista_X(self, nom):
        for a in self.__artistas:
            if a.get_nomArt() == nom:
                print(nom)
                for alb in self.__albums:
                    if(alb.get_idArt() == a.get_idArt()):
                        print(f"\t{alb.get_nomAlb()}")
                        
    # c) muestra todas las canciones del album X

    def mostrar_canciones_album_X(self, nom):
        for a in self.__albums:
            if(a.get_nomAlb() == nom):
                for c in self.__canciones:
                    if(c.get_idAlb() == a.get_idAlb()):
                        print(f"\t{c.get_nomCan()}")
                        

    def conseguir_artista_por_nombre(self, nom):
        for a in self.__canciones:
            if(a.get_nomArt() == nom):
                return a.get_idArt()
        return -1

    def conseguir_artista_por_id(self, id):
        for a in self.__artistas:
            if(a.get_idArt() == id):
                return a
        return None

    def conseguir_abum_por_id(self, id):
        for a in self.__albums:
            if(a.get_idAlb() == id):
                return a
        return None
    # d) muestra todas las canciones con informacion completa (nombre, album, artista)
    
    def mostrar_canciones_info_completa(self):
        for cancion in self.__canciones:
            art = self.conseguir_artista_por_id(cancion.get_idArt())
            alb = self.conseguir_abum_por_id(cancion.get_idAlb())
            if(art != None and alb != None):
                print(f"{cancion.get_nomCan()} - {art.get_nomArt()} - {alb.get_nomAlb()}")
    
    # e) muestra el nombre de las playlist el usuario X
    
    def mostrar_nombres_playlists_user_X(self, nom):
        for user in self.__usuarios:
            if(user.get_nomUser() == nom):
                print(f"Usuario: {nom}")
                for p in user.get_playlists():
                    print(f"\t{p.get_nomPlay()}")
    
    # f) muestra que usuarios escucharon la cancion con nombre X
    def mostrar_usuarios_escucharon_cancion_X(self, nomCan):
        id = -1
        for cancion in self.__canciones:
            if(cancion.get_nomCan() == nomCan):
                id = cancion.get_idCan()
        
        if(id != -1):
            print(f"Escucharon la Cancion {nomCan}")
            for user in self.__usuarios:
                if (user.escucho_cancion_id(id)):
                    print(f"\t{user.get_nomUser()}")
    
    # g) muestra al artista con mas oyentes
    def oyentesTotalesArtista(self, idArt):
        total = 0
        for a in self.__albums:
            if(a.get_idArt() == idArt):
                total += a.get_cantOyen()
        return total

    def mostrar_artista_mas_oyentes(self):
        artMay = self.__artistas[0]
        mayor = self.oyentesTotalesArtista(artMay.get_idArt())
        
        for a in self.__artistas:
            cantOye = self.oyentesTotalesArtista(a.get_idArt())
            if(cantOye > mayor):
                mayor = cantOye
                artMay = a

        print(f"{artMay.get_nomArt()} tiene {mayor} oyentes")
    
    # h) del usuario de nombre X muestra, todas sus playlist y sus 
    # canciones (nombre, album, artista)
    
    def conseguir_cancion_por_id(self, idCan):
        for cancion in self.__canciones:
            if (cancion.get_idCan() == idCan):
                return cancion
        return None
    
    def mostrar_playlist_user_X(self, nomUser):
        for user in self.__usuarios:
            if(user.get_nomUser() == nomUser):
                print(f"Playlists del Usuario: {nomUser}")
                for play in user.get_playlists():
                    print(f"\tPLaylist: {play.get_nomPlay()}")
                    for idCan in play.get_canciones():
                        cancion = self.conseguir_cancion_por_id(idCan)
                        if(cancion != None):
                            art = self.conseguir_artista_por_id(cancion.get_idArt())
                            alb = self.conseguir_abum_por_id(cancion.get_idAlb())
                            print(f"\t\t{cancion.get_nomCan()} - {art.get_nomArt()} - {alb.get_nomAlb()}")
    
    
    
    def mostrar(self):
        print("=== SPOTIFY ===")

        print("\nARTISTAS:")
        for a in self.__artistas:
            a.mostrar()

        print("\nALBUMS:")
        for a in self.__albums:
            a.mostrar()

        print("\nCANCIONES:")
        for a in self.__canciones:
            a.mostrar()
        
        print("\nUSUARIOS:")
        for a in self.__usuarios:
            a.mostrar()
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
u1.crearPlaylist("Dude")
u1.crearPlaylist("Perreo")
u2.crearPlaylist("Para entrenar")
u2.crearPlaylist("Musica de Lo-Fi")

# === AGREGAR A SPOTIFY ===
app.agregar_artista(a1)
app.agregar_artista(a2)

app.agregar_album(al1)
app.agregar_album(al2)
app.agregar_album(al3)
app.agregar_album(Album(4, "YHLQMDLG", 1, 2020, 999900000))

app.agregar_cancion(c1)
app.agregar_cancion(c2)
app.agregar_cancion(c3)
app.agregar_cancion(Cancion(4, "La Zona", 4, 1))
app.agregar_cancion(Cancion(5, "Si Veo a Tu Mama", 4, 1))

app.agregar_usuario(u1)
app.agregar_usuario(u2)


app.agregarCancionUserXPlaListY("Cristhian","Dude", 1)
app.agregarCancionUserXPlaListY("Cristhian","Dude", 3)
app.agregarCancionUserXPlaListY("Ademar","Para entrenar", 2)
app.agregarCancionUserXPlaListY("Ademar","Para entrenar", 1)
app.agregarCancionUserXPlaListY("Cristhian","Perreo", 4)
app.agregarCancionUserXPlaListY("Cristhian","Perreo", 5)
app.agregarCancionUserXPlaListY("Cristhian","Perreo", 1)

# === MOSTRAR TODO ===
app.mostrar()

print("\t\tINSCISO B)")
app.mostrar_albumes_artista_X("Kendrick Lamar")
print("\t\tINSCISO C)")
app.mostrar_canciones_album_X("Mr. Morale & The Big Steppers")
print("\t\tINSCISO D)")
app.mostrar_canciones_info_completa()

print("\t\tINSCISO E)")
app.mostrar_nombres_playlists_user_X("Ademar")

print("\t\tINSCISO F)")
app.mostrar_usuarios_escucharon_cancion_X("N95")

print("\t\tINSCISO G)")
app.mostrar_artista_mas_oyentes()

print("\t\tINSCISO H)")
app.mostrar_playlist_user_X("Cristhian")