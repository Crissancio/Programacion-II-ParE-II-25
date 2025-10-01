package clase2609mapas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Politico p1 = new Politico("Argentina", 2780000, 4);
        Geografico g1 = new Geografico("Bolivia", 324000, 12000);
        Etnico e1 = new Etnico("Peru", 1280000, 3, new String[]{"Quechua", "Aymara", "Ashaninka"});
        Etnico e2 = new Etnico("Venezuela", 912000, 2, new String[]{"Wayuu", "Warao"});
        Etnico e3 = new Etnico("Bolivia", 324000, 4, new String[]{"Quechua", "Aymara", "Guarani", "Chiquitano"});

        ArrayList <Mapa> lista = new ArrayList<Mapa>();
        lista.add(p1);
        lista.add(g1);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);

        int n = lista.size();
        String etniaX = "Aymara";
        for (int i = 0; i < n; i++) {
            //lista[i]
            if(lista.get(i) instanceof Etnico){
                Etnico e = (Etnico) lista.get(i);

                for(int j = 0; j< e.nroEtnias; j++){
                    if(e.etnias[j].equals(etniaX)){
                        e.mostrar();
                        System.out.println("--------------");
                        break;
                    }
                }
            }
            
        }}
    }
}
