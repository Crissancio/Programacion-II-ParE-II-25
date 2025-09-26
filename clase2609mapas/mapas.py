class Mapa:
    def __init__(self, ubicacion, tamanio):
        self.ubicacion = ubicacion
        self.tamanio = tamanio
    
    def mostrar(self):
        print(f"Mapa en {self.ubicacion} de tamaño {self.tamanio}")

    def __str__(self):
        return f"Mapa en {self.ubicacion} de tamaño {self.tamanio}"

class Politico(Mapa):
    def __init__(self, ubicacion, tamanio, nroPaisesLimitrofe):
        super().__init__(ubicacion, tamanio)
        self.nroPaisesLimitrofe = nroPaisesLimitrofe
    
    def __str__(self):
        return f"Mapa Político en {self.ubicacion} de tamaño {self.tamanio} con países: {self.nroPaisesLimitrofe}"

class Geografico(Mapa):
    def __init__(self, ubicacion, tamanio, maximoRelieve):
        super().__init__(ubicacion, tamanio)
        self.maximoRelieve = maximoRelieve
    
    def __str__(self):
        return f"Mapa Geográfico en {self.ubicacion} de tamaño {self.tamanio} con montañas: {self.maximoRelieve}"
    
class Etnico(Mapa):
    def __init__(self, ubicacion, tamanio, nroEtnias, etnias):
        super().__init__(ubicacion, tamanio)
        self.nroEtnias = nroEtnias
        self.etnias = etnias
    
    def __str__(self):
        return f"Mapa Étnico en {self.ubicacion} de tamaño {self.tamanio} con grupos étnicos: {self.nroEtnias}, {', '.join(self.etnias)}"
    
p1 = Politico("Argentina", 560000, 5)
g1 = Geografico("Chile", 4600000, 10000)
e1 = Etnico("Perú", 1280000, 3, ["Aymara", "Quechua", "Mestizo"])
e2 = Etnico("Brasil", 8500000, 4, ["Blanco", "Negro", "Pardo", "Indígena"])
e3 = Etnico("Bolivia", 1098581, 2, ["Quechua", "Aymara"])

lista = [p1, g1, e1, e2 ,e3]
etniaX = "Aymara"
for mapa in lista:
    if isinstance(mapa, Etnico):
        for etnia in mapa.etnias:
            if etnia == etniaX:
                print(mapa)
                break