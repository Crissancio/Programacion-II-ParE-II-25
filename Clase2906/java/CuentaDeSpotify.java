

public class CuentaDeSpotify{
    public String usuario;
    public String constraseña;
    public String canciones[];

    public CuentaDeSpotify(String usuario, String contraseña){
        this.usuario = usuario;
        this.constraseña = constraseña;
        this.canciones = new String[20];
    }

    public CuentaDeSpotify(String usuario, String contraseña, String canciones[]){
        this.usuario = usuario;
        this.contraseña = constraseña;
        this.canciones = canciones;
    }

    public boolean agregarCancion(String cancion){
        boolean esta = false;
        boolean hayEspacio = false;
        for(int i = 0; i < this.canciones.length; i++){
            if(this.canciones[i] != null){
                if(this.canciones[i] == cancion){
                    esta = true;
                    break;
                }
            }else{
                hayEspacio = true;
            }
        }

        if(esta == false  && hayEspacio == true){
            for(int i = 0; i < this.canciones.length; i++){
                if(this.canciones[i]==null){
                    this.canciones[i] = cancion;
                    break;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    
    public void escucharMusica(){
        System.out.println("Se esta escuchando la cancion "+this.canciones[0]);   
    }
    
    public void escucharMusica(String cancion){
        for(int i = 0; i < this.canciones.length; i++){
            if(this.canciones[i] != null){
                if(this.canciones[i]==cancion){
                    System.out.println("Se esta reproduciendo la cancion "+cancion)
                    break;
                }else{
                    System.out.println("No se a encontrado la cancion")
                    break;
                }
            }
        }
    }
    
    public static void main(String args[]){
        //CuentaDeSpotify cuenta = new CuentaDeSpotify();
    }
}