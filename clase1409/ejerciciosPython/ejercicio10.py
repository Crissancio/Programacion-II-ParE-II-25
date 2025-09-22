class PS4:
    def __init__(self, id, juegos):
        self.__id = id
        self.__juegos = juegos
    
    def mostrar(self):
        print("PLAY STATION CON ID ", self.__id)        
        for i in range(0, len(self.__juegos), 1):
                print(f"JUEGO: {self.__juegos[i][0]} - {self.__juegos[i][1]} GB")

    def mostrarJuegoPesado(self):
        nombre = ""
        tamanioMax = 0
        '''
        [
            [],
            [],
            [],
            []
        ]
        '''
        for juego in self.__juegos:
            if(juego[1] > tamanioMax):
                tamanioMax = juego[1]
                nombre = juego[0]
        print(f"JUEGO MAS PESADO: {nombre} - {tamanioMax} GB")
        
    def mostrarTamanioJuegoX(self, juegoBuscado):
        encontrado = False
        tamanio = -1
        
        for juego in self.__juegos:
            if(juego[0] == juegoBuscado):
                encontrado = True
                tamanio = juego[1]
    
        if(encontrado):
            return tamanio
        else:
            print(" EL JUEGO NO ESTA EN LA PS4")
            return tamanio

play = PS4(1, [
    ["MARVELS SPIDER-MAN", 70],
    ["MARVELS SPIDER-MAN MILES MORALES", 120],
    ["GHOST OF TSHIMA", 65],
    ["CALL OF DUTY", 110]
])

play.mostrar()

play.mostrarJuegoPesado()

print(play.mostrarTamanioJuegoX("CYBER PUNK"))