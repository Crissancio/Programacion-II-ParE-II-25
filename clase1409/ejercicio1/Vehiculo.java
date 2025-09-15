package clase1409.ejercicio1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidad;
    }
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public void acelerar(){
        //this.velocidadActual = this.velocidadActual + 5;
        this.velocidadActual += 5;
    }

    public void frenar(){
        //this.velocidadActual = this.velocidadActual - 2;
        this.velocidadActual -= 2;
        if(this.velocidadActual < 0){
            this.velocidadActual = 0;
        }
    }

    public void mostrar(){
        System.out.println("MARCA: "+this.marca);
        System.out.println("MODELO: "+this.modelo);
        System.out.println("VELOCIDAD ACTUAL: "+ this.velocidadActual);
    }

    public int getVelocidadActual(){
        return this.velocidadActual;
    }

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Dodge", "Hellcat");
        Vehiculo v2 = new Vehiculo("Chevrolet", "Camaro", 3);


        v1.mostrar();
        System.out.println();
        v2.mostrar();

        v1.acelerar();
        v2.acelerar();
        
        v1.frenar();
        v1.frenar();
        v1.frenar();
        v2.frenar();

        System.out.println("\n\nDESPUES DE ACELERAR");
        v1.mostrar();
        System.out.println();
        v2.mostrar();
    }
}
