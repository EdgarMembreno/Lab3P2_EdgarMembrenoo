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
public class Restaurantes {
    private String nombre;

    public Restaurantes() {
    }

    public Restaurantes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "nombre=" + nombre + '}';
    }
    
    
}
