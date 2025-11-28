import pickle

class Persona:
    def __init__(self, nom = "", edad = 0, peso = 0):
        self.nombre = nom
        self.edad = edad
        self.peso = peso
    
    def mostrar(self):
        print(self.nombre, self.edad, self.peso)
    
    def guardar(self):
        try: 
            with open("p1.dat", "wb") as file:
                pickle.dump(self, file)
        except IOError as e:
            print(e)
        except Exception as m:
            print("ERROR RARO:", m)
    
    def crear(self, ruta):
        try:
            with open(ruta, "rb") as arc:
                p = pickle.load(arc)
                self.nombre = p.nombre
                self.edad = p.edad
                self.peso = p.peso
        except Exception as e:
            print(e)

'''
try: 
    with open("persona.dat", "wb") as file:
        pickle.dump(persona, file)
except IOError as e:
    print(e)

m = []
try:
    with open("persona.dat", "rb") as archivo:
        m = pickle.load(archivo)
except Exception as e:
    print(e)

print(m)
'''

p1 = Persona()
ruta = "/workspaces/Programacion-II-ParE-II-25/p1.dat"
p1.crear(ruta)
p1.mostrar()
