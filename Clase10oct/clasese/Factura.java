package clasese;

import java.util.ArrayList;

public class Factura {
    private String razonSocial;
    private boolean sePago;
    private ArrayList<Pedido> pedidos;

    public Factura(String razon, boolean sePago, ArrayList<Pedido> pedidos){
        this.razonSocial = razon;
        this.sePago = sePago;
        this.pedidos = pedidos;
    }

    public boolean getSePago(){
        return this.sePago;
    }
}
