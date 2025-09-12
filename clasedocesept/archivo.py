class Dispositivo:
    def __init__(self, cantRam, tipo, almace):
        self.__cantidadRam = cantRam
        self.__tipoProcesador = tipo
        self.__almacenamiento = almace
    
    def getCantidadRam(self):
        return self.__cantidadRam

class Celular (Dispositivo):
    def __init__(self, cantRam, tipo, alm, fuerza, cantChips):
        super(cantRam, tipo, alm)
        self.__fuerzaLinterna = fuerza
        self.__cantidadRanurasChip = cantChips

    def mostrar(self):
        print("Celular")
        print(f"Cantidade de RAM: {self.getCantidadRam()}")
        print(f"Fuerza de la linterna: {self.__fuerzaLinterna}")
        print(f"Cantidad de Ranuras para Chip: {self.__cantidadRanurasChip}")


class Laptop (Dispositivo):
    def __init__(self, cantRam, tipo, alm, teclado, lector, grafica):
        super(cantRam, tipo, alm)
        self.__teclado = teclado
        self.__lectorDisco = lector
        self.__tarjetaGrafica = grafica