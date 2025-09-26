class Producto:
    def __init__(self, nombre, precio):
        self.__ombre = nombre
        self.__precio = precio
    
    def __str__(self):
        return f"Producto: {self.__nombre}, Precio: {self.__precio}"
    def mostrarInfo(self):
        print(f"Producto: {self.__nombre}, Precio: {self.__precio}")

class Bebida(Producto):
    def __init__(self, nombre, precio, contenido, gaseosa):
        super().__init__(nombre, precio)
        self.__contenido = contenido
        self.__gaseosa = gaseosa
    
    def __str__(self):
        tipo = "Gaseosa" if self.__gaseosa else "No Gaseosa"
        return f"{super().__str__()}, Contenido: {self.__contenido}ml, Tipo: {tipo}"

class Comida(Producto):
    def __init__(self, nombre, precio, calorias):
        super().__init__(nombre, precio)
        self.__calorias = calorias
    
    def __str__(self):
        return f"{super().__str__()}, Calorias: {self.__calorias}Kcal"

class Zapato(Producto):
    def __init__(self, nombre, precio, talla):
        super().__init__(nombre, precio)
        self.__talla = talla
    
    def __str__(self):
        return f"{super().__str__()}, Talla: {self.__talla}"


b1 = Bebida("Coca Cola", 15.0, 3, True)
c1 = Comida("Pizza", 250.0, 20)
z1 = Zapato("Nike", 5000.0, 42)
b2 = Bebida("Agua", 10.0, 5, False)
z2 = Zapato("Adidas", 4500.0, 40)