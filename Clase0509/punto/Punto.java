//package Clase0509.punto;

public class Punto {
    public float x;
    public float y;

    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Punto sumar(Punto otro){
        float nuevoX = this.x + otro.x;
        float nuevoY = this.y + otro.y;
        Punto nuevoPunto = new Punto(nuevoX, nuevoY);
        return nuevoPunto;
    }

    public String toString(){
        return "X: "+ this.x + "\nY: "+ this.y;
    }


    public static void main(String[] args){
        Punto a = new Punto(3,7);
        Punto b = new Punto(1,2);

        Punto c = a.sumar(b);
        System.out.println(c);
    }

}
