class Musico:
    def __init__(self, rol, bandas, aniosCarrera):
        self.__rolDesempeniado = rol
        self.__bandas = bandas
        self.__aniosDeCarrera = aniosCarrera
    def tocarIntrumento(self):
        print(f"Se a tocado el Intrumento: {self.__rolDesempeniado}") 
    
    def presentacion(self):
        print(f"Soy musico y desempeño el rol de: {self.__rolDesempeniado} por {self.__aniosDeCarrera} años")
    
    def getRolDesempeñado(self):
        return self.__rolDesempeniado
    
    def getAniosDeCarrera(self):
        return self.__aniosDeCarrera

class Profesor:
    def __init__(self, experiencia, lugarTrabajo):
        self.__aniosExperiencia = experiencia
        self.__lugarTrabajo = lugarTrabajo
    
    def enserñar(self):
        print(f"Se a enseñado en {self.__lugarTrabajo}")
        
    def getAniosExperiencia(self):
        return self.__aniosExperiencia

    def getLugarTrabajo(self):
        return self.__lugarTrabajo

class ProfesorMusica(Musico, Profesor):
    def __init__(self, a, b, c, d, e, nombre):
        Musico.__init__(self,a, b, c)
        Profesor.__init__(self, d, e)
        self.__nombre = nombre

    def __str__(self):
        return f"\nNOMBRE: {self.__nombre}\nROL: {self.getRolDesempeñado()} - {self.getAniosDeCarrera()} años\nEXPERIENCIA: {self.getAniosExperiencia()} - LUGAR DE TRABAJO: {self.getLugarTrabajo()}\n"


musico = Musico("Bajista", ["LINKIN PARK", "Guns 'n Rousses", "KISS"], 20)

profe = Profesor(15, "Amerins")

print("-----PRUEBA MUSICO-----")
musico.presentacion()
musico.tocarIntrumento()

print("\n-----PRUEBA PROFESOR-----")
profe.enserñar()

print("\n-----PRUEBA PROFESOR DE MUSICA-----")

profeMusica = ProfesorMusica("Guitarrista", ["DAFT PUNK"], 12, 10, "Conservatorio", "RAUL")
print(profeMusica)