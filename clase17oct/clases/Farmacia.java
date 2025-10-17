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

    public Farmacia(String nom, ArrayList<Cliente> clientes, ArrayList<Trabajador> trabajadores){
        this.nom = nom;
        this.clientes = clientes;
        this.trabajadores = trabajadores;
        this.medicamentos = new ArrayList<Medicamento>();
        this.medicamentos.add(new Medicamento("Paracetamol", "Pastilla", 2002, 100));
        this.medicamentos.add(new Medicamento("Ibuprofeno", "Pastilla", 2003, 150));
        this.medicamentos.add(new Medicamento("Amoxicilina", "Jarabe", 2004, 200));
    }

    public void agregarCliente(Cliente c){
        this.clientes.add(c);
    }


    public void mostrarMedicamentosJarabe(){
        for(Medicamento m: this.medicamentos){
            if(m.tipo.equals("Jarabe")){
                System.out.println(m.toString());
            }
        }
    }

    public void contarPastillas(){
        int cont = 0;

        for (Medicamento m: this.medicamentos){
            if(m.tipo.equals("Pastilla")){
                cont++;
            }
        }

        System.out.println("Cantidad de medicamentos tipo Pastilla: " + cont);
    }

    public int contarClientesEdadXY(int edadX, int edadY){
        int cont = 0;
        for (Cliente c: this.clientes){
            if(c.edad < edadY && c.edad > edadX){
                cont ++;
            }
        }

        System.out.println("Hay "+cont+ " clientes con edad entre "+ edadX+" y "+edadY);
        return cont;
    }



}
