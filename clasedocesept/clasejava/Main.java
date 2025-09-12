package clasedocesept.clasejava;

public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular(16, "Snapdragon", 1280, 3, 4);
        cel.mostrar();

        Laptop laptop = new Laptop(32, "Ryzen", 2560, "Mecanico", "Disponible", "GTX 1650");
        laptop.mostrar();
    }
}
