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