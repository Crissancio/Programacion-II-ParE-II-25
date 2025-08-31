package Clase2906.java;

public class Main {
    public static void main(String[] args){
        CuentaDeSpotify cuenta1 = new CuentaDeSpotify("CrickoSaurio", "12345678");
        cuenta1.agregarCancion("Kyoto");
        cuenta1.agregarCancion("It Was A Good Day");
        cuenta1.agregarCancion("Die Hard");

        String canciones[] = new String[20];
        canciones[0] = "1000 canciones";
        canciones[1] = "La Zona";
        canciones[2] = "Si veo a tu mamá";
        canciones[3] = "Vuelve Candy B";
        canciones[4] = "DoomsDay";

        CuentaDeSpotify cuenta2 = new CuentaDeSpotify("User1", "Contraseña123", canciones);


        System.out.println("Cuenta: "+cuenta1.usuario+"\nContraseña: "+cuenta1.constraseña+"\nCanciones:");
        for(String cancion : cuenta1.canciones){
            if(cancion!=null){
                System.out.println(cancion);
            }else{
                break;
            }
        }

        System.out.println("\n-------------------------------");
        System.out.println("Cuenta: "+cuenta2.usuario+"\nContraseña: "+cuenta2.constraseña+"\nCanciones:");
        for(String cancion : cuenta2.canciones){
            if(cancion!=null){
                System.out.println(cancion);
            }else{
                break;
            }
        }

        System.out.println("\n------REPRODUCIR CANCION cuenta1");
        cuenta1.escucharMusica();
        cuenta1.escucharMusica("TRELLAS");
        cuenta1.escucharMusica("Die Hard");

        System.out.println("\n------REPRODUCIR CANCION cuenta1");
        cuenta2.escucharMusica();
        cuenta2.escucharMusica("TRELLAS");
        cuenta2.escucharMusica("La Zona");
    }
}