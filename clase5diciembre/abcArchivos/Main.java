package clase5diciembre.abcArchivos;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File carpeta = new File("archivosJava");

        File archivos[] = carpeta.listFiles();

        ArrayList<Persona> lista = new ArrayList<Persona>();

        for (File f : archivos) {
            Persona p = new Persona();
            // p.cargar(f.getPath());
            p.cargar(f);
            lista.add(p);
        }

        for (Persona p : lista) {
            p.mostrar();
        }
    }
}
