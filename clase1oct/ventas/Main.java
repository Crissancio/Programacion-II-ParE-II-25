package ventas;

public class Main {
    
    public static void main(String[] args) {
        TiendaTecnologica tienda1 = new TiendaTecnologica("Tienda Tecno 1", 2000, "Calatayud", "Raul");
        String productos1[][] = {
            {"RAM", "KIGSTON"},
            {"CPU", "INTEL"},
            {"SSD", "SAMSUNG"}
        };
        int dispo1[] = {50, 10, 8};
        TiendaTecnologica tienda2 = new TiendaTecnologica("Tienda Tecno 2", 3000, "Eloy Salmon", "Jose", 3, productos1 , dispo1);
    
        TiendaVegetales tienda3 = new TiendaVegetales("Tienda Campo", 3500, "Rodriguez", "Jaime");

        String nomVeg[] = {"Zanahoria", "Tomate", "Lechuga"};
        int precios[] = {4, 6, 2};
        float kilos[] = {25, 320, 54};

        String nomVeg1[] = {"Zanahoria", "Tomate", "Lechuga"};
        int precios1[] = {4, 6, 2};
        float kilos1[] = {21, 38, 64};

        TiendaVegetales tienda4 = new TiendaVegetales("Tienda Rancho", 4000, "Garita", "Lucia", 3, nomVeg, precios, kilos);
        TiendaVegetales tienda5 = new TiendaVegetales("Tienda Pollo Feliz", 4000, "Garita", "Lucia", 3, nomVeg1, precios1, kilos1);

        tienda2.suma(tienda1);

        tienda4.resta(tienda5);

        tienda2.metodoSobre();

        tienda4.metodoSobre();

        tienda2.metodoSobre("SSD");

        tienda4.metodoSobre("Tomate", 5);
        tienda4.metodoSobre();

        System.out.println(tienda4.MostrarCantidadDeKilosEnTotal());
        System.out.println(tienda2.verCantidadDeProductosDisponibles());
    }
}
