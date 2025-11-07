class Dueño:
    def __init__(self, id,nomDue, zona, calle):
        self.__idDue = id
        self.__nomDue = nomDue
        self.__zona = zona
        self.__calle = calle
    
    def mostrar(self):
        print(f"\t{self.__nomDue} - {self.__calle}/{self.__zona}")
    def get_idDue(self):
        return self.__idDue
    
    def get_nomDue(self):
        return self.__nomDue
    
    def get_zona(self):
        return self.__zona
    
class Mascota:
    def __init__(self, id, nom, tipo, dueño):
        self.__idMas = id
        self.__nomMas = nom
        self.__tipoMas = tipo
        self.__idDue = dueño
    
    def mostrar(self):
        print(f"\t{self.__nomMas} - {self.__tipoMas} - {self.__idDue}")

    def get_nomMas(self):
        return self.__nomMas

    def get_idDue(self):
        return self.__idDue
    
    def get_tipoMas(self):
        return self.__tipoMas
    
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
    
    def agregar_mascota(self, m):
        self.__mascotas.append(m)

    def agregar_cliente(self, c):
        self.__clientes.append(c)
    
    def agregar_trabajador(self, t):
        self.__trabajadores.append(t)
        
    def conseguir_dueño_por_id(self, id):
        d = None
        for dueño in self.__clientes:
            if(dueño.get_idDue() == id):
                d = dueño
        
        return d

    def mostrar_dueño_mascota_x(self, nom):
        for mascota in self.__mascotas:
            if(mascota.get_nomMas() == nom):
                try:
                    d = self.conseguir_dueño_por_id(mascota.get_idDue())
                    print(f"El dueño de {nom}")
                    d.mostrar()
                except AttributeError:
                    print(f"{nom} no tiene dueño")
    
    def  mostrar_dueños_y_mascotas(self):
        for d in self.__clientes:
            print(f"MASCOTAS DE: {d.get_nomDue()}")
            for m in self.__mascotas:
                if(m.get_idDue() == d.get_idDue()):
                    m.mostrar()
    
    def incisoC(self, tipo):
        for mascota in self.__mascotas:
            if mascota.get_tipoMas() == tipo:
                try:
                    d = self.conseguir_dueño_por_id(mascota.get_idDue())
                    print(f"{d.get_nomDue()} es dueño de {mascota.get_nomMas()}")
                except AttributeError:
                    print(f"{mascota.get_nomMas()} no tiene dueño")
    
    
    # // D) Mostrar a todas las mascotas que tiene dueños que viven en la zonaX
    def inscisoD(self, zonaX):
        for m in self.__mascotas:
            try:
                d = self.conseguir_dueño_por_id(m.get_idDue())
                if(d.get_zona() == zonaX):
                    print(f"\t{m.get_nomMas()}")
            
            except AttributeError:
                pass
vet = Veterinaria("Santa Lucia",[],[],[])

vet.agregar_trabajador(Trabajador(1,"Jose", "Noche"))
vet.agregar_trabajador(Trabajador(2, "Maria", "Mañana"))

vet.agregar_cliente(Dueño(1, "Raul", "16 de Julio", "Rene Dorado"))
vet.agregar_cliente(Dueño(2, "Rosario", "Senkata", "Hiroshima"))
vet.agregar_cliente(Dueño(3, "Tadeo", "Sopocachi", "6 de Agosto"))

vet.agregar_mascota(Mascota(11, "Tarzan", "Mono",2))
vet.agregar_mascota(Mascota(22, "Federico", "Loro", 2))
vet.agregar_mascota(Mascota(33, "Max", "Perro", 3))
vet.agregar_mascota(Mascota(66, "Jorge", "Perro", 0))
vet.agregar_mascota(Mascota(44, "Lulu", "Gato", 1))
vet.agregar_mascota(Mascota(55, "Marshall", "Perro", 3))
vet.agregar_mascota(Mascota(66, "Peñanieto", "Perro", 0))


vet.mostrar()

vet.mostrar_dueño_mascota_x("Max")
print("INSICO B)==========")
vet.mostrar_dueños_y_mascotas()

"""
Mostrar a las mascotas de tipoX y el nombre de su dueño
"""
print("INSICO C==========")
vet.incisoC("Perro")

print("INSICO D==========")
vet.inscisoD("16 de Julio")