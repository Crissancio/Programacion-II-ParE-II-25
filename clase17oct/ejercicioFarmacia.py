class Cliente:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Trabajador:
    def __init__(self, nombre, turno):
        self.nombre = nombre
        self.turno = turno

class Medicamento:
    def __init__(self, nombre, tipo, añoVencimiento, stock):
        self.nombre = nombre
        self.tipo = tipo
        self.añoVencimiento = añoVencimiento
        self.stock = stock

class Farmacia:
    def __init__(self, nom, medicamentos, clientes, trabajadores):
        self.nom = nom
        self.medicamentos = medicamentos
        self.clientes = clientes
        self.trabajadores = trabajadores