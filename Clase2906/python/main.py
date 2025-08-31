class CuentaDeSpotify:
    # FORMA PARA SIMULAR SOBRECARGA DE OPERADORES EN CONSTRUCTOR
    def __init__(self, cuenta, contraseña, canciones = []):
        self.cuenta = cuenta
        self.contraseña = contraseña
        self.canciones = canciones
    
