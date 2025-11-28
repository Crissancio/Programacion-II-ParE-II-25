package solucionSegundaParcial.javaSolucion;

import java.util.ArrayList;

public class MiTeleferico {
    private ArrayList<Linea> lineas;
    private float cantidadIngresos;

    public MiTeleferico() {
        this.lineas = new ArrayList<Linea>();
        this.cantidadIngresos = 0;

        this.lineas.add(new Linea("Rojo"));
        this.lineas.add(new Linea("Amarillo"));
        this.lineas.add(new Linea("Verde"));
    }

    public void agregarPersonaFila(Persona p, String linea) {
        for (Linea l : this.lineas) {
            if (l.getColor().equals(linea)) {
                l.agregarPersona(p);
                break;
            }
        }
    }

    public void agregarCabina(String linea) {
        for (Linea l : this.lineas) {
            if (l.getColor().equals(linea)) {
                l.agregarCabina(l.getCantidadCabinas() + 1);
                break;
            }
        }
    }

    public void mostrar() {
        System.out.println("\t\t[-->BIENVENIDO A MI TELEFERICO<--]");
        for (Linea l : this.lineas) {
            l.mostrar();
        }
    }

    // a)
    public void incisoA(String linea, int nro) {
        boolean hecho = false;

        for (Linea l : this.lineas) {
            if (l.getColor().equals(linea)) {
                if (l.getPersonaFila().size() != 0) {
                    for (Cabina c : l.getCabinas()) {
                        if (c.getNroCabina() == nro) {
                            Persona p = l.getPersonaFila().get(0);
                            if (c.conseguirPesoTotal() + p.getPeso() <= 850 && c.getPersonasAbordo().size() < 10) {
                                c.agregarPersona(p);
                                l.getPersonaFila().remove(0);
                                hecho = true;
                            }
                        }
                    }
                } else {
                    System.out.println("Linea " + linea + " sin Personas en Fila");
                }
            }
        }

        if (hecho) {
            System.out.println("REALIZADO CON EXITO");
        } else {
            System.out.println("NO SE PUDO AGREGAR A LA PERSONA EN LA CABINA");
        }
    }

    public void incisoB() {
        boolean cumplen = true;

        for (Linea l : this.lineas) {
            for (Cabina c : l.getCabinas()) {
                if (c.conseguirPesoTotal() > 850 || c.getPersonasAbordo().size() > 10) {
                    cumplen = false;
                    System.out.println("La Cabina " + c.getNroCabina() + " - " + l.getColor()
                            + "NO CUMPLE CON LAS REGLAS DE ABORDAJE");
                }
            }
        }

        if (cumplen) {
            System.out.println("NO SE ENCONTRARON INCUMPLIMIENTOS");
        }
    }

    public void incisoC() {
        float ingresos = 0;
        for (Linea l : this.lineas) {
            for (Cabina c : l.getCabinas()) {
                for (Persona p : c.getPersonasAbordo()) {
                    if (p.getEdad() < 25 || p.getEdad() > 60) {
                        ingresos = ingresos + 1.5F;
                    } else {
                        ingresos = ingresos + 3F;
                    }
                }
            }
        }

        this.cantidadIngresos = ingresos;
        System.out.println("SE CALCULARON " + ingresos + " INGRESOS");
    }

    public void incisoD() {
        float ingresosMax = 0;
        String linea = "";
        for (Linea l : this.lineas) {
            float ingresos = 0;
            for (Cabina c : l.getCabinas()) {
                for (Persona p : c.getPersonasAbordo()) {
                    if (p.getEdad() >= 25 & p.getEdad() <= 60) {
                        ingresos = ingresos + 3F;
                    }
                }
            }

            if (ingresos > ingresosMax) {
                ingresosMax = ingresos;
                linea = l.getColor();
            }
        }

        System.out.println("La Linea "+ linea+ " tiene mas ingresos en tarifa regular: "+ingresosMax);
    }
}
