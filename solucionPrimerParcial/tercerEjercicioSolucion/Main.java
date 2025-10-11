package solucionPrimerParcial.tercerEjercicioSolucion;

public class Main {
    public static void main(String[] args) {

        Nutricionista n1 = new Nutricionista("Ana", 5, 15, 25, "Licenciatura en Nutricion", "Clinica Vida Saludable");

        Abogado a1 = new Abogado("Luis", 7, 10, 30, "Derecho Penal", "Bufete Legal");
        Abogado a2 = new Abogado("Carlos", 7, "Derecho Penal", "Bufete Justicia");

        Informatico i1 = new Informatico("Marta", 6, 12, "Java", "JalaSoft", true);
        Informatico i2 = new Informatico("Sofia", 7, 10, "Python", "Tech Solutions");

        System.out.println(a1.compararProfesionales(i2));

        Profesional pros[] = { n1, a1, a2, i1, i2 };

        int promedio = 0;
        for (Profesional p : pros) {
            promedio += p.getAñosEstudio();
        }

        System.out.println("El promedio de años de estudio es: " + promedio / pros.length);

    }
}
