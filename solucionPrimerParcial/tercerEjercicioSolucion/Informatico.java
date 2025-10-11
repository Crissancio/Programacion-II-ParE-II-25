package solucionPrimerParcial.tercerEjercicioSolucion;

public class Informatico extends Profesional{
    private String lenguajeDominante;
    private String empresaTrabajo;
    private boolean trabajaRemotamente;

    public Informatico(String nombre, int añosEstudio, int añosExperiencia, String lenguajeDominante, String empresaTrabajo, boolean trabajaRemotamente) {
        super(nombre, añosEstudio, añosExperiencia);
        this.lenguajeDominante = lenguajeDominante;
        this.empresaTrabajo = empresaTrabajo;
        this.trabajaRemotamente = trabajaRemotamente;
    }

    public Informatico(String nombre, int añosEstudio, int añosExperiencia, String lenguajeDominante, String empresaTrabajo) {
        super(nombre, añosEstudio, añosExperiencia);
        this.lenguajeDominante = lenguajeDominante;
        this.empresaTrabajo = empresaTrabajo;
        this.trabajaRemotamente = false;
    }
}
