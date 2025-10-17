from multipledispatch import dispatch

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

    def __str__(self):
        return f"Medicamento: {self.nombre}, Tipo: {self.tipo}, Año de Vencimiento: {self.añoVencimiento}, Stock: {self.stock}"

class Farmacia:
    @dispatch(str, list, list, list)
    def __init__(self, nom, medicamentos, clientes, trabajadores):
        self.nom = nom
        self.medicamentos = medicamentos
        self.clientes = clientes
        self.trabajadores = trabajadores


    @dispatch(str, list, list)
    def __init__(self, nom, clientes, trabajadores):
        self.nom = nom
        self.medicamentos = [Medicamento("Paracetamol", "Pastilla", 2002, 100),Medicamento("Ibuprofeno", "Pastilla", 2003, 150), Medicamento("Amoxicilina", "Jarabe", 2004, 200)]
        self.clientes = clientes
        self.trabajadores = trabajadores
    
    def agregarCliente(self, c):
        self.clientes.append(c)

    def mostrarMedicamentosJarabe(self):
        for m in self.medicamentos:
            if m.tipo == "Jarabe":
                print(m)

medis = [
    # Pastillas existentes
    Medicamento("Paracetamol", "Pastilla", 2002, 100),
    Medicamento("Ibuprofeno", "Pastilla", 2003, 150),

    # Jarabes existentes
    Medicamento("Amoxicilina", "Jarabe", 2004, 200),
    Medicamento("Dextrometorfano", "Jarabe", 2005, 250),
    Medicamento("Loratadina", "Jarabe", 2006, 300),

    # Pastillas nuevas
    Medicamento("Aspirina", "Pastilla", 2007, 120),
    Medicamento("Cetirizina", "Pastilla", 2008, 130),
    Medicamento("Naproxeno", "Pastilla", 2009, 140),
    Medicamento("Clorfeniramina", "Pastilla", 2010, 110),
    Medicamento("Metformina", "Pastilla", 2011, 160),

    # Jarabes nuevos
    Medicamento("Clorhexidina", "Jarabe", 2012, 210),
    Medicamento("Salbutamol", "Jarabe", 2013, 220),
    Medicamento("Guaifenesina", "Jarabe", 2014, 230),
    Medicamento("Ambroxol", "Jarabe", 2015, 240),
    Medicamento("Bromhexina", "Jarabe", 2016, 250),

    # Inyectables nuevos
    Medicamento("Insulina", "Inyectable", 2017, 500),
    Medicamento("Vacuna Influenza", "Inyectable", 2018, 600),
    Medicamento("Penicilina", "Inyectable", 2019, 550),
    Medicamento("Heparina", "Inyectable", 2020, 520),
    Medicamento("Morfina", "Inyectable", 2021, 580),
]

trab = [
    Trabajador("Ana Gómez", "mañana"),
    Trabajador("Luis Pérez", "tarde"),
    Trabajador("María López", "noche"),
    Trabajador("Carlos Ruiz", "mañana"),
    Trabajador("Sofía Martínez", "tarde"),
]


trab = [
    Trabajador("Ana Gómez", "mañana"),
    Trabajador("Luis Pérez", "tarde"),
    Trabajador("María López", "noche"),
    Trabajador("Carlos Ruiz", "mañana"),
    Trabajador("Sofía Martínez", "tarde"),
]

f1 = Farmacia("Farmacia Central,medis,clien, trab)

f1.agregaarCliente(Cliente("Jose Armando", 18 ))



