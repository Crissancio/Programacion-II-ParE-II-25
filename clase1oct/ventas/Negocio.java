package ventas;

public abstract class Negocio{
    public String nombre;
    public float ganacias;
    public String ubicacion;
    public String propietario;

    public Negocio(String nom, float gan, String ubi, String prop){
        this.nombre = nom;
        this.ganacias = gan;
        this.ubicacion = ubi;
        this.propietario = prop;
    }
}