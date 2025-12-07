/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

/**
 *
 * @author Cristhian
 */
public class Producto {

    private int idProd;
    private String nombreProd, tipo;
    private float precio;

    public Producto(int idProd, String nombreProd, String tipo, float precio) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Producto() {
        this.idProd = -1;
        this.nombreProd = "";
        this.tipo = "";
        this.precio = -1;
    }

    public void alta() {
        String ruta = "archivosProducto/producto" + this.idProd + ".txt";

        try {
            FileWriter w = new FileWriter(ruta);
            BufferedWriter escritor = new BufferedWriter(w);

            escritor.append(this.idProd + "\n");
            escritor.append(this.nombreProd + "\n");
            escritor.append(this.tipo + "\n");
            escritor.append(this.precio + "");

            escritor.close();
            w.close();
            System.out.println("\t\t---ALTA DE PRODUCTO CORRECTA---");

        } catch (Exception e) {
            System.out.println("ERROR EN ALTA DE PRODUCTOS\n\n" + e);
        }
    }

    public void carga(String ruta) {
        try {
            FileReader r = new FileReader(ruta);
            BufferedReader lector = new BufferedReader(r);

            this.idProd = Integer.parseInt(lector.readLine());
            this.nombreProd = lector.readLine();
            this.tipo = lector.readLine();
            this.precio = Float.parseFloat(lector.readLine());

            lector.close();
            r.close();
            System.out.println("\t\t---CARGA DE PRODUCTO CORRECTA---");

        } catch (Exception e) {
            System.out.println("ERROR EN CARGA DE PRODUCTOS\n\n" + e);
        }
    }

    public void baja() {
        String ruta = "archivosProducto/producto" + this.idProd + ".txt";

        File archivo = new File(ruta);

        if (archivo.delete()) {
            System.out.println("SE HA ELIMINADO CORRECTAMENTE EL ARCHIVO " + archivo.getPath());
        } else {
            System.out.println("ERROR EN LA ELIMINACION DEL ARCHIVO " + archivo.getPath());
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd + ", nombreProd=" + nombreProd + ", tipo=" + tipo + ", precio=" + precio + '}';
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}
