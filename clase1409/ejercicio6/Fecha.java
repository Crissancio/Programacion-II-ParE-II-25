package clase1409.ejercicio6;

public class Fecha {
    private int dia, mes, anio;

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esAnioBisiesto(){
        if((this.anio % 4 == 0 && this.anio %100 != 0) || this.anio%400 == 0){
            return true;
        }else{
            return false;
        }
    }

    public void cambiarDiaSiguiente(){
        int diasFebrero = esAnioBisiesto()? 29:28;
        int diasPorMes[] = {
            31, diasFebrero, 31,30, 31, 30, 31, 31, 30, 31,30, 31
        };

        int nuevoDia = this.dia + 1;
        if(nuevoDia > diasPorMes[this.mes -1]){
            nuevoDia = 1;
            this.mes = this.mes + 1;
            if(this.mes == 13){
                this.mes = 1;
                this.anio = this.anio + 1;
            }
        }
        this.dia = nuevoDia;
    }

    public String toString(){
        return ""+this.dia+"/"+this.mes+"/"+this.anio;
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(31, 12, 2024);
        System.out.println(fecha);

        System.out.println(fecha.esAnioBisiesto());

        fecha.cambiarDiaSiguiente();

        System.out.println(fecha);
    }
}
