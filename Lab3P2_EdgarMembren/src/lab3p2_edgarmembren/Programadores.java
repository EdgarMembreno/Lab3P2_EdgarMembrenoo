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
public class Programadores extends Empleados{
    private String lenguaje;
    private String horario;

    public Programadores() {
        super();
    }

    public Programadores(String lenguaje, String horario, String puesto, String años_cargo, int salario, String nombre, String apellido, int id, String user, String contra) {
        super(puesto, años_cargo, salario, nombre, apellido, id, user, contra);
        this.lenguaje = lenguaje;
        this.horario = horario;
    }

  

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Programadores{" + "lenguaje=" + lenguaje + ", horario=" + horario +'}';
    }

   
    
}
