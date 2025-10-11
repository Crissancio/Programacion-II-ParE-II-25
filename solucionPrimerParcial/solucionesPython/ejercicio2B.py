from multipledispatch import dispatch

class Parqueo:
    def __init__(self,nv= 0, tariho = 0, vehiculo = [], tiempo = []):
        self.nv = nv
        self.tariho = tariho
        self.vehiculo = vehiculo
        self.tiempo = tiempo
    
    def getVehiculo(self):
        return self.vehiculo

    def getTiempo(self):
        return self.tiempo
    
    def __add__(self, otro):
        vehiculo = otro.getVehiculo()
        tiempo = otro.getTiempo()
        self.nv += 1
        self.vehiculo.append([ vehiculo[0][0], vehiculo[0][1]])
        self.tiempo.append([ tiempo[0][0], tiempo[0][1]])

    def mostrar(self):
        print("\t\t--------INFORMACION DEL PARQUEO--------")
        print(f"Numero de vehiculos: {self.nv}")
        print(f"Tarifa por hora: {self.tariho}")
        print("Vehiculos en el parqueo:")
        for i in range(0,self.nv,1):
            print(f"\tPlaca: {self.vehiculo[i][0]},Nombre: {self.vehiculo[i][1]}\n\tEntrada: {self.tiempo[i][0]},salida: {self.tiempo[i][1]}\n")
    
    @dispatch(str)
    def hallar(self, placaZ):
        for info in self.vehiculo:
            if info[0] == placaZ:
                print(f"EL CONDUCTOR DEL VEHICULO CON PLACA {placaZ} ES: {info[1]}")
                
    @dispatch(int)
    def hallar(self, horas):
        cont = 0
        for tiempo in self.tiempo:
            if (tiempo[1] - tiempo[0]) == horas:
                cont += 1
        print(f"EL NUMERO DE VEHICULOS QUE ESTUVIERON {horas} HORAS ES: {cont}") 
        

parqueo = Parqueo(5, 3, [
    ["123ABC", "Luis Jairo"],
    ["456DEF", "Ana Maria"],
    ["789GHI", "Carlos Perez"],
    ["321JKL", "Marta Gomez"],
    ["654MNO", "Jose Ruiz"]],[[2, 5],[9, 12],[10,12],[10, 13],[10, 11]])

nuevoAuto = Parqueo(vehiculo=[["987XYZ", "Sofia Lopez"]], tiempo=[[11, 14]])

parqueo.mostrar()
print("\nAgregando un nuevo auto al parqueo...\n")
parqueo + nuevoAuto
parqueo.mostrar()
parqueo.hallar("987XYZ")
parqueo.hallar(2)
