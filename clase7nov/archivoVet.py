class Dueño:
    def __init__(self, id,nomDue, zona, calle):
        self.__idDue = id
        self.__nomDue = nomDue
        self.__zona = zona
        self.__calle = calle
    
    def mostrar(self):
        print(f"\t{self.__nomDue} - {self.__calle}/{self.__zona}")
    
class Mascota:
    def __init__(self, id, nom, tipo, dueño):
        self.__idMas = id
        self.__nomMas = nom
        self.__tipoMas = tipo
        self.__idDue = dueño
    
    def mostrar(self):
        print(f"\t{self.__nomMas} - {self.__tipoMas} - {self.__idDue}")

class Trabajador:
    def __init__(self, id, nom, turno):
        self.__idTra = id
        self.__nomTra = nom
        self.__turno = turno
        
    def mostrar(self):
        print(f"{self.__nomTra} - {self.__turno}")


class Veterinaria:
    def __init__(self, nom, trab, masc, clie):
        self.__nombre = nom
        self.__trabajadores = trab
        self.__mascotas = masc
        self.__clientes = clie

    def mostrar(self):
        print("VETERINIARIA:", self.__nombre)
        print("TRABAJADORES")
        for t in self.__trabajadores:
            t.mostrar()
        
        print("CLIENTES")
        for c in self.__clientes:
            c.mostrar()
        
        print("MASCOTAS")
        for m in self.__mascotas:
            m.mostrar()
