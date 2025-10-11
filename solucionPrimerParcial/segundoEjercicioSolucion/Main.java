package solucionPrimerParcial.segundoEjercicioSolucion;

public class Main {
    public static void main(String[] args) {
        Parqueo parqueo = new Parqueo(5, 3, new String[][]{
                {"123ABC", "Luis Jairo"},
                {"456DEF", "Ana Maria"},
                {"789GHI", "Carlos Perez"},
                {"321JKL", "Marta Gomez"},
                {"654MNO", "Jose Ruiz"},{"",""},{"",""},{"",""}}, new int[][]{{2, 5}, {9, 12}, {10, 11}, {10, 13}, {10, 11},{0,0},{0,0},{0,0}});

        Parqueo nuevoAuto = new Parqueo(new String[][]{{"987XYZ", "Sofia Lopez"}}, new int[][]{{11, 14}});

        parqueo.mostrar();
        System.out.println("\nAgregando un nuevo auto al parqueo...\n");
        parqueo.suma(nuevoAuto);
        parqueo.mostrar();
        

        parqueo.hallar("321JKL");
        parqueo.hallar(1);
    
    }
}
