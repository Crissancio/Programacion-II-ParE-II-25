class Ascensor:
    def __init__(self, total, actual, capacidad, cantidad):
        self.tota_nivel = total
        self.actual_nivel = actual
        self.capacidad_maxima = capacidad
        self.cantidad_personas = cantidad
    
    def cambiarCantidadPersonas(self, cantidad):
        if(cantidad< 0 and -(cantidad)<self.cantidad_personas):
            self.cantidad_personas += cantidad
        elif (cantidad< 0 and -(cantidad) == self.cambiarCantidadPersonas):
            self.cantidad_personas = 0
        elif (cantidad > 0):
            self.cantidad_personas += cantidad
        else:
            print("ERROR: Ingreso una cantidad incorrecta")
    
    def alarma_sobrecarga(self):
        if(self.cantidad_personas > self.capacidad_maxima):
            print("EL ASCENSOR A EXCEDIDO LA CAPACIDAD MAXIMA DE PERSONAS")
            return True
        else:
            return False
    
    def subir(self, cantidadPisos):
        if(not self.alarma_sobrecarga()):
            pisos_restantes = self.tota_nivel - self.actual_nivel
            if(cantidadPisos > 0 and cantidadPisos <= pisos_restantes):
                self.actual_nivel = self.actual_nivel + cantidadPisos
                self.parar()
            else:
                print("CANTIDAD DE PISOS INCORRECTA")
    4
    def bajar(self, cantidadPisos):
        if(not self.alarma_sobrecarga()):
            if(cantidadPisos > 0 and cantidadPisos < self.actual_nivel):
                self.actual_nivel = self.actual_nivel - cantidadPisos
                self.parar()
            else:
                print("CANTIDAD DE PISOS INCORRECTA")
    
    def parar(self):
        print(f"\tEL ELEVADOR A PARADO EN EL PISO {self.actual_nivel}!!!")
        


edificio = Ascensor(10, 1,8,0)
edificio.cambiarCantidadPersonas(55)
edificio.cambiarCantidadPersonas(-50)

edificio.subir(1)
edificio.bajar(8)

