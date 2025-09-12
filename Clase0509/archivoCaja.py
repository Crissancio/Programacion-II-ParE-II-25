class Caja:
    def __init___(self, nFrutas, nRopas):
        self.nFrutas = nFrutas
        self.nRopas = nRopas
    
    def __str__(self):
        return f"Ropas: {self.nRopas}\nFrutas: {self.nFrutas}"

    #def __add__(self, otro):
        