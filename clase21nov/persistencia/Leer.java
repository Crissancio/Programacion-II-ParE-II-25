package persistencia;

import java.io.*;

public class Leer {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            Persona p = (Persona) ois.readObject();
            System.out.println("Objeto leído");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
