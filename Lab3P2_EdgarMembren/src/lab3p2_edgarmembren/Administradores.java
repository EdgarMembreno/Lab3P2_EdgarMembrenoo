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
public class Administradores extends Empleados{
    private int experienciaVentas;

    public Administradores() {
        super();
    }

    public Administradores(int experienciaVentas, String puesto, String años_cargo, int salario, String nombre, String apellido, int id, String user, String contra) {
        super(puesto, años_cargo, salario, nombre, apellido, id, user, contra);
        this.experienciaVentas = experienciaVentas;
    }

   

    public int getExperienciaVentas() {
        return experienciaVentas;
    }

    public void setExperienciaVentas(int experienciaVentas) {
        this.experienciaVentas = experienciaVentas;
    }

    @Override
    public String toString() {
        return "Administradores{" + " Años de experiencia en Ventas=" + experienciaVentas + '}';
    }
    
    
    
    
    
    
}
