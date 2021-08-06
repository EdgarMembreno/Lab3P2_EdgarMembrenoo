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
public class Empleados extends Personas {
    private String puesto;
    private String años_cargo;
    private int salario;
    

    public Empleados() {
        super();
    }

    public Empleados(String puesto, String años_cargo, int salario, String nombre, String apellido, int id, String user, String contra) {
        super(nombre, apellido, id, user, contra);
        this.puesto = puesto;
        this.años_cargo = años_cargo;
        this.salario = salario;
    }

    

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAños_cargo() {
        return años_cargo;
    }

    public void setAños_cargo(String años_cargo) {
        this.años_cargo = años_cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleados{" + "puesto=" + puesto + ", Años de cargo=" + años_cargo + ", salario=" + salario + '}';
    }
    
    
}
