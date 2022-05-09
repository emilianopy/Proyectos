/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotiendadejuegos;

/**
 *
 * @author Windows
 */
public abstract class Persona {

    public int id;
    private String nombre = null;
    private String apellido = null;
    private String tel = null;
    private String nroCedula;
    private String dire = null;

    public Persona(String nroCedula, String nombre, String apellido, String direccion, String tel) {
        this.nroCedula = nroCedula;
        this.nombre = nombre;
        this.dire = direccion;
        this.tel = tel;
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

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
