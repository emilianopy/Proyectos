/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.modelo.gamestore;

import java.util.ArrayList;
import proyectotiendadejuegos.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Windows
 */
public class Cliente extends Persona {

    public int id;
    private conectorDB conn = new conectorDB();

    public Cliente(String nroCedula, String nombre, String apellido, String direccion, String nroTelefono) {
        super(nroCedula, nombre, apellido, direccion, nroTelefono);
    }

    public ArrayList<Object> ObtenerClientes(String Opciones) {
        ArrayList<Object> lista = new ArrayList<Object>();

        lista = conn.ObtenerDatos("clientes", Opciones);

        return lista;

    }

    public void guardar() {
        if (this.id == 0) {
            conn.EjecutarSQL("insert into clientes values (null, '" + this.nroCedula + "', '" + this.nombre + "', '" + this.apellido + "', '" + this.direccion + "', '" + this.nroTelefono + "')");
        } else {
            conn.EjecutarSQL("update clientes set nrocedula =  '" + this.nroCedula + "' ,nombre = '" + this.nombre + "' ,apellido = '" + this.apellido + "' ,direccion = '" + this.direccion + "' ,nroTelefono = '" + this.nroTelefono + "'where id = " + this.id);
        }
    }

    public void eliminar() {
        conn.EjecutarSQL("delete from clientes where id = " + this.id);

    }
}
