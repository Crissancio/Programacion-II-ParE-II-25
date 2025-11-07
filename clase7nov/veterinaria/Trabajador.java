package veterinaria;

public class Trabajador {
    private int idTrab;
    private String nomTra, turno;

    public Trabajador(int id, String nom, String turno) {
        this.idTrab = id;
        this.nomTra = nom;
        this.turno = turno;
    }

    public void mostrar() {
        System.out.println("\t" + nomTra + " - " + turno);
    }
}
