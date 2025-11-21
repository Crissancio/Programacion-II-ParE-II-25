package persistencia;

import java.io.*;

public class Guardar {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 20);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            oos.writeObject(p);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
