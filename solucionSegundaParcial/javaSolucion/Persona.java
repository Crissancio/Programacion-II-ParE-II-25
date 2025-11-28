package solucionSegundaParcial.javaSolucion;

public class Persona {
    private String nombre;
    private int edad;
    private float peso;

    public Persona(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public void mostrar() {
        System.out.println("\t\t[ " + this.nombre + " " + this.edad + " " + this.peso + "]");
    }

    public int getEdad() {
        return this.edad;
    }

    public float getPeso() {
        return this.peso;
    }
}
