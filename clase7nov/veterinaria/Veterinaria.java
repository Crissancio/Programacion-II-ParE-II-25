package veterinaria;

import java.util.ArrayList;

public class Veterinaria {
    private String nombre;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Dueño> clientes;

    public Veterinaria(String nom) {
        this.nombre = nom;
        this.clientes = new ArrayList<>();
        this.mascotas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
}
