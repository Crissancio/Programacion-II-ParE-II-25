import json

persona = {"nombre": "Ana", "edad": 20}


# GUARDAR
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