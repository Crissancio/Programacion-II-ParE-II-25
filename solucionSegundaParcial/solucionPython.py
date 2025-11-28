class Persona:
    def __init__(self, nombre, edad, peso):
        self.__nombre = nombre
        self.__edad = edad
        self.__peso = peso
    
    def mostrar(self):
        print(f"\t\t[ {self.__nombre} {self.__edad} {self.__peso}]")
    
    def getEdad(self):
        return self.__edad
    
    def getPeso(self):
        return self.__peso


class Cabina:
    def __init__(self, nro):
        self.__nroCabina = nro
        self.__personasAbordo = []
    
    def agregarPersona(self, p):
        self.__personasAbordo.append(p)
    
    def mostrar(self):
        print(f"\t[Nro de Cabina: {self.__nroCabina}]")
        print("\tPersonas en Cabina:")
        if len(self.__personasAbordo) != 0:
            for p in self.__personasAbordo:
                p.mostrar()
        else:
            print("\t\tSin Personas en Cabina")
    
    def getNroCabina(self):
        return self.__nroCabina
    
    def getPersonasAbordo(self):
        return self.__personasAbordo
    
    def conseguirPesoTotal(self):
        peso = 0
        for p in self.__personasAbordo:
            peso = peso + p.getPeso()
        return peso


class Linea:
    def __init__(self, color):
        self.__color = color
        self.__cantidadCabinas = 0
        self.__cabinas = []
        self.__filaPersonas = []
    
    def agregarPersona(self, p):
        self.__filaPersonas.append(p)
    
    def agregarCabina(self, nroCabina):
        self.__cantidadCabinas += 1
        self.__cabinas.append(Cabina(nroCabina))
    
    def mostrar(self):
        print(f"\n[---Linea:{self.__color}---]")
        print(f"Cantidad de Cabinas: {self.__cantidadCabinas}")
        for c in self.__cabinas:
            c.mostrar()
        print("\tFila de Personas:")
        for p in self.__filaPersonas:
            p.mostrar()
    
    def getCantidadCabinas(self):
        return self.__cantidadCabinas
    
    def getColor(self):
        return self.__color
    
    def getPersonaFila(self):
        return self.__filaPersonas
    
    def getCabinas(self):
        return self.__cabinas


class MiTeleferico:
    def __init__(self):
        self.__lineas = []
        self.__cantidadIngresos = 0
        
        self.__lineas.append(Linea("Rojo"))
        self.__lineas.append(Linea("Amarillo"))
        self.__lineas.append(Linea("Verde"))
    
    def agregarPersonaFila(self, p, linea):
        for l in self.__lineas:
            if l.getColor() == linea:
                l.agregarPersona(p)
                break
    
    def agregarCabina(self, linea):
        for l in self.__lineas:
            if l.getColor() == linea:
                l.agregarCabina(l.getCantidadCabinas() + 1)
                break
    
    def mostrar(self):
        print("\t\t[-->BIENVENIDO A MI TELEFERICO<--]")
        for l in self.__lineas:
            l.mostrar()
    
    # a)
    def incisoA(self, linea, nro):
        hecho = False
        
        for l in self.__lineas:
            if l.getColor() == linea:
                if len(l.getPersonaFila()) != 0:
                    for c in l.getCabinas():
                        if c.getNroCabina() == nro:
                            p = l.getPersonaFila()[0]
                            if c.conseguirPesoTotal() + p.getPeso() <= 850 and len(c.getPersonasAbordo()) < 10:
                                c.agregarPersona(p)
                                l.getPersonaFila().pop(0)
                                hecho = True
                else:
                    print(f"Linea {linea} sin Personas en Fila")
        
        if hecho:
            print("REALIZADO CON EXITO")
        else:
            print("NO SE PUDO AGREGAR A LA PERSONA EN LA CABINA")
    
    def incisoB(self):
        cumplen = True
        
        for l in self.__lineas:
            for c in l.getCabinas():
                if c.conseguirPesoTotal() > 850 or len(c.getPersonasAbordo()) > 10:
                    cumplen = False
                    print(f"La Cabina {c.getNroCabina()} - {l.getColor()} NO CUMPLE CON LAS REGLAS DE ABORDAJE")
        
        if cumplen:
            print("NO SE ENCONTRARON INCUMPLIMIENTOS")
    
    def incisoC(self):
        ingresos = 0
        for l in self.__lineas:
            for c in l.getCabinas():
                for p in c.getPersonasAbordo():
                    if p.getEdad() < 25 or p.getEdad() > 60:
                        ingresos = ingresos + 1.5
                    else:
                        ingresos = ingresos + 3.0
        
        self.__cantidadIngresos = ingresos
        print(f"SE CALCULARON {ingresos} INGRESOS")
    
    def incisoD(self):
        ingresosMax = 0
        linea = ""
        for l in self.__lineas:
            ingresos = 0
            for c in l.getCabinas():
                for p in c.getPersonasAbordo():
                    if p.getEdad() >= 25 and p.getEdad() <= 60:
                        ingresos = ingresos + 3.0
            
            if ingresos > ingresosMax:
                ingresosMax = ingresos
                linea = l.getColor()
        
        print(f"La Linea {linea} tiene mas ingresos en tarifa regular: {ingresosMax}")


def main():
    miTeleferico = MiTeleferico()

    miTeleferico.agregarPersonaFila(Persona("Carlos", 22, 70.2), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("María", 19, 58.7), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Andrés", 25, 82.1), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Lucía", 30, 64.9), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Fernando", 28, 76.3), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Valeria", 21, 55.4), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Gabriel", 26, 68.0), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Daniela", 24, 61.2), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Héctor", 27, 79.6), "Rojo")
    miTeleferico.agregarPersonaFila(Persona("Paola", 23, 59.8), "Rojo")

    miTeleferico.agregarPersonaFila(Persona("Jorge", 35, 81.5), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Sofía", 20, 54.3), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Mauricio", 29, 77.9), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Cecilia", 32, 68.4), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Benjamín", 18, 62.7), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Natalia", 28, 73.1), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Óscar", 31, 84.0), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Claudia", 26, 60.9), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Iván", 24, 69.8), "Amarillo")
    miTeleferico.agregarPersonaFila(Persona("Elena", 22, 56.6), "Amarillo")

    miTeleferico.agregarPersonaFila(Persona("Ricardo", 33, 79.2), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Patricia", 27, 63.5), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Alberto", 23, 72.8), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Diana", 29, 58.9), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Hugo", 21, 66.4), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Rebeca", 30, 74.6), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Samuel", 25, 83.3), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Jimena", 24, 57.1), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Fabián", 28, 71.9), "Verde")
    miTeleferico.agregarPersonaFila(Persona("Liliana", 19, 53.8), "Verde")

    miTeleferico.agregarCabina("Rojo")
    miTeleferico.agregarCabina("Rojo")
    miTeleferico.agregarCabina("Rojo")
    miTeleferico.agregarCabina("Rojo")
    miTeleferico.agregarCabina("Rojo")

    miTeleferico.agregarCabina("Amarillo")
    miTeleferico.agregarCabina("Amarillo")
    miTeleferico.agregarCabina("Amarillo")
    miTeleferico.agregarCabina("Amarillo")

    miTeleferico.agregarCabina("Verde")
    miTeleferico.agregarCabina("Verde")
    miTeleferico.agregarCabina("Verde")
    miTeleferico.agregarCabina("Verde")
    miTeleferico.agregarCabina("Verde")
    miTeleferico.agregarCabina("Verde")

    miTeleferico.mostrar()

    print("\t\t----->INCISO A<-----")
    miTeleferico.incisoA("Rojo", 1)
    miTeleferico.incisoA("Rojo", 2)
    miTeleferico.incisoA("Rojo", 1)
    miTeleferico.incisoA("Rojo", 3)
    miTeleferico.incisoA("Rojo", 4)

    miTeleferico.incisoA("Amarillo", 2)
    miTeleferico.incisoA("Amarillo", 2)
    miTeleferico.incisoA("Amarillo", 2)
    miTeleferico.incisoA("Amarillo", 3)
    miTeleferico.incisoA("Amarillo", 1)
    miTeleferico.incisoA("Amarillo", 1)

    miTeleferico.incisoA("Verde", 2)
    miTeleferico.incisoA("Verde", 2)
    miTeleferico.incisoA("Verde", 1)
    miTeleferico.incisoA("Verde", 1)
    miTeleferico.incisoA("Verde", 3)
    miTeleferico.incisoA("Verde", 3)
    miTeleferico.incisoA("Verde", 5)

    miTeleferico.mostrar()

    print("\t\t----->INCISO B<-----")
    miTeleferico.incisoB()

    print("\t\t----->INCISO C<-----")
    miTeleferico.incisoC()

    print("\t\t----->INCISO D<-----")
    miTeleferico.incisoD()


if __name__ == "__main__":
    main()