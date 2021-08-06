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
public class comidas extends Restaurantes{
    private int id;
    private int precio;
    private int cant_acompa;
    private String acompaña;

    public comidas() {
        super();
    }

    public comidas(int id, int precio, int cant_acompa, String acompaña, String nombre) {
        super(nombre);
        this.id = id;
        this.precio = precio;
        this.cant_acompa = cant_acompa;
        this.acompaña = acompaña;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCant_acompa() {
        return cant_acompa;
    }

    public void setCant_acompa(int cant_acompa) {
        this.cant_acompa = cant_acompa;
    }

    public String getAcompaña() {
        return acompaña;
    }

    public void setAcompaña(String acompaña) {
        this.acompaña = acompaña;
    }

    @Override
    public String toString() {
        return "comidas{" + "id=" + id + ", precio=" + precio + ", cant_acompa=" + cant_acompa + ", acompa\u00f1a=" + acompaña + '}';
    }
    
    
}
