package solucionPrimerParcial.tercerEjercicioSolucion;

public abstract class Profesional {
    public String nombre;
    protected  int añosEstudio;
    protected  int añosExperiencia;


    public Profesional(String nombre, int añosEstudio, int añosExperiencia) {
        this.nombre = nombre;
        this.añosEstudio = añosEstudio;
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosEstudio() {
        return añosEstudio;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public boolean compararProfesionales(Profesional otroProfesional) {
        return this.añosEstudio == otroProfesional.getAñosEstudio() && this.añosExperiencia == otroProfesional.getAñosExperiencia();
    }

}
