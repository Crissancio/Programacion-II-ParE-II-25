package clasese;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Pedido> pe1 = new ArrayList<Pedido>();
        pe1.add(new Pedido("hambuguesa", 4, 5.20F));
        pe1.add(new Pedido("pizza", 2, 3F));
        
        ArrayList<Pedido> pe2 = new ArrayList<Pedido>();
        pe2.add(new Pedido("Piquemacho", 2, 10F));
        pe2.add(new Pedido("Charquecan", 3, 15F));

        ArrayList<Pedido> pe3 = new ArrayList<Pedido>();
        pe3.add(new Pedido("Salchipapa", 1, 4.50F));
        pe3.add(new Pedido("Empanada", 4, 2.00F));
        pe3.add(new Pedido("Tacos", 2, 6.75F));

        ArrayList<Pedido> pe4 = new ArrayList<Pedido>();
        pe4.add(new Pedido("Sushi", 3, 12.00F));
        pe4.add(new Pedido("Lasaña", 1, 8.90F));
        pe4.add(new Pedido("Pollo frito", 5, 3.20F));
        pe4.add(new Pedido("Arepas", 2, 4.00F));
        pe4.add(new Pedido("Ceviche", 1, 10.50F));

        ArrayList<Pedido> pe5 = new ArrayList<Pedido>();
        pe5.add(new Pedido("Pan con chorizo", 2, 3.80F));
        pe5.add(new Pedido("Tamales", 3, 5.50F));

        /*-----FACTURAS-----*/
        ArrayList<Factura> f1 = new ArrayList<Factura>();
        f1.add(new Factura("1325742",true, pe1));
        f1.add(new Factura("1325742", false, pe2));

        ArrayList<Factura> f2 = new ArrayList<Factura>();
        f2.add(new Factura("1325745", true, pe2));
        f2.add(new Factura("1325746", false, pe5));
        f2.add(new Factura("1325747", true, pe1));

        ArrayList<Factura> f3 = new ArrayList<Factura>();
        f3.add(new Factura("1325748", true, pe4));   
        
        Persona p1 = new Persona("Juan", "Av. 6 de Agosto", f1);
        Persona p2 = new Persona("Raul", "Av. Litoral", f2);
        Persona p3 = new Persona("Tadeo", "Senkata", f3);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);


        ejercicio1(personas);



    
    }

    public static void ejercicio1(ArrayList<Persona> personas){
        int cont = 0;
        for(Persona p: personas){
            if(p.tieneFacturasSinPagar()){
                cont ++;
            }
        }

        System.out.println("HAY "+cont+" personas con facturas Sin Pagar");
    }
}
