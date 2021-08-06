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
public class Acompañamientos extends Restaurantes{
    private String tipo;
    private int precioAdi;

    public Acompañamientos() {
        super();
    }

    public Acompañamientos(String tipo, int precioAdi, String nombre) {
        super(nombre);
        this.tipo = tipo;
        this.precioAdi = precioAdi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioAdi() {
        return precioAdi;
    }

    public void setPrecioAdi(int precioAdi) {
        this.precioAdi = precioAdi;
    }

    @Override
    public String toString() {
        return "Acompa\u00f1amientos{" + "tipo=" + tipo + ", precioAdi=" + precioAdi + '}';
    }
    
    
}
