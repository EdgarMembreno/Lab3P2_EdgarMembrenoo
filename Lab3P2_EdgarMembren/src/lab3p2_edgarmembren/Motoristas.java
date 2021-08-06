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
public class Motoristas extends Empleados {
    private int comisiones;
    private String transporte;
    private int cantEncargos;

    public Motoristas() {
        super();
    }

    public Motoristas(int comisiones, String transporte, int cantEncargos, String puesto, String años_cargo, int salario, String nombre, String apellido, int id, String user, String contra) {
        super(puesto, años_cargo, salario, nombre, apellido, id, user, contra);
        this.comisiones = comisiones;
        this.transporte = transporte;
        this.cantEncargos = cantEncargos;
    }

   

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public int getCantEncargos() {
        return cantEncargos;
    }

    public void setCantEncargos(int cantEncargos) {
        this.cantEncargos = cantEncargos;
    }

    @Override
    public String toString() {
        return "Motoristas{" + "comisiones=" + comisiones + ", transporte=" + transporte + ", cantEncargos=" + cantEncargos + '}';
    }
    
}
