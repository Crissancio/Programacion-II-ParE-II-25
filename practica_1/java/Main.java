package practica_1.java;

public class Main {
    public static void main(String[] args) {
        String ingrePizza[] = {"masa", "peperoni", "carne molida","queso", "salsa de tomate", null, null, null};

        Comida pizza = new Comida("Pizza Carnivora", 45.50F, ingrePizza, "Pizza carnivora de tamaño mediano");

        System.out.println(pizza);
        for(int i = 0; i < pizza.ingredientes.length;i++){
            if(pizza.ingredientes[i]!=null){
                System.out.print(pizza.ingredientes[i]+" ");
            }
        }
        System.out.println("");

        pizza.vender();
        if(pizza.cambiarPrecio(10)){
            System.out.println("Se a cambiado el Precio de la pizza");
        }
        System.out.println(pizza);

        String nuevoIngres[] = {"mortadela", "peperoni", "carne molida", "masa", "queso", "salsa de tomate", null, null};
        pizza.cambiarIngredientes(nuevoIngres);
        System.out.println("\n"+pizza);
        System.out.println(pizza);
        for(int i = 0; i < pizza.ingredientes.length;i++){
            if(pizza.ingredientes[i]!=null){
                System.out.print(pizza.ingredientes[i]+" ");
            }
        }
        System.out.println("");

        pizza.agregarIngrediente("oregano");
        System.out.println(pizza);
        for(int i = 0; i < pizza.ingredientes.length;i++){
            if(pizza.ingredientes[i]!=null){
                System.out.print(pizza.ingredientes[i]+" ");
            }
        }
        System.out.println("");

    }
}
