package persistencia;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }

    public void mostrar(){
        System.out.println(nombre+ " "+ edad);
    }
}