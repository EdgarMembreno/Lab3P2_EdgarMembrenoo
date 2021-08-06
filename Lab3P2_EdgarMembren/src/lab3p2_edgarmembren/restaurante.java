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
public class restaurante extends Restaurantes{
    private String ubicacion;
    private int rtn;
    private String slogan;
    private String comidas;

    public restaurante() {
        super();
    }

    public restaurante(String ubicacion, int rtn, String slogan, String comidas, String nombre) {
        super(nombre);
        this.ubicacion = ubicacion;
        this.rtn = rtn;
        this.slogan = slogan;
        this.comidas = comidas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getRtn() {
        return rtn;
    }

    public void setRtn(int rtn) {
        this.rtn = rtn;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getComidas() {
        return comidas;
    }

    public void setComidas(String comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "restaurante{" + "ubicacion=" + ubicacion + ", rtn=" + rtn + ", slogan=" + slogan + ", comidas=" + comidas + '}';
    }
    

   
    
    
}
