import json

class Medicamento:
    def __init__(self, id= 0, nom = "", stock = 0, precio= 0):
        self.id = id
        self.nom = nom
        self.stock = stock
        self.precio = precio

    def convertir_diccionario(self):
        return {
            "id":self.id,
            "stock":self.stock,
            "nom":self.nom,
            "precio":self.precio
        }
        
    def cargar_desde_dic(self, datos):
        self.id = datos["id"]
        self.nom = datos["nom"]
        self.precio = datos["precio"]
        self.stock = datos["stock"]

    def guardar(self, ruta):
        with open(ruta, "w") as file:
            json.dump(self.convertir_diccionario(), file)
            
    def cargar(self, ruta):
        with open (ruta, "r") as f:
            d = json.load(f)
            self.cargar_desde_dic(d)
    
    def mostrar(self):
        print(f"[{self.id} {self.nom} {self.precio} {self.stock}]")

class Farmacia:
    def __init__(self, ):
        self.medicamentos = []
        
    def addMedi(self, m):
        self.medicamentos.append(m)
        
    def mostrar(self):
        print("----FARMACIA----")
        for m in self.medicamentos:
            m.mostrar()

    def diccionario(self):
        med = []
        for m in self.medicamentos:
            med.append(m.convertir_diccionario())
        return {
            "medicamentos": med
        }
    
    def cargar_desde_dic(self, datos):
        medis = []
        for med in datos["medicamentos"]:
            m = Medicamento()
            m.cargar_desde_dic(med)
            medis.append(m)

        self.medicamentos = medis
    
    def guardar(self, ruta):
        with open (ruta, "w") as f:
            json.dump(self.diccionario(), f)

    def cargar(self, ruta):
        with open(ruta, "r") as a:
            datos = json.load(a)
            self.cargar_desde_dic(datos)
            
    
# m = Medicamento(1, "ascepcia", 32,24.7)
# m = Medicamento()
# m.cargar("C:/Users/Cristhian/Documents/NetBeansProjects/persistenciaGSON/archivo.json")
# m.mostrar()
f1 = Farmacia()
'''
f1.addMedi(Medicamento(1, "ascepcia", 32,24.7))
f1.addMedi(Medicamento(2, "paracetamol", 15, 12.5))
f1.addMedi(Medicamento(3, "ibuprofeno", 28, 18.9))
f1.addMedi(Medicamento(4, "amoxicilina", 40, 32.7))
f1.addMedi(Medicamento(5, "omeprazol", 22, 25.4))
f1.addMedi(Medicamento(6, "loratadina", 10, 14.2))
f1.addMedi(Medicamento(7, "diclofenaco", 35, 19.8))
f1.addMedi(Medicamento(8, "azitromicina", 12, 41.3))
f1.addMedi(Medicamento(9, "metamizol", 50, 27.9))
f1.addMedi(Medicamento(10, "ranitidina", 18, 16.6))
f1.addMedi(Medicamento(11, "prednisona", 30, 29.4))
'''

# f1.guardar("farmacia.json")

f1.cargar("farmacia.json")

f1.mostrar()


# m.guardar("medicamento.json")


