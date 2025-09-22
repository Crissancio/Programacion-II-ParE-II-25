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
    
class Marketing:
    def __init__(self, redSocial):
        self.__redSocial = redSocial
    
    def __str__(self):
        return f"RED SOCIAL: {self.__redSocial}"
    
    def getRedSocial(self):
        return self.__redSocial

class Red:
    def __init__(self, tipo):
        self.__tipoRed = tipo
    
    def __str__(self):
        return f"TIPO DE RED: {self.__tipoRedS}"

    def getTipoRed(self):
        return self.__tipoRed
    
class EmpleadoTecnologico(Diseñador, Programador, Marketing, Red):
    def __init__(self, nombre, lenguaje, herramienta, redSocial, tipo):
        Diseñador.__init__(self, herramienta)
        Programador.__init__(self, lenguaje)
        Marketing.__init__(self, redSocial)
        Red.__init__(self, tipo)
        self.__nombre = nombre
    
    def __str__(self):
        return f"NOMBRE: {self.__nombre}\nLENGUAJE: {self.getLenguaje()}\nHERRAMIENTA: {self.getHerramienta()} \nRED SOCIAL: {self.getRedSocial()}\nTIPO DE RED: {self.getTipoRed()}"


empleado = EmpleadoTecnologico("Jose", "PYTHON", "CANVA", "TIKTOK", "MONGO DB")

progra = Programador("JAVA")
dise = Diseñador("ADOBE")

print(dise)
print()
print(progra)
print()
print(empleado)

# Marketing (redSocial)
# Red (tipoServidor)