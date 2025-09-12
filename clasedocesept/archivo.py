class Dispositivo:
    def __init__(self, cantRam, tipo, almace):
        self.__cantidadRam = cantRam
        self.__tipoProcesador = tipo
        self.__almacenamiento = almace
    
    def getCantidadRam(self):
        return self.__cantidadRam

    def getTipoProcesador(self):
        return self.__tipoProcesador

    def getAlmacenamiento(self):
        return self.__almacenamiento

class Celular (Dispositivo):
    def __init__(self, cantRam, tipo, alm, fuerza, cantChips):
        super().__init__(cantRam, tipo, alm)
        self.__fuerzaLinterna = fuerza
        self.__cantidadRanurasChip = cantChips

    def mostrar(self):
        print("Celular")
        print(f"Cantidade de RAM: {self.getCantidadRam()}")
        print(f"Tipo de Procesador: {self.getTipoProcesador()}")
        print(f"Almacenamiento: {self.getAlmacenamiento()}")
        print(f"Fuerza de la linterna: {self.__fuerzaLinterna}")
        print(f"Cantidad de Ranuras para Chip: {self.__cantidadRanurasChip}")


class Laptop (Dispositivo):
    def __init__(self, cantRam, tipo, alm, teclado, lector, grafica):
        super().__init__(cantRam, tipo, alm)
        self.__teclado = teclado
        self.__lectorDisco = lector
        self.__tarjetaGrafica = grafica
    
    def mostrar(self):
        print("Laptop")
        print(f"Cantidade de RAM: {self.getCantidadRam()}")
        print(f"Tipo de Procesador: {self.getTipoProcesador()}")
        print(f"Almacenamiento: {self.getAlmacenamiento()}")
        print(f"teclado: {self.__teclado}")
        print(f"Lector de Disco: {self.__lectorDisco}")
        print(f"Tarjeta Grafica: {self.__tarjetaGrafica}")
    
cel = Celular(16, "Snapdragon", 1280, "Media", 4)
cel.mostrar()
print()
laptop = Laptop(32, "Ryzen", 2560, "Mecanico", "Disponible", "GTX 1650")
laptop.mostrar()