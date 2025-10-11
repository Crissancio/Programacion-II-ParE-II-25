
class Profesional:
    def __init__(self, nombre="", añosEstudio= 0, añosExperiencia=0):
        self.nombre = nombre
        self.añosEstudio = añosEstudio
        self.añosExperiencia = añosExperiencia
    
    def getAñosExperiencia(self):
        return self.añosExperiencia
    
    def getAñosEstudio(self):
        return self.añosEstudio
    
    def compararProfesionales(self, otroProfesional):
        if self.getAñosExperiencia() == otroProfesional.getAñosExperiencia() and self.getAñosEstudio() == otroProfesional.getAñosEstudio():
            return True
    
class Nutricionista(Profesional):
    def __init__(self, nombre="", añosEstudio=0, añosExperiencia=0, pacientesAtendidos=0, especialidad="", clinicaTrabajo=""):
        super().__init__(nombre, añosEstudio, añosExperiencia)
        self.pacientesAtendidos = pacientesAtendidos
        self.especialidad = especialidad
        self.clinicaTrabajo = clinicaTrabajo
    

class Informatico(Profesional):
    def __init__(self, nombre="", añosEstudio=0, añosExperiencia=0, lenguajeDominante="", empresaTrabajo="", trabajoRemoto=False):
        super().__init__(nombre, añosEstudio, añosExperiencia)
        self.lenguajeDominante = lenguajeDominante
        self.empresaTrabajo = empresaTrabajo
        self.trabajoRemoto = trabajoRemoto

class Abogado(Profesional):
    def __init__(self, nombre="", añosEstudio=0, añosExperiencia=0, casosGanados=0, especialidad="", bufeteTrabajo=""):
        super().__init__(nombre, añosEstudio, añosExperiencia)
        self.casosGanados = casosGanados
        self.especialidad = especialidad
        self.bufeteTrabajo = bufeteTrabajo


n1 = Nutricionista(nombre="Ana", añosEstudio=5, añosExperiencia=25, pacientesAtendidos=15, especialidad="Licenciatura en Nutricion", clinicaTrabajo="Clinica Vida Saludable")

a1 = Abogado(nombre="Luis", añosEstudio=7,añosExperiencia= 30,especialidad= "Derecho Penal", bufeteTrabajo= "Bufete Legal") 
a2 = Abogado(nombre="Carlos", añosEstudio=7,especialidad= "Derecho Penal",bufeteTrabajo= "Bufete Justicia")

i1 = Informatico(nombre="Marta",añosEstudio= 6,añosExperiencia= 12,lenguajeDominante= "Java",empresaTrabajo= "JalaSoft",trabajoRemoto= True)
i2 = Informatico("Sofia", añosEstudio=7, añosExperiencia=10, lenguajeDominante="Python", empresaTrabajo="Tech Solutions")

pros = [n1, a1, a2, i1, i2]
prom = 0
for pro in pros:
    prom += pro.getAñosEstudio()
    
print("El promedio de años de estudio es:", prom/len(pros))