/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.File;

/**
 *
 * @author Cristhian
 */
public class Main {

    public static void main(String[] args) {

        File archivo = new File("archivo.json");
        //D:\Universidad\AUX-2-2025\Programacion-II-ParE-II-25\subcarpeta\txto.txt

        try {
            if (archivo.createNewFile()) {
                System.out.println("Se creo con normalidad");
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }

        //Medicamento m = new Medicamento(1, 30, "paracetamol", 1.20F);
        //m.guardar("archivo.json");
        //Medicamento m1 = new Medicamento();
        //m1.cargar("archivo.json");
        //m1.mostrar();
        //m.guardar("archivo.json");
        
        Farmacia f = new Farmacia();
        /*
        f.addMedicamento(new Medicamento(1, 32, "paracetamol", 1.20F));
        f.addMedicamento(new Medicamento(2, 15, "ibuprofeno", 3.50F));
        f.addMedicamento(new Medicamento(3, 40, "amoxicilina", 7.80F));
        f.addMedicamento(new Medicamento(4, 22, "aspirina", 2.10F));
        f.addMedicamento(new Medicamento(5, 10, "omeprazol", 5.60F));
        f.addMedicamento(new Medicamento(6, 35, "metamizol", 4.75F));
        f.addMedicamento(new Medicamento(7, 18, "loratadina", 1.90F));
        f.addMedicamento(new Medicamento(8, 50, "diclofenaco", 2.80F));
        f.addMedicamento(new Medicamento(9, 27, "azitromicina", 9.40F));
        f.addMedicamento(new Medicamento(10, 12, "prednisona", 6.25F));
        f.addMedicamento(new Medicamento(11, 45, "ranitidina", 3.10F));
        */
        f.cargar("archivo.json");
        f.mostrar();
        
        //f.guardar("archivo.json");

    }
}
