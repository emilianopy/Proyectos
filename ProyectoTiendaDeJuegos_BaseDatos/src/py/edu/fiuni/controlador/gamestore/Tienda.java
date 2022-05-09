/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.controlador.gamestore;

import java.util.ArrayList;
import java.util.List;
import proyectotiendadejuegos.Cliente;
import proyectotiendadejuegos.Juego;

/**
 *
 * @author Windows
 */
public class Tienda{
    private List<Juego> juegos = null;
    private List<Cliente> clientes = null;
    
    public Tienda() {
        juegos = new ArrayList<>();
        clientes = new ArrayList<>();
    }
    //--------------------------------------------------------------------------
    //METODOS PARA LA CLASE JUEGO
    /**
     * 
     * @param nom
     * @return 
     */
    private Juego searchJuego(String nom) {
        for(Juego j : juegos) {
            if(j.getNom().equalsIgnoreCase(nom)) {
		return j;
            }
	}
	return null;
    }
    /**
     * 
     * @param j
     * @return 
     */
    private boolean addJuego(Juego j){
        if(searchJuego(j.getNom()) != null){
            return juegos.add(j);
        }
        return false;
    }
    /**
     * 
     * @param j
     * @return 
     */
    private boolean removeJuego(Juego j){
        if(addJuego(j) != true){
            return juegos.remove(j);
        }
        return false;
    }
    /**
     * 
     */
    private void listarJuegos(){
        for(Juego j : juegos){
            //ACA PONER EL PANEL PARA LISTAR JUEGOS
        }
    }
    //--------------------------------------------------------------------------
    //METODOS PARA LA CLASE CLIENTE
    private Cliente searchCliente(String id) {
        for(Cliente c : clientes) {
            if(c.getNroCedula().equalsIgnoreCase(id)){
		return c;
            }
	}
	return null;
    }
    /**
     * 
     * @param c
     * @return true si agrego el cliente, false si ya existe
     */
    public boolean addCliente(Cliente c){
        if(searchCliente(c.getNroCedula()) == null){
            return clientes.add(c);
        }
        return false;
    }
    /**
     * 
     * @param c
     * @return 
     */
    private boolean removeCliente(Cliente c){
        if(addCliente(c) != true){
            return clientes.remove(c);
        }
        return false;
    }
    /**
     * 
     */
    private void listarClientes(){
        for(Juego j : juegos){
            //ACA PONER EL PANEL PARA LISTAR JUEGOS
        }
    }
}
