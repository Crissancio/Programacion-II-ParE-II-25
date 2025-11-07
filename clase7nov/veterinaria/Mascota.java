package veterinaria;

public class Mascota {
    private int idMas, idDue;
    private String nomMas, tipo;

    public Mascota(int id, String nom, String tipo, int due) {
        this.idMas = id;
        this.nomMas = nom;
        this.tipo = tipo;
        this.idDue = due;
    }
}
