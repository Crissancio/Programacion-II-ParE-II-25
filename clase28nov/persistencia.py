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

# m = Medicamento(1, "ascepcia", 32,24.7)
# m = Medicamento()
# m.cargar("C:/Users/Cristhian/Documents/NetBeansProjects/persistenciaGSON/archivo.json")
# m.mostrar()

# m.guardar("medicamento.json")


