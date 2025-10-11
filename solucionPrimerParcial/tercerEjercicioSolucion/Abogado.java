package solucionPrimerParcial.tercerEjercicioSolucion;

public class Abogado extends Profesional {
    private int casosGanados;
    private String especialidad;
    private String bufeteTrabajo;

    public Abogado(String nombre, int añosEstudio, int añosExperiencia, int casosGanados, String especialidad, String bufeteTrabajo) {
        super(nombre, añosEstudio, añosExperiencia);
        this.casosGanados = casosGanados;
        this.especialidad = especialidad;
        this.bufeteTrabajo = bufeteTrabajo;
    }

    public Abogado(String nombre, int añosEstudio, String especialidad, String bufeteTrabajo) {
        super(nombre, añosEstudio, 0);
        this.especialidad = especialidad;
        this.bufeteTrabajo = bufeteTrabajo;
        this.casosGanados = 0;
    }
    
}
