/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_edgarmembren;

/**
 *
 * @author edgarmembreno
 */
public class Clientes extends Personas{
    private String domicilio;
    private int cantPedidos;

    public Clientes() {
        super();
    }

    public Clientes(String domicilio, int cantPedidos, String nombre, String apellido, int id, String user, String contra) {
        super(nombre, apellido, id, user, contra);
        this.domicilio = domicilio;
        this.cantPedidos = cantPedidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCantPedidos() {
        return cantPedidos;
    }

    public void setCantPedidos(int cantPedidos) {
        this.cantPedidos = cantPedidos;
    }

    @Override
    public String toString() {
        return "Clientes{" + "domicilio=" + domicilio + ", cantPedidos=" + cantPedidos + '}';
    }
    
    
}
