/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Cristhian
 */
public class Tienda {
    private String productos;
    private String facturas;

    public Tienda(String productos, String facturas) {
        this.productos = productos;
        this.facturas = facturas;
    }
    
    public void agregarFactura(Factura f){
        f.alta();
    }
    
    public void agregarProducto(Producto p){
        p.alta();
    }
    
    public void mostrarFacturas(){
        ArrayList<Factura> lista = new ArrayList<Factura>();
        
        File carpeta = new File(this.facturas);
        File[] archivos = carpeta.listFiles();
        
        for(File f: archivos){
            Factura nuevo = new Factura();
            nuevo.cargar(f.getPath());
            lista.add(nuevo);
        }
        
        for(Factura f: lista){
            System.out.println(f);
        }
        
    }
    
    public void mostrarProductos(){
        ArrayList<Producto> lista = this.cargarProductos();
        
        for(Producto p: lista){
            System.out.println(p);
        }
    }
    
    public ArrayList<Producto> cargarProductos(){
        ArrayList<Producto> lista = new ArrayList<Producto>();
        
        File carpeta = new File(this.productos);
        File[] archivos = carpeta.listFiles();
        
        for(File f: archivos){
            Producto nuevo = new Producto();
            nuevo.carga(f.getPath());
            lista.add(nuevo);
        }
        return lista;
    }
    
    public ArrayList<Factura> cargarFacturas(){
        ArrayList<Factura> lista = new ArrayList<Factura>();
        
        File carpeta = new File(this.facturas);
        File[] archivos = carpeta.listFiles();
        
        for(File f: archivos){
            Factura nuevo = new Factura();
            nuevo.cargar(f.getPath());
            lista.add(nuevo);
        }
        return  lista;
    }
    
    // Borrar el producto de nombreX y a todas las facturas que la involucren
    
    public void ejercicio1(String nombreX){
        ArrayList<Producto> prods = this.cargarProductos();
        int idBuscado = -1;
        
        for(Producto p: prods){
            if(p.getNombreProd().equals(nombreX)){
                idBuscado = p.getIdProd();
                p.baja();
            }
        }
        
        if(idBuscado != -1){
            ArrayList<Factura> facs = this.cargarFacturas();
            
            for(Factura f: facs){
                if(f.getIdProd() == idBuscado){
                    f.baja();
                }
            }
        }else{
            System.out.println("--PRODUCTO NO ENCONTRADO ("+nombreX+")");
        }
    }
    
    // La inflacion ha hecho que las bebidas suban eunn 10 porciento su 
    //precio, actualiza los poroductos de la tienda
    public void ejercicio2(){
        ArrayList<Producto> lista = this.cargarProductos();
        for(Producto p: lista){
            if(p.getTipo().equals("Bebida")){
                float nuevoPrecio = p.getPrecio() + (p.getPrecio()*10/100);
                p.setPrecio(nuevoPrecio);
                p.alta();
            }
        }
    }

}
