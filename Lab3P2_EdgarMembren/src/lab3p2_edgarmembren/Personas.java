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
public class Personas {
    private String nombre;
    private String apellido;
    private int id;
    private String user;
    private String contra;

    public Personas() {
    }

    public Personas(String nombre, String apellido, int id, String user, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.user = user;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", user=" + user + ", contra=" + contra + '}';
    }

  

    
    
    
    
}
