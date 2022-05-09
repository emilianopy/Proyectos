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
public class Juego {

    private String nombre = null;
    private String categoria = null;
    private String tipoConsola = null;
    private String personaje = null;
    private String empresa = null;
    private String año = null;
    private String descripcion = null;
    private double monto = 0.0;
    private int cant = 1;
    

    public Juego(String nombre, String categoria, String consola, String personaje, String empresa, int cantidad, String año, String descripcion, double monto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tipoConsola = consola;
        this.personaje = personaje;
        this.empresa = empresa;
        this.cant = cantidad;
        this.año = año;
        this.descripcion = descripcion;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getConsola() {
        return tipoConsola;
    }

    public void setConsonla(String consola) {
        this.tipoConsola = consola;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getCantidad() {
        return cant;
    }

    public void setCantidad(int cantidad) {
        this.cant = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return "Juego:".concat(this.getNombre()).concat("Categoria: ").concat(this.getCategoria()).concat("Consola: ")
                .concat(this.getConsola()).concat("Personajes principales: ").concat(this.getPersonaje())
                .concat("Empresa que lo desarrollo: ").concat(this.getEmpresa()).concat("Año: ")
                .concat(this.getAño()).concat("Descripcion del Juego: ").concat(this.getDescripcion()).concat("Cantidad: ")
                .concat("" + this.getCantidad());
    }
}
