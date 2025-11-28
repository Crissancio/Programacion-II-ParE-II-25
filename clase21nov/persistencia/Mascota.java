package persistencia;

import java.io.*;

public class Mascota implements Serializable {
    private String nombre, especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void guardar(){
        try(ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("mascota.ser"))){
            file.writeObject(this);
        }catch(IOException e){
            System.out.println("ERROR RARO: "+ e);
        }
    }


    public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 6);
        m1.guardar();
    }
}
