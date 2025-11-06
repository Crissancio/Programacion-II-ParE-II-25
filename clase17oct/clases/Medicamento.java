package clases;

public class Medicamento {
    public String nombre, tipo;
    public int añoVencimiento, stock;

    public Medicamento(String nombre, String tipo, int añoVencimiento, int stock){
        this.nombre = nombre;
        this.tipo = tipo;
        this.añoVencimiento = añoVencimiento;
        this.stock = stock;
    }

    public String toString(){
        return "Medicamento: "+ nombre + ", Tipo: " + tipo + ", Año de Vencimiento: " + añoVencimiento + ", Stock: " + stock;
    }
}
