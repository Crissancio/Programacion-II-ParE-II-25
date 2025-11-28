package solucionSegundaParcial.javaSolucion;

public class Main {
    public static void main(String[] args) {
        MiTeleferico miTeleferico = new MiTeleferico();

        miTeleferico.agregarPersonaFila(new Persona("Carlos", 22, 70.2F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("María", 19, 58.7F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Andrés", 25, 82.1F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Lucía", 30, 64.9F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Fernando", 28, 76.3F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Valeria", 21, 55.4F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Gabriel", 26, 68.0F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Daniela", 24, 61.2F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Héctor", 27, 79.6F), "Rojo");
        miTeleferico.agregarPersonaFila(new Persona("Paola", 23, 59.8F), "Rojo");

        miTeleferico.agregarPersonaFila(new Persona("Jorge", 35, 81.5F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Sofía", 20, 54.3F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Mauricio", 29, 77.9F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Cecilia", 32, 68.4F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Benjamín", 18, 62.7F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Natalia", 28, 73.1F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Óscar", 31, 84.0F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Claudia", 26, 60.9F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Iván", 24, 69.8F), "Amarillo");
        miTeleferico.agregarPersonaFila(new Persona("Elena", 22, 56.6F), "Amarillo");

        miTeleferico.agregarPersonaFila(new Persona("Ricardo", 33, 79.2F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Patricia", 27, 63.5F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Alberto", 23, 72.8F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Diana", 29, 58.9F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Hugo", 21, 66.4F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Rebeca", 30, 74.6F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Samuel", 25, 83.3F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Jimena", 24, 57.1F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Fabián", 28, 71.9F), "Verde");
        miTeleferico.agregarPersonaFila(new Persona("Liliana", 19, 53.8F), "Verde");

        miTeleferico.agregarCabina("Rojo");
        miTeleferico.agregarCabina("Rojo");
        miTeleferico.agregarCabina("Rojo");
        miTeleferico.agregarCabina("Rojo");
        miTeleferico.agregarCabina("Rojo");

        miTeleferico.agregarCabina("Amarillo");
        miTeleferico.agregarCabina("Amarillo");
        miTeleferico.agregarCabina("Amarillo");
        miTeleferico.agregarCabina("Amarillo");

        miTeleferico.agregarCabina("Verde");
        miTeleferico.agregarCabina("Verde");
        miTeleferico.agregarCabina("Verde");
        miTeleferico.agregarCabina("Verde");
        miTeleferico.agregarCabina("Verde");
        miTeleferico.agregarCabina("Verde");

        miTeleferico.mostrar();

        System.out.println("\t\t----->INCISO A<-----");
        miTeleferico.incisoA("Rojo", 1);
        miTeleferico.incisoA("Rojo", 2);
        miTeleferico.incisoA("Rojo", 1);
        miTeleferico.incisoA("Rojo", 3);
        miTeleferico.incisoA("Rojo", 4);

        miTeleferico.incisoA("Amarillo", 2);
        miTeleferico.incisoA("Amarillo", 2);
        miTeleferico.incisoA("Amarillo", 2);
        miTeleferico.incisoA("Amarillo", 3);
        miTeleferico.incisoA("Amarillo", 1);
        miTeleferico.incisoA("Amarillo", 1);

        miTeleferico.incisoA("Verde", 2);
        miTeleferico.incisoA("Verde", 2);
        miTeleferico.incisoA("Verde", 1);
        miTeleferico.incisoA("Verde", 1);
        miTeleferico.incisoA("Verde", 3);
        miTeleferico.incisoA("Verde", 3);
        miTeleferico.incisoA("Verde", 5);

        miTeleferico.mostrar();

        System.out.println("\t\t----->INCISO B<-----");
        miTeleferico.incisoB();

        System.out.println("\t\t----->INCISO C<-----");
        miTeleferico.incisoC();

        System.out.println("\t\t----->INCISO D<-----");
        miTeleferico.incisoD();
    }
}
