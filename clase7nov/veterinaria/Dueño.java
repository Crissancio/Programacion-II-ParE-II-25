package veterinaria;

class Dueño {
    private int idDue;
    private String nomDue, zona, calle;

    public Dueño(int id, String nom, String zona, String calle) {
        this.idDue = id;
        this.nomDue = nom;
        this.zona = zona;
        this.calle = calle;
    }

    public void mostrar() {
        System.out.println("\t" + nomDue + " - " + this.calle + "/" + this.zona);
    }

    public int getIdDue() {
        return this.idDue;
    }

    public String getNomDue() {
        return this.nomDue;
    }
}