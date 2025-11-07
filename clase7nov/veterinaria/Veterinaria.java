package veterinaria;

import java.util.ArrayList;

public class Veterinaria {
    private String nombre;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Dueño> clientes;

    public Veterinaria(String nom) {
        this.nombre = nom;
        this.clientes = new ArrayList<Dueño>();
        this.mascotas = new ArrayList<Mascota>();
        this.trabajadores = new ArrayList<Trabajador>();
    }

    public void mostrar() {
        System.out.println("VERTERINARIA: " + this.nombre);
        System.out.println("TRABAJADORES");
        for (Trabajador t : this.trabajadores) {
            t.mostrar();
        }

        System.out.println("CLIENTES");
        for (Dueño c : this.clientes) {
            c.mostrar();
        }

        System.out.println("MASCOTAS:");
        for (Mascota m : this.mascotas) {
            m.mostrar();
        }
    }

    public void agregarCliente(Dueño d) {
        this.clientes.add(d);
    }

    public void agregarTrabajador(Trabajador t) {
        this.trabajadores.add(t);
    }

    public void agregarMascota(Mascota m) {
        this.mascotas.add(m);
    }

    // a) mostrar al dueño de la mascota de nombre X
    public Dueño conseguirDueñoPorId(int id) {
        Dueño d = null;

        for (Dueño dueño : this.clientes) {
            if (dueño.getIdDue() == id) {
                d = dueño;
            }
        }
        return d;
    }

    public void mostrarDueñoMascotaX(String nom) {
        for (Mascota m : this.mascotas) {
            if (m.getNomMas().equals(nom)) {
                try {
                    Dueño dueño = this.conseguirDueñoPorId(m.getIdDue());

                    System.out.println("El dueño de " + nom + " es: ");
                    dueño.mostrar();
                } catch (NullPointerException e) {
                    System.out.println("ESTA MASCOTA NO TIENE DUEÑO");
                }
            }
        }
    }

    // b) mostrar a todos los dueños y sus mascotas

    public Mascota conseguirMascotaPorId(int id) {
        Mascota m = null;
        for (Mascota mascota : this.mascotas) {
            if (mascota.getIdMas() == id) {
                m = mascota;
            }
        }

        return m;
    }

    public void mostrarDueñosYMascotas() {
        for (Dueño d : this.clientes) {
            System.out.println("MASCOTAS DEL DUEÑO: " + d.getNomDue());
            for (Mascota m : this.mascotas) {
                if (m.getIdDue() == d.getIdDue()) {
                    m.mostrar();
                }
            }
        }
    }

    // D) Mostrar a todas las mascotas que tiene dueños que viven en la zonaX
    public void inscisoD(String zonaX) {
        for (Mascota m : this.mascotas) {
            Dueño d = this.conseguirDueñoPorId(m.getIdDue());
            try {
                if (d.getZona().equals(zonaX)) {
                    System.out.println("\t" + m.getNomMas());
                }
            } catch (NullPointerException e) {
                continue;
            }
        }
    }

    // Mostrar a las mascotas de tipoX y el nombre de su dueño
    public void inscisoC(String tipo) {
        for (Mascota m : this.mascotas) {
            if (m.getTipo().equals(tipo)) {
                try {
                    Dueño d = this.conseguirDueñoPorId(m.getIdDue());
                    System.out.println(d.getNomDue() + "  es dueño de " + m.getNomMas());
                } catch (NullPointerException e) {
                    System.out.println(m.getNomMas() + "  no tiene dueño :c");
                }
            }
        }
    }
}
