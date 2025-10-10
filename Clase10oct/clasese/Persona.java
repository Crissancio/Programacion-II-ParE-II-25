package clasese;

import java.util.ArrayList;

public class Persona {
    private String nombre, direccion;
    private ArrayList<Factura> facturas;

    public Persona(String nombre, String dir, ArrayList<Factura> facturas){
            this.nombre = nombre;
            this.direccion = direccion;
            this.facturas = facturas;
    }

    public boolean tieneFacturasSinPagar(){
        for(Factura f: this.facturas){
            if(f.getSePago() == false){
                return true;
            }
        }
        return false;
    }
}
