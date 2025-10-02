from abc import ABC, abstractmethod
from multipledispatch import dispatch

class Negocio(ABC):
    def __init__(self, nom, gan, ubi, prop):
        self.nombre = nom
        self.ganacias = gan
        self.ubicacion = ubi
        self.propietario = prop
        
class ITiendaTecnologica(ABC):
    @abstractmethod
    def verCantidadDeProductosDisponibles():
        pass
    
class ITiendaVegetales(ABC):
    @abstractmethod
    def MostrarCantidadDeKilosEnTotal():
        pass

class TiendaTecnologica(Negocio, ITiendaTecnologica):
    def __init__(self, nom="", gan= 0, ubi= "", prop= "", cant= 0, prod= [], dispo= []):
        super().__init__(nom, gan, ubi, prop)
        self.__cantidadProductos = cant
        self.__productos = prod
        self.__disponibilidad = dispo
    
    def __add__(self, otro):
        indice = -1
        maxDispo = 0
        
        for i in range(0, self.__cantidadProductos, 1):
            if(self.__disponibilidad[i] > maxDispo):
                maxDispo = self.__disponibilidad[i]
                indice = i
        print(f"\tPRODUCTO CON MAYOR DISPONIBILIDAD\nNombre: {self.__productos[indice][0]}\nMarca: {self.__productos[indice][1]}")
    
    def verCantidadDeProductosDisponibles(self):
        suma = 0
        
        for dispo in self.__disponibilidad:
            suma += dispo 
        
        return suma
    
    
    @dispatch()
    def metodoSobre(self):
        print(f"\t\t------{self.nombre}------")
        print(f"Propietario : {self.propietario}")
        print(f"Ubicado en: {self.ubicacion}")
        print(f"Ganancias: {self.ganacias}")
        
        print(f"\tProductos Disponibles: {self.__cantidadProductos}")
        for i in range (0, self.__cantidadProductos, 1):
            print(f"{self.__productos[i][0]} {self.__productos[i][1]} {self.__disponibilidad[i]}")
            
    @dispatch(str, int)
    def metodoSobre(self, nombreX, cantidadY):
        indice = -1
        for i in range(0, self.__cantidadProductos, 1):
            if(self.__productos[i][0] == nombreX):
                indice = i
        
        if(indice != -1):
            if(self.__disponibilidad[indice] >= cantidadY):
                self.__disponibilidad[indice]= self.__disponibilidad[indice] - cantidadY
                print("SE A REALIZADO LA COMPRA DE FORMA EXITOSA")
            else:
                print(f"NO HAY SUFICIENTE STOCK PARA LA VENTA {-(self.__disponibilidad[indice] - cantidadY)}")
        else:
            print(f"NO SE ENCONTRO EL PRODUCTO {nombreX}")
        


class TiendaVegetales(Negocio, ITiendaVegetales):
    def __init__(self, nom="", gan= 0, ubi= "", prop= "", cant= 0, veg=[], precios= [], kilos= []):
        super().__init__(nom, gan, ubi, prop)
        self.__cantidadVegetales = cant
        self.__vegetales = veg
        self.__preciosPorKilo = precios
        self.__kilosDisponibles = kilos
    
    def  getCantidadVegetales(self):
        return self.__cantidadVegetales

    def getKilosDisponibles(self):
        return self.__kilosDisponibles
    
    def MostrarCantidadDeKilosEnTotal(self):
        suma = 0
        for veg in self.__kilosDisponibles:
            suma += veg
        return suma

    def __sub__(self, otro):
        cantidad1 = 0
        cantidad2 = 0
        
        for i in range(0, self.__cantidadVegetales, 1):
            cantidad1 += self.__kilosDisponibles[i]
        
        for i in range(0, otro.getCantidadVegetales(), 1):
            cantidad2 += otro.getKilosDisponibles()[i]
        
        if(cantidad1 == cantidad2):
            print("AMBAS TIENDAS TIENEN LOS MISMOS KILOS DISPONIBLES")
        elif (cantidad1 > cantidad2):
            print(f"{self.nombre} TIENE MAS KILOS DISPONIBLES")
        else:
            print(f"{otro.nombre} TIENE MAS KILOS DISPONIBLES")
    
    @dispatch()
    def metodoSobre(self):
        print(f"\t\t-------{self.nombre}-------")
        print(f"Propietario : {self.propietario}")
        print(f"Ubicado en: {self.ubicacion}")
        print(f"Ganancias: {self.ganacias}")
        
        print(f"\t----Producto disponibles {self.__cantidadVegetales}")
        for i in range (0, self.__cantidadVegetales, 1):
            print(f"{self.__vegetales[i]} {self.__kilosDisponibles[i]}kg. {self.__preciosPorKilo[i]}$")
    
    @dispatch(str)
    def metodoSobre(self, nombreX):
        seEncontro = False
        
        for i in range(0, self.__cantidadVegetales, 1):
            if(self.__vegetales[i] == nombreX):
                print(f"{self.__vegetales[i]} {self.__preciosPorKilo[i]}$ {self.__kilosDisponibles[i]}kg.")
                seEncontro = True
                break
        
        if(not seEncontro):
            print(f"NO SE ENCONTRO EL VEGETAL {nombreX}")
        
t1 = TiendaTecnologica(
    nom="TIENDA TECNO 1",
    gan= 3000,
    ubi= "Calatayud",
    prop= "Raul",
    cant= 3,
    prod= [
        ["RAM", "Corasai"],
        ["CPU", "Raizen"],
        ["SSD", "Kingston"]
    ],
    dispo= [25, 35, 100]
)
t2 = TiendaTecnologica(
    nom = "Tienda Tecno 2",
    gan= 4000,
    ubi= "Eloysalmon",
    prop= "Jose"
)

t5 = TiendaTecnologica(
    nom="TIENDA TECNO 3",
    gan= 3000,
    ubi= "Calatayud",
    prop= "Raul",
    cant= 3,
    prod= [
        ["RAM", "Corasai"],
        ["CPU", "Raizen"],
        ["SSD", "Kingston"]
    ],
    dispo= [20, 15, 10]
)


t3 = TiendaVegetales(
    nom= "Tienda Coco",
    gan= 2500,
    ubi= "Rodriguez",
    prop= "Jaime",
    cant= 3,
    veg= ["Zanahoria", "Tomate", "Lechuga"],
    precios=[5, 6, 2],
    kilos=[24, 25.5, 100]
)

t4 = TiendaVegetales(
    nom= "Tienda Titi",
    gan= 3500,
    ubi= "Garita",
    prop= "Lucia"
)


t6 = TiendaVegetales(
    nom= "Tienda Panchito",
    gan= 2500,
    ubi= "Rodriguez",
    prop= "Jaime",
    cant= 3,
    veg= ["Zanahoria", "Tomate", "Lechuga"],
    precios=[5, 6, 2],
    kilos=[20, 21.5, 20]
)

t1 + t2

t3 - t6

t1.metodoSobre()
t3.metodoSobre()
t3.metodoSobre("Tomate")
t1.metodoSobre("SSD", 500)
t1.metodoSobre()
print(t1.verCantidadDeProductosDisponibles())
print(t3.MostrarCantidadDeKilosEnTotal())
