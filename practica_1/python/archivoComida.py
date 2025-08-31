class Comida:
    def __init__(self,nombre, precio, ingredientes, descripcion):
        self.nombre = nombre
        self.precio = precio
        self.ingredientes = ingredientes
        self.descripcion = descripcion
    
    def vender(self):
        print(f"Se ha vendido {self.nombre}")
    
    def cambiarPrecio(self, precio):
        if(precio > 0):
            self.precio = precio
            return True
        else:
            print("El precio ingresado es menor o igual a 0")
            return False
    
    def cambiarIngredientes(self, ingre):
        self.ingredientes = ingre
        print("Se han cambiado los ingredientes")
    
    def agregarIngrediente(self, ingrediente):
        self.ingredientes.append(ingrediente)
        print("Se a agregado ", ingrediente)
    
    def __str__(self):
        return f"Nombre: {self.nombre}\nPrecio {self.precio}\nDescripcion: {self.descripcion}\nIngredientes {self.ingredientes}"
    
pizza = Comida("Pizza Carnivora",40.80, ["masa", "salsa de tomate", "peperoni","carne molida", "queso"], "Pizza Carnivora de Tamaño Mediano")
print(pizza)

pizza.vender()

if(pizza.cambiarPrecio(20)): 
    print("se a cambiado el precio")
    
print(pizza)

pizza.cambiarIngredientes(["mortadela", "peperoni", "carne molida", "masa", "queso", "salsa de tomate"])
print(pizza)

pizza.agregarIngrediente("oregano")

print(pizza)