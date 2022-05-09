/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.modelo.gamestore;

import proyectotiendadejuegos.*;

/**
 *
 * @author Windows
 */
public abstract class Persona {

    public String nombre = null;
    public String apellido = null;
    public String nroTelefono = null;
    public String nroCedula = null;
    public String direccion = null;

    public Persona(String nroCedula, String nombre, String apellido, String direccion, String nroTelefono) {
        this.nroCedula = nroCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.nroTelefono = nroTelefono;
    }

    //Getters y Setters
    public String getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(String id) {
        this.nroCedula = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public void setDireccion(String dire) {
        this.direccion = dire;
    }

    public String getTelefono() {
        return nroTelefono;
    }

    public void setTelefono(String tel) {
        this.nroTelefono = tel;
    }

}
