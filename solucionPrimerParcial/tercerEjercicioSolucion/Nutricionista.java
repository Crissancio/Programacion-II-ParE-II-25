package solucionPrimerParcial.tercerEjercicioSolucion;

public class Nutricionista extends Profesional {
    
    private int pacientesAtendidos;
    private String especialidad;
    private String clinicaTrabajo;

    public Nutricionista(String nombre, int añosEstudio, int añosExperiencia, int pacientesAtendidos, String especialidad, String clinicaTrabajo) {
        super(nombre, añosEstudio, añosExperiencia);
        this.pacientesAtendidos = pacientesAtendidos;
        this.especialidad = especialidad;
        this.clinicaTrabajo = clinicaTrabajo;
    }
}
