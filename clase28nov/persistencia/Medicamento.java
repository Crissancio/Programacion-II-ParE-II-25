/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
/**
 *
 * @author Cristhian
 */
public class Medicamento {

    public int id, stock;
    public String nom;
    public float precio;

    public Medicamento(int id, int stock, String nom, float precio) {
        this.id = id;
        this.stock = stock;
        this.nom = nom;
        this.precio = precio;
    }

    public Medicamento() {
        id = 0;
        nom = "";
        stock = 0;
        precio = 0;
    }
    
    public void guardar(String ruta){
        Gson g = new Gson();
        
        try{
            FileWriter f = new FileWriter(ruta);
            
            g.toJson(this, f);
            
            f.close();
        }catch(Exception e){
            System.out.println("ERROR RARO "+e.getMessage());
        }
    }

    public void mostrar(){
        System.out.println("["+ id+" " +nom+" "+ stock+" "+precio+"]");
    }
    
    public void cargar(String ruta){
        Gson gson = new Gson();
        
        try{
            FileReader file = new FileReader(ruta);
            
            Medicamento m = gson.fromJson(file, Medicamento.class);
            this.id = m.id;
            this.nom = m.nom;
            this.precio = m.precio;
            this.stock = m.stock;
            
            file.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
