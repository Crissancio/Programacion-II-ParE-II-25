package clases;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cliente> clien = new ArrayList<>();
        clien.add(new Cliente("Juan Martínez", 28));
        clien.add(new Cliente("Lucía Fernández", 34));
        clien.add(new Cliente("Miguel Torres", 22));
        clien.add(new Cliente("Andrea Ramírez", 40));
        clien.add(new Cliente("Santiago Díaz", 31));
        clien.add(new Cliente("Isabela Morales", 27));
        clien.add(new Cliente("Diego Herrera", 36));
        clien.add(new Cliente("Valentina Castro", 29));
        clien.add(new Cliente("José Sánchez", 33));
        clien.add(new Cliente("Camila Ortiz", 25));

        // Lista de Trabajadores
        ArrayList<Trabajador> trab = new ArrayList<>();
        trab.add(new Trabajador("Ana Gómez", "mañana"));
        trab.add(new Trabajador("Luis Pérez", "tarde"));
        trab.add(new Trabajador("María López", "noche"));
        trab.add(new Trabajador("Carlos Ruiz", "mañana"));
        trab.add(new Trabajador("Sofía Martínez", "tarde"));

        // Lista de Medicamentos
        ArrayList<Medicamento> medis = new ArrayList<>();
        // Pastillas
        medis.add(new Medicamento("Paracetamol", "Pastilla", 2002, 100));
        medis.add(new Medicamento("Ibuprofeno", "Pastilla", 2003, 150));
        medis.add(new Medicamento("Aspirina", "Pastilla", 2007, 120));
        medis.add(new Medicamento("Cetirizina", "Pastilla", 2008, 130));
        medis.add(new Medicamento("Naproxeno", "Pastilla", 2009, 140));
        medis.add(new Medicamento("Clorfeniramina", "Pastilla", 2010, 110));
        medis.add(new Medicamento("Metformina", "Pastilla", 2011, 160));

        // Jarabes
        medis.add(new Medicamento("Amoxicilina", "Jarabe", 2004, 200));
        medis.add(new Medicamento("Dextrometorfano", "Jarabe", 2005, 250));
        medis.add(new Medicamento("Loratadina", "Jarabe", 2006, 300));
        medis.add(new Medicamento("Clorhexidina", "Jarabe", 2012, 210));
        medis.add(new Medicamento("Salbutamol", "Jarabe", 2013, 220));
        medis.add(new Medicamento("Guaifenesina", "Jarabe", 2014, 230));
        medis.add(new Medicamento("Ambroxol", "Jarabe", 2015, 240));
        medis.add(new Medicamento("Bromhexina", "Jarabe", 2016, 250));

        // Inyectables
        medis.add(new Medicamento("Insulina", "Inyectable", 2017, 500));
        medis.add(new Medicamento("Vacuna Influenza", "Inyectable", 2018, 600));
        medis.add(new Medicamento("Penicilina", "Inyectable", 2019, 550));
        medis.add(new Medicamento("Heparina", "Inyectable", 2020, 520));
        medis.add(new Medicamento("Morfina", "Inyectable", 2021, 580));
        

        Farmacia f = new Farmacia("W", medis, clien, trab);
        
    
    }
}
