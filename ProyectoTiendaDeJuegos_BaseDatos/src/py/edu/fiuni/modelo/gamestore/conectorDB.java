/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.modelo.gamestore;

import java.sql.*;
import java.util.ArrayList;

public class conectorDB {

    private static Connection con;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "java";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/gamestore?userTimezone=true&serverTimezone=UTC";

    public conectorDB() {
        con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado!!!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se ha podido conecta!!" + e);

        }
    }

    public ArrayList<Object> ObtenerDatos(String tabla, String opciones) {
        ArrayList<Object> lista = new ArrayList();
        Connection conn = getConnection();
        try {
            String query = "select * from " + tabla;
            if (opciones != "") {
                query += "where " + opciones;
            }
            PreparedStatement ps;
            ResultSet res;

            ps = conn.prepareStatement(query);
            res = ps.executeQuery();

            while (res.next()) {
                lista.add(res);
            }
        } catch (SQLException e) {
            System.out.println("Error en obtener datos!!" + e);
        } finally {
            conn = null;
        }
        return lista;
    }
    
    /**
     * En este metodo se ejecuta todas las consultas simple que afectan la base de datos
     * Estos pueden ser insert update y delete
     * @param query 
     */

    public void EjecutarSQL(String query) {
        Connection conn = getConnection();
        PreparedStatement ps;
        try {
            
            ps = conn.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al ejecutar consulta!!x " + e);
        } finally {
            conn = null;
            ps = null;
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void desconectar() {
        con = null;
    }
}
