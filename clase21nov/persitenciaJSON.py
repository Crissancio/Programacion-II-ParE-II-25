import json

persona = {"nombre": "Ana", "edad": 20}

class Persona:
    def __init__(self, nom = "", edad = 0, peso = 0):
        self.nombre = nom
        self.edad = edad
        self.peso = peso
    
    def mostrar(self):
        print(self.nombre, self.edad, self.peso)
    
    def guardarArchivoJSON(self):
        datos = {
            "nombre": self.nombre,
            "peso": self.peso,
            "edad": self.edad
        }
        try:
            with open("/workspaces/Programacion-II-ParE-II-25/clase21nov/persona.json", "w") as file:
                json.dump(datos, file)
        except IOError as e:
            print(e)
    def crearDesdeArchivo(self, direccionArchivo):
        try:
            with open(direccionArchivo, "r") as a:
                datos = json.load(a)
                self.nombre = datos["nombre"]
                self.edad = datos["edad"]
                self.peso = datos["peso"]
        except FileNotFoundError:
            print("El archivo no existe")
        except json.JSONDecodeError:
            print("El archivo no contiene JSON válido")

class Mascota:
    def __init__(self, nombre = "", especie= "", edad= 0):
        self.nombre = nombre
        self.especie = especie
        self.edad = edad
        
    def mostrar(self):
        print("MASCOTA:", self.nombre, self.edad, self.especie)
    
    def guardarArchivo(self):
        datos = {
            "nombre": self.nombre,
            "edad": self.edad,
            "esepcie": self.especie
        }
        try:
            # w - write = escritura
            # r - read = lectura            
            with open("mascota.json", "w") as f:
                json.dump(datos, f)
        except IOError as e:
            print("Error al escribir el archivo:", e)
    
    def cargarArchivo(self, ruta):
        try:
            with open(ruta, "r") as f:
                mascota = json.load(f)
                self.nombre = mascota["nombre"]
                self.edad = mascota["edad"]
                self.especie = mascota["especie"]
        except FileNotFoundError:
            print("El archivo no existe")
        except json.JSONDecodeError:
            print("El archivo no contiene JSON válido")
        

# GUARDAR
'''
try:
    with open("persona.json", "w") as f:
        json.dump(persona, f)
    print("Archivo guardado correctamente")
except IOError as e:
    print("Error al escribir el archivo:", e)

# LEER
try:
    with open("persona.json", "r") as f:
        persona = json.load(f)
    print("Nombre:", persona["nombre"])
except FileNotFoundError:
    print("El archivo no existe")
except json.JSONDecodeError:
    print("El archivo no contiene JSON válido")
'''
p = Persona("Jose", 20, 70)
p.mostrar()
p.guardarArchivoJSON()

ruta = "/workspaces/Programacion-II-ParE-II-25/persona.json"

p1 = Persona()
p1.crearDesdeArchivo(ruta)
p1.mostrar()
print("--------------MASCOTA")
m = Mascota("Tarzan", "Perro", 5)
m.mostrar()
m.guardarArchivo()

ruta = "/workspaces/Programacion-II-ParE-II-25/mascotaPrueba.json"
m1 = Mascota()
m1.cargarArchivo(ruta)
m1.mostrar()