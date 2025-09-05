class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, otro):
        nuevoX = self.x * otro.x
        nuevoY = self.y - otro.y

        nuevoPunto = Punto(nuevoX, nuevoY)
        return nuevoPunto

    def __sub__(self, otro):
        nx = self.x - otro.x
        ny = self.y - otro.y

        return Punto(nx. ny)

    def __eq__(self, otro):
        if(self.x == otro.x and self.y == otro.y):
            return True
        else:
            return Fa

    def __str__(self):
        return f"x: {self.x}\ny: {self.y}\n"
    


# programa principal
a = Punto(4,7)
b = Punto(6,1)

c = a + b
print(c)
    