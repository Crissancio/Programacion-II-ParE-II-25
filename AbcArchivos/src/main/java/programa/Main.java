/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Cristhian
 */
public class Main {
    public static void main(String[] args) {
    // Alta crear   
    // Baja eliminar
    // Cambio actualizar
    //gson, dat, txt
    //carpeta -> varios archivos
    //un solo archivo con toda la infroamacion dentro
    /*
        File carpeta = new File("archivosFacturas");
        File[] archivos = carpeta.listFiles();
        
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        
        for(File f: archivos){
            Factura nuevo = new Factura();
            nuevo.cargar(f.getPath());
            
            facturas.add(nuevo);
        }
        
        for(Factura f: facturas){
            System.out.println(f);
        }*/

        Tienda tienda = new Tienda("archivosProducto","archivosFacturas" );
        // Borrar el producto de nombreX y a todas las facturas que la involucren
        
        System.out.println("-------ANTES------");
        tienda.mostrarFacturas();
        tienda.mostrarProductos();

        tienda.ejercicio2();
        //tienda.ejercicio1("Esponja");
        
        System.out.println("\n\n-------DESPUES------");
        tienda.mostrarFacturas();
        tienda.mostrarProductos();
        
        // La inflacion ha hecho que las gaseosas suban eunn 10 porciento su 
        //precio, actualiza los poroductos de la tienda
        
        

    }
}
