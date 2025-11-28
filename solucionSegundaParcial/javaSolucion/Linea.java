package solucionSegundaParcial.javaSolucion;

import java.util.ArrayList;

public class Linea {
    private String color;
    private int cantidadCabinas;
    private ArrayList<Cabina> cabinas;
    private ArrayList<Persona> filaPersonas;

    public Linea(String color) {
        this.color = color;
        this.cantidadCabinas = 0;
        this.cabinas = new ArrayList<Cabina>();
        this.filaPersonas = new ArrayList<Persona>();
    }

    public void agregarPersona(Persona p) {
        this.filaPersonas.add(p);
    }

    public void agregarCabina(int nroCabina) {
        this.cantidadCabinas++;
        this.cabinas.add(new Cabina(nroCabina));
    }

    public void mostrar() {
        System.out.println("\n[---Linea:" + this.color + "---]");
        System.out.println("Cantidad de Cabinas: " + this.cantidadCabinas);
        for (Cabina c : this.cabinas) {
            c.mostrar();
        }
        System.out.println("\tFila de Personas:");
        for (Persona p : this.filaPersonas) {
            p.mostrar();
        }
    }

    public int getCantidadCabinas() {
        return this.cantidadCabinas;
    }

    public String getColor() {
        return this.color;
    }

    public ArrayList<Persona> getPersonaFila() {
        return this.filaPersonas;
    }

    public ArrayList<Cabina> getCabinas() {
        return this.cabinas;
    }
}
