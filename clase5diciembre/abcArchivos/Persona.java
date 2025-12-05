package clase5diciembre.abcArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Persona {
    private String nombre;
    private int edad, ci;

    public Persona(String nombre, int edad, int ci) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
    }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.ci = 0;
    }

    public void guardar() {
        String ruta = "persona" + ci + ".txt";

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("archivosJava/" + ruta));

            escritor.append(ci + "\n");
            escritor.append(nombre + "\n");
            escritor.append(edad + "");

            escritor.close();

        } catch (Exception e) {
            System.out.println("ERROR GUARDADO-----\n" + e);
        }
    }

    public void cargar(String ruta) {
        try {
            FileReader r = new FileReader(ruta);
            BufferedReader lector = new BufferedReader(r);

            String linea = lector.readLine();
            this.ci = Integer.parseInt(linea);
            this.nombre = lector.readLine();
            this.edad = Integer.parseInt(lector.readLine());

            lector.close();
            r.close();

        } catch (Exception e) {
            System.out.println("ERROR CARGA-----\n" + e);
        }
    }

    public void cargar(File archivo) {
        try {
            FileReader r = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(r);

            String linea = lector.readLine();
            this.ci = Integer.parseInt(linea);
            this.nombre = lector.readLine();
            this.edad = Integer.parseInt(lector.readLine());

            lector.close();
            r.close();

        } catch (Exception e) {
            System.out.println("ERROR CARGA-----\n" + e);
        }
    }

    public void mostrar() {
        System.out.println("[" + ci + " " + nombre + " " + edad + "]");
    }
}
