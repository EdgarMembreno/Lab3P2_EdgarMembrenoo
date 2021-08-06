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
public class tiendas extends Tienda {
    private String ubicacion;
    private int empleados;
    private int tiempoEspera;
    private String articulos;

    public tiendas() {
        super();
    }

    public tiendas(String ubicacion, int empleados, int tiempoEspera, String articulos, String nombre) {
        super(nombre);
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.tiempoEspera = tiempoEspera;
        this.articulos = articulos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public String getArticulos() {
        return articulos;
    }

    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "tiendas{" + "ubicacion=" + ubicacion + ", empleados=" + empleados + ", tiempoEspera=" + tiempoEspera + ", articulos=" + articulos + '}';
    }
    
}
