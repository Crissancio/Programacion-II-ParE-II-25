package Clase2906.java;


public class CuentaDeSpotify{
    public String usuario;
    public String constraseña;
    public String canciones[];

    public CuentaDeSpotify(String usuario, String contraseña){
        this.usuario = usuario;
        this.constraseña = contraseña;
        this.canciones = new String[20];
    }

    public CuentaDeSpotify(String usuario, String contraseña, String canciones[]){
        this.usuario = usuario;
        this.constraseña = contraseña;
        this.canciones = canciones;
    }

    public boolean agregarCancion(String cancion){
        boolean esta = false;
        boolean hayEspacio = false;
        hayEspacio = this.canciones.length == 0?true:false;
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
        boolean seEncontro = false;
        for(int i = 0; i < this.canciones.length; i++){
            if(this.canciones[i] != null){
                if(this.canciones[i]==cancion){
                    System.out.println("Se esta reproduciendo la cancion "+cancion);
                    seEncontro = true;
                    break;
                }
            }
        
        }
        if(!seEncontro){
            System.out.println("No se encontro la canciones");
        }
    }
}