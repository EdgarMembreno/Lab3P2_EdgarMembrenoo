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
public class Articulos extends Tienda {
    private String categoria;
    private int precio;

    public Articulos() {
        super();
    }

    public Articulos(String categoria, int precio, String nombre) {
        super(nombre);
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos{" + "categoria=" + categoria + ", precio=" + precio + '}';
    }
    
}
