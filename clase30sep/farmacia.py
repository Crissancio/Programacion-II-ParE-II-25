from multipledispatch import dispatch

class Farmacia:
    def __init__(self, nombre="", cant=0, matMed=[], trab = []):
        self.__nombre = nombre
        self.__nMedicamnetos = cant
        self.__medis = matMed
        self.__trabajadores = trab
    
    def getMedis(self):
        return self.__medis
    
    def getNMedicamentos(self):
        return self.__nMedicamnetos
    
    def __add__(self, otro):
        matrizMedisOtro = otro.getMedis()
        nombreX, tipoX = matrizMedisOtro[0][0], matrizMedisOtro[0][1]
        
        for i in range(0, self.__nMedicamnetos, 1):
            if(nombreX == self.__medis[i][0] and tipoX == self.__medis[i][1]):
                return True
        return False
    
    def __sub__(self, otro):
        cantidadIncremento = otro.getNMedicamentos()
        
        for medicamento in self.__medis:
            if(medicamento[2] < 10):
                medicamento[2] = medicamento[2]+cantidadIncremento
                
        return 0
    
    def setMedis(self, medis):
        self.__medis = medis
    
    def getNombre(self):
        return self.__nombre

    def mostrar(self):
        print(f"-.-.-.-.-.-{self.__nombre}-.-.-.-.-.-")
        print(f"Cantidad de Medicamento: {self.__nMedicamnetos}")
        print("---Medicamentos---")
        for medicamento in self.__medis:
            print("", end= "\t")
            print(medicamento)
            
        for trabajador in self.__trabajadores:
            print("", end= "\t")
            print(trabajador)
    
    @dispatch()
    def metodoSobrecargado(self):
        copia = self.getMedis()
        ordenado = []
        
        while(len(copia)!=0):
            masPequeño = []
            asciiPeque = 96
            porVer = []
            for medi in copia:
                if(ord(medi[0][0]) > asciiPeque):
                    masPequeño = medi
                    asciiPeque = ord(medi[0][0])
                    
                    
            for medi in copia:
                if(masPequeño != medi):
                    porVer.append(medi)
                else:
                    ordenado.append(masPequeño)
            copia = porVer
            
        self.setMedis(ordenado)
    
    @dispatch(str)
    def metodoSobrecargado(self, nombreX):
        for trabajador in self.__trabajadores:
            if(nombreX == trabajador[0]):
                print(f" El trabajador {nombreX} esta en el turno de {trabajador[1]}")
                return 0
        
        print(f"No se a encontrado el trabajor {nombreX}")
        return 0

    @dispatch(object, str)
    def metodoSobrecargado(self, otro, tipoX):
        cantidad1 = 0
        cantidad2 = 0
        
        for medicamento in self.__medis:
            if(medicamento[1] == tipoX):
                cantidad1 += medicamento[2]
        
        for medicamento in otro.getMedis():
            if(medicamento[1] == tipoX):
                cantidad2 += medicamento[2]
        
        if(cantidad1 == cantidad2):
            print("AMBOS TIENEN LA MISMA CANTIDAD DE MEDICAMENTOS DE TIPO ", tipoX)
            print(cantidad1, cantidad2)
        elif(cantidad1 > cantidad2):
            print(self.__nombre)
        else:
            print(otro.getNombre())
        

f1 = Farmacia(nombre = "Farmcia Bolivia", trab = [["Raul", "noche"], ["Jose", "mañana"], ["Pepe", "tarde"]])
medis = [
    ["ibuprofeno", "pastilla", 4],
    ["paracetamol", "pastilla", 1],
    ["diclofenaco", "pomada", 14]
]

medis1 = [
    ["ibuprofeno", "pastilla", 4],
    ["paracetamol", "pastilla", 10],
    ["diclofenaco", "pomada", 14]
]

f2 = Farmacia(nombre="Farmacias Virgen de Copacabana", cant= 3, matMed= medis1)

f3 = Farmacia(nombre = "farmacia Chavez", cant = 3, matMed= medis, trab = [["Raul", "noche"], ["Jose", "mañana"], ["Pepe", "tarde"]])
f4 = Farmacia(matMed= [["diclofenaco", "pastilla"]])

seEncontro = f3+f4

print(seEncontro)

f3.mostrar()

print("\n\n")
f5 = Farmacia(cant=100)
# f3 - f5

f3.mostrar()

print("------------")
f3.metodoSobrecargado()
f3.metodoSobrecargado("POncio")
f3.metodoSobrecargado(f2, "pastilla")