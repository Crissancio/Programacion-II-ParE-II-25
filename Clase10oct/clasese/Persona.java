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

    public int contarFacturasSinPagar(){
        int cont = 0;
        for (Factura f: this.facturas){
            if(f.getSePago() == false){
                cont ++;
            }
        }
        return cont;
    }

    public void mostrarTotalDePagoFacturas(){
        float total = 0;
        System.out.println("NOMBRE: "+this.nombre);
        for(Factura f : this.facturas){
            if( ! f.getSePago()){
                System.out.println("\t"+f.getRazonSocial()+": Total a Pagar "+f.conseguirTotal());
                total = total + f.conseguirTotal();
            }
        }

        System.out.println("\t\tTOTAL A PAGAR: "+total);



    }
}
