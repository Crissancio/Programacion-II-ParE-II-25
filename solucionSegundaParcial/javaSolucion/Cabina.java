package solucionSegundaParcial.javaSolucion;

import java.util.ArrayList;

public class Cabina {
    private ArrayList<Persona> personasAbordo;
    private int nroCabina;

    public Cabina(int nro) {
        this.nroCabina = nro;
        personasAbordo = new ArrayList<Persona>();
    }

    public void agregarPersona(Persona p) {
        personasAbordo.add(p);
    }

    public void mostrar() {
        System.out.println("\t[Nro de Cabina: " + this.nroCabina + "]");
        System.out.println("\tPersonas en Cabina:");
        if (this.personasAbordo.size() != 0) {
            for (Persona p : this.personasAbordo) {
                p.mostrar();
            }
        } else {
            System.out.println("\t\tSin Personas en Cabina");
        }
    }

    public int getNroCabina() {
        return this.nroCabina;
    }

    public ArrayList<Persona> getPersonasAbordo() {
        return this.personasAbordo;
    }

    public float conseguirPesoTotal() {
        float peso = 0;
        for (Persona p : this.personasAbordo) {
            peso = peso + p.getPeso();
        }
        return peso;

    }
}
