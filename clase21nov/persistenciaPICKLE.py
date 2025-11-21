from dataclasses import dataclass, asdict
import json

@dataclass
class Persona:
    nombre: str
    edad: int

p = Persona("Luis", 22)

try:
    with open("persona.json", "w") as f:
        json.dump(asdict(p), f)
except Exception as e:
    print("Error:", e)
