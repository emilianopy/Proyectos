/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.modelo.gamestore;

/**
 *
 * @author HP
 */
public class pruebaConecDB {

    public static void main(String[] args) {
        conectorDB con = new conectorDB();
        con.ObtenerDatos("clientes", "");
    }

}
