/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author Cristhian
 */
public class Farmacia {
    public ArrayList<Medicamento> medicamentos;
    
    
    public Farmacia(){
        medicamentos = new ArrayList<Medicamento>();
    }
    
    public void addMedicamento(Medicamento m){
        this.medicamentos.add(m);
    }
    
    public void mostrar(){
        System.out.println("----FARMACIA----");
        for(Medicamento m : this.medicamentos){
            m.mostrar();
        }
    }
    
    public void guardar(String ruta){
        Gson gson = new Gson();
        
        try{
            FileWriter file = new FileWriter(ruta);
            gson.toJson(this, file);
            file.close();
            
            
        }catch(Exception e){
            System.out.println("ERROR RARO:\n---\n---\n---"+e);
        }
    }
    
    public void cargar(String ruta){
        Gson g = new Gson();
        try{
            FileReader archivo = new FileReader(ruta);
            Farmacia f1 = g.fromJson(archivo, Farmacia.class);
            this.medicamentos = f1.medicamentos;
            
            archivo.close();
        }catch(Exception e){
            System.out.println("ERROR RARO:\n---\n---\n---"+e);
        }
    }
}
