

class CuentaBancaria:
    def __init__(self, titular, nroCuenta, saldo = 0):
        self.__titular = titular
        self.__nroCuenta = nroCuenta
        self.__saldo = saldo
    
    def depositar(self, monto):
        if(monto  <= 0):
            print("ERROR: EL MONTO INGRESADO NO ES CORRECTO")
        else:
            self.__saldo = self.__saldo + monto
            #self.__saldo+=monto
            print("EXITO: EL MONTO A SIDO DEPOSITADO CORRECTAMENTE")
    
    def retirar(self, monto):
        if(monto > self.__saldo):
            print("ERROR: El MONTO INGRESADO SUPERA EL SALDO DISPONIBLE")
        else:
            self.__saldo = self.__saldo - monto
            print(f"EXITO: SE HAN RETIRADO {monto} DE LA CUENTA")
            
    def __str__(self):
        return f"TITULAR: {self.__titular}\nNRO DE CUENTA: {self.__nroCuenta}\nSALDO: {self.__saldo}"
    
    
cuenta1 = CuentaBancaria(titular="JOSE", nroCuenta=12412654, saldo=500)
print("---PRUEBAS CUENTA 1---")
print(cuenta1)
cuenta1.depositar(-87)
print("---DESPUES DE DEPOSITAR--- \n")
print(cuenta1)

cuenta1.retirar(12000)
print("---DESOUES DE RETIRAR--- \n")
print(cuenta1)

