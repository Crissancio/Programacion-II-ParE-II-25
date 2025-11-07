package veterinaria;

public class Main {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria("Santa Lucia");

        vet.agregarTrabajador(new Trabajador(1, "Jose", "Noche"));
        vet.agregarTrabajador(new Trabajador(2, "Maria", "Mañana"));

        vet.agregarCliente(new Dueño(1, "Raul", "16 de Julio", "Rene Dorado"));
        vet.agregarCliente(new Dueño(2, "Rosario", "Senkata", "Hiroshima"));
        vet.agregarCliente(new Dueño(3, "Tadeo", "Sopocachi", "6 de Agosto"));

        vet.agregarMascota(new Mascota(11, "Tarzan", "Mono", 2));
        vet.agregarMascota(new Mascota(22, "Federico", "Loro", 2));
        vet.agregarMascota(new Mascota(33, "Max", "Perro", 3));
        vet.agregarMascota(new Mascota(44, "Lulu", "Gato", 1));
        vet.agregarMascota(new Mascota(55, "Marshall", "Perro", 3));
        vet.agregarMascota(new Mascota(66, "Peñanieto", "Perro", 0));

        vet.mostrar();

        System.out.println("INSICO A)==========");
        vet.mostrarDueñoMascotaX("Peñanieto");
        System.out.println("INSICO B)==========");
        vet.mostrarDueñosYMascotas();
    }
}
