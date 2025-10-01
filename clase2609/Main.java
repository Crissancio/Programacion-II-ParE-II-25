package clase2609;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Bebida b1 = new Bebida("Coca Cola", 15.0, 3, true);
        Comida c1 = new Comida("Pizza", 250.0, 20);
        Toalla t1 = new Toalla("Toalla Playera", 500.0, 3, 2);
        Toalla t2 = new Toalla("Toalla Mano", 150.0, 7, 5);
        Comida c2 = new Comida("Hamburguesa", 180.0, 15);

        ArrayList<Producto> lista = new ArrayList<Producto>();
        lista.add(b1);
        lista.add(c1);
        //lista.add(t1);
        lista.add(t2);
        lista.add(c2);

        boolean comproBebi = false;
        boolean comproNoCom = false;

        for(Producto prod: lista){
            if(prod instanceof Bebida && !comproBebi){
                comproBebi = true;
                System.out.println("Sea comprado la bebida: " + prod.getNombre());
            }
            if(prod instanceof Toalla && !comproNoCom){
                comproNoCom = true;
                System.out.println("Sea comprado la toalla: " + prod.getNombre());
            }
        }


        for(Producto prod: lista){
            prod.mostrar();
        }

    }
}
