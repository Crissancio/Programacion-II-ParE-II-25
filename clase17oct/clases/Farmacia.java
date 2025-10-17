package clases;

import java.util.ArrayList;

public class Farmacia {
    public String nom;
    public ArrayList<Medicamento> medicamentos;
    public ArrayList<Cliente> clientes;
    public ArrayList<Trabajador> trabajadores;

    public Farmacia(String nom, ArrayList<Medicamento> medicamentos, ArrayList<Cliente> clientes, ArrayList<Trabajador> trabajadores) {
        this.nom = nom;
        this.medicamentos = medicamentos;
        this.clientes = clientes;
        this.trabajadores = trabajadores;
    }




}
