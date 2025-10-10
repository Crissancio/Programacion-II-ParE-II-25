class Pedido:
    def __init__(self,nom, cant, precio ):
        self.__nombre = nom
        self.__cantidad = cant
        self.__precio = precio


class Factura:
    def __init__(self, razon, sepago, pedidos):
        self.__razonSocial = razon
        self.__sePago = sepago
        self.__pedidos = pedidos
    
    def getSePago(self):
        return self.__sePago


class Persona:
    def __init__(self, nom, dir, facturas):
        self.__nombre = nom
        self.__direccion = dir
        self.__facturas = facturas

    def tienFacturasSinPagar(self):
        for f in self.__facturas:
            if(f.getSePago() == False):
                return True
        return False




pe1 = []
pe1.append(Pedido("hamburguesa",4, 5.2))
pe1.append(Pedido("pizza", 2, 3))

pe2 = []
pe2.append(Pedido("Piquemacho", 2, 10.0))
pe2.append(Pedido("Charquecan", 3, 15.0))

pe3 = []
pe3.append(Pedido("Salchipapa", 1, 4.5))
pe3.append(Pedido("Empanada", 4, 2.0))
pe3.append(Pedido("Tacos", 2, 6.75))

pe4 = []
pe4.append(Pedido("Sushi", 3, 12.0))
pe4.append(Pedido("Lasaña", 1, 8.9))
pe4.append(Pedido("Pollo frito", 5, 3.2))
pe4.append(Pedido("Arepas", 2, 4.0))
pe4.append(Pedido("Ceviche", 1, 10.5))

pe5 = []
pe5.append(Pedido("Pan con chorizo", 2, 3.8))
pe5.append(Pedido("Tamales", 3, 5.5))
# ------FACTURAS
f1 = []
f1.append(Factura("1325742",True, pe1))
f1.append(Factura("1325742", False, pe2))

f2 = []
f2.append(Factura("1325745", True, pe2))
f2.append(Factura("1325746", False, pe5))
f2.append(Factura("1325747", True, pe1))

f3 = []
f3.append(Factura("1325748", True, pe4))

# -------PERSONAS

p1 = Persona("Juan", "Av. 6 de Agosto", f1)
p2 = Persona("Raul", "Av. Litoral", f2)
p3 = Persona("Tadeo", "Senkata", f3)

personas = [p1, p2, p3]

def ejercicio1(personas):
    cont = 0
    for p in personas:
        if(p.tienFacturasSinPagar()):
            cont += 1
    
    print(f"Hay {cont} personas con facturas sin pagar")

ejercicio1(personas)