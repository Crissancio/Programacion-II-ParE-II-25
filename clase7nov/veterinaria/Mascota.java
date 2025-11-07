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

    public void mostrar() {
        System.out.println("\t" + nomMas + " - " + this.tipo + " - " + idDue);
    }

    public String getNomMas() {
        return this.nomMas;
    }

    public int getIdDue() {
        return this.idDue;
    }

    public int getIdMas() {
        return this.idMas;
    }

    public String getTipo() {
        return this.tipo;
    }
}
