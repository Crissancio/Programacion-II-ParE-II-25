package clases;


public class Farmacia {

    private String nombre;
    private int nMedicamentos;
    private String medis[][];
    private int disponible[];
    private String trabajadores[][];

    public Farmacia(String nombre, int cant, String matmed[][], int dispo[], String trab[][]) {
        this.nombre = nombre;
        this.nMedicamentos = cant;
        this.medis = matmed;
        this.disponible = dispo;
        this.trabajadores = trab;
    }

    public Farmacia(String nombre, int cant, String trab[][]) {
        this.nombre = nombre;
        this.nMedicamentos = cant;
        this.medis = new String[10][2];
        this.disponible = new int[10];
        this.trabajadores = trab;
    }

    public Farmacia(String nombre, int cant, String matmed[][], int dispo[]) {
        this.nombre = nombre;
        this.nMedicamentos = cant;
        this.medis = matmed;
        this.disponible = dispo;
        this.trabajadores = new String[10][2];
    }

    public Farmacia(String medi[][]) {
        this.nombre = "";
        this.nMedicamentos = 0;
        this.medis = medi;
        this.disponible = new int[1];
        this.trabajadores = new String[2][2];
    }

    public Farmacia(int cant) {
        this.nombre = "";
        this.nMedicamentos = cant;
        this.medis = new String[1][1];
        this.disponible = new int[1];
        this.trabajadores = new String[2][2];
    }

    public String[][] getMedis() {
        return this.medis;
    }

    public int getNMedicamentos() {
        return this.nMedicamentos;
    }

    public boolean suma(Farmacia otro) {
        String mediBuscado[][] = otro.getMedis();
        String nombreX = mediBuscado[0][0];
        String tipoX = mediBuscado[0][1];

        for (int i = 0; i < this.nMedicamentos; i++) {
            if (nombreX.equals(this.medis[i][0]) && tipoX.equals(this.medis[i][1])) {
                return true;
            }
        }
        return false;
    }

    public int resta(Farmacia otro) {
        int incremento = otro.getNMedicamentos();

        for (int i = 0; i < this.nMedicamentos; i++) {
            if (this.disponible[i] < 10) {
                this.disponible[i] = this.disponible[i] + incremento;
            }
        }
        return 0;
    }

    public void mostrar() {
        System.out.println("-.-.-.-.-.-" + this.nombre);
        System.out.println("Cantidad de Medicamentos: " + this.nMedicamentos);
        for (int i = 0; i < this.nMedicamentos; i++) {
            System.out.println(this.medis[i][0] + " " + this.medis[i][1] + " " + this.disponible[i]);
        }

        System.out.println(".-.-.-.-TRABAJADORES-.-.-.-.");
        for (int i = 0; i < this.nMedicamentos; i++) {
            System.out.println(this.trabajadores[i][0] + " " + this.trabajadores[i][1]);
        }
    }

    public int[] getDisponible() {
        return this.disponible;
    }

    public void setMedis(String medis[][]) {
        this.medis = medis;
    }

    public void setDisponible(int dispo[]) {
        this.disponible = dispo;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public void metodoSobrecargado() {
        String copia[][] = this.getMedis();
        int copiaDispo[] = this.getDisponible();
        String ordenado[][] = new String[this.nMedicamentos][2];
        int ordDipo[] = new int[this.nMedicamentos];
        int j = 0;
        int n = this.nMedicamentos;

        while (copia.length != 0) {
            n--;
            String masPequeño[] = {};
            int dispoMed = 0;
            int ascciPeque = 96;
            String porVer[][] = new String[n][2];
            int porVerDispo[] = new int[n];
            for (int k = 0; k < copia.length; k++) {
                if ((int) copia[k][0].charAt(0) > ascciPeque) {
                    masPequeño = new String[]{copia[k][0], copia[k][1]};
                    dispoMed = copiaDispo[k];
                    ascciPeque = (int) copia[k][0].charAt(0);
                }
            }
            int f = 0;
            for (int k = 0; k < copia.length; k++) {
                if (copia[k][0].equals(masPequeño[0])) {
                    ordenado[j] = masPequeño;
                    ordDipo[j] = dispoMed;
                    j++;
                } else {
                    porVer[f] = copia[k];
                    porVerDispo[f] = copiaDispo[k];
                    f++;
                }
            }
            copia = porVer;
            copiaDispo = porVerDispo;
        }

        this.setDisponible(ordDipo);
        this.setMedis(ordenado);
    }

    public void metodoSobrecargado(String nombreX){
        boolean seEncontro = false;
        for(int i = 0; i < this.trabajadores.length; i++){
            if(nombreX.equals(this.trabajadores[i][0])){
                System.out.println(" El trabajador "+nombreX+" esta en el turno de " + this.trabajadores[i][1]);
                seEncontro = true;
                break;
            }
        }
        if(! seEncontro){
            System.out.println("No se a encontrado el trabajor "+nombreX);
        }
    }

    public void metodoSobrecargado(Farmacia otro, String tipoX){
        int cantidad1 = 0;
        int cantidad2 = 0;
        for (int i = 0; i < this.nMedicamentos; i++){
            if(this.medis[i][1].equals(tipoX)){
                cantidad1 += this.disponible[i];
            }
        }

        for (int i = 0; i < otro.getNMedicamentos(); i++){
            if(otro.getMedis()[i][1].equals(tipoX)){
                cantidad2 += otro.getDisponible()[i];
            }
        }

        if(cantidad1 == cantidad2){
            System.out.println("AMBAS FARMACIAS TIENEN LA MISMCA CANTIDAD DE MEDICAMENTOS DE TIPO "+ tipoX);
        }else if(cantidad1 > cantidad2){
            System.out.println(this.nombre);
        }else{
            System.out.println(otro.getNombre());
        }
    }

    public static void main(String[] args) {

        String medis[][] = {
            {"ibuprofreno", "pastillas"},
            {"aracetamol", "pastillas"},
            {"diclofenaco", "pomada"}
        };
        int dispo[] = {
            6, 25, 4
        };

        String medis1[][] = {
            {"ibuprofreno", "pastillas"},
            {"paracetamol", "pastillas"},
            {"diclofenaco", "pomada"}
        };
        int dispo1[] = {
            66, 25, 4
        };

        Farmacia f1 = new Farmacia("farmacias Bolivia", 3, medis1, dispo1);
        String farmas[][] = {
            {"Jorge", "mañana"},
            {"Jose", "noche"},
            {"Raul", "tarde"}
        };
        Farmacia f2 = new Farmacia("Farmacia Virgen de Coapacabana", 0, farmas);

        Farmacia f3 = new Farmacia("Farmacia Chavez", 3, medis, dispo, farmas);
        String med[][] = {{"ibuprofreno", "jarabe"}};
        Farmacia f4 = new Farmacia(med);

        boolean seEncontro = f3.suma(f4);
        System.out.println(seEncontro);

        f3.mostrar();

        Farmacia f5 = new Farmacia(14);
        //f3.resta(f5);

        System.out.println("\n\nDESPUES\n\n");

        System.out.println("...................");
        f3.metodoSobrecargado();
        f3.mostrar();
        f3.metodoSobrecargado("POncio");
        f3.metodoSobrecargado(f1, "pastillas");
    }

}
