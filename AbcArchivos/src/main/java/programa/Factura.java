/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author Cristhian
 */
public class Factura {
    private int nroFac;
    private String razonSocial;
    private int nit, idProd, cantidad;

    public Factura(int nroFac, String razonSocial, int nit, int idProd, int cantidad) {
        this.nroFac = nroFac;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.idProd = idProd;
        this.cantidad = cantidad;
    }
    
    public Factura() {
        this.nroFac = -1;
        this.razonSocial = "";
        this.nit = -1;
        this.idProd = -1;
        this.cantidad = -1;
    }
    
    //Alta
    
    public void alta(){
        String ruta = "archivosFacturas/factura"+nroFac+".json";
        Gson gson = new Gson();
        
        try {
            FileWriter w = new FileWriter(ruta);
            gson.toJson(this, w);
            w.close();
            System.out.println("\t\t---ALTA DE FACTURA CORRECTO---");
        } catch (Exception e) {
            System.out.println("ERROR EN ALTA FACTURA:\n\n"+e);
        }
    }
    
    public void cargar(String ruta){
        Gson gson = new Gson();
        try {
            FileReader r = new FileReader(ruta);
            Factura f = gson.fromJson(r, Factura.class);
            this.nroFac = f.getNroFac();
            this.cantidad = f.getCantidad();
            this.idProd = f.getIdProd();
            this.nit = f.getNit();
            this.razonSocial = f.getRazonSocial();
            r.close();
            
            System.out.println("\t\t---CARGA DE FACTURA CORRECTO---");
        } catch (Exception e) {
            System.out.println("ERROR EN CARGA FACTURA:\n\n"+e);
        }
    }
    
    public void baja(){
        String ruta = "archivosFacturas/factura"+nroFac+".json";
        
        File archivo = new File(ruta);
        if(archivo.delete()){
            System.out.println("SE ELIMINO CORRECTAMENTE EL ARCHIVO "+archivo.getPath());
        }else{
            System.out.println("ERROR EN ELIMINACION DEL ARCHIVO "+archivo.getPath());
        }
    }

    public int getNroFac() {
        return nroFac;
    }

    public void setNroFac(int nroFac) {
        this.nroFac = nroFac;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Factura{" + "nroFac=" + nroFac + ", razonSocial=" + razonSocial + ", nit=" + nit + ", idProd=" + idProd + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
