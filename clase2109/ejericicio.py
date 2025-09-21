class Programador:
    def __init__(self, lenguaje):
        self.__lenguaje = lenguaje
    
    def __str__(self):
        return f"LENGUAJE: {self.__lenguaje}"
    
    def getLenguaje(self):
        return self.__lenguaje
    
class Diseñador:
    def __init__(self, herramienta):
        self.__herramienta = herramienta
    
    def __str__(self):
        return f"HERRAMIENTA: {self.__herramienta}" 
    
    def getHerramienta(self):
        return self.__herramienta
    
class EmpleadoTecnologico(Diseñador, Programador):
    def __init__(self, nombre, lenguaje, herramienta):
        Diseñador.__init__(self, herramienta)
        Programador.__init__(self, lenguaje)
        self.__nombre = nombre
    
    def __str__(self):
        return f"NOMBRE: {self.__nombre}\nLENGUAJE: {self.getLenguaje()}\nHERRAMIENTA: {self.getHerramienta()}"


empleado = EmpleadoTecnologico("Jose", "PYTHON", "CANVA")

progra = Programador("JAVA")
dise = Diseñador("ADOBE")

print(dise)
print()
print(progra)
print()
print(empleado)

# Marketing (redSocial)
# Redes (tipoServidor)