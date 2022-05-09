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
public class Juego {
    private String nom = null;
    private String cate = null;
    private String cons = null;
    private String pers = null;
    private String emp = null;
    private String año = null;
    private String res = null;
    private int cant = 0;
    
   public Juego(String nombre, String categoria, String consola, String personaje, String empresa, int cantidad, String año, String reseña){
       this.nom = nombre;
       this.cate = categoria;
       this.cons = consola;
       this.pers = personaje;
       this.emp = empresa;
       this.cant = cantidad;
       this.año = año;
       this.res = reseña;
   } 
   
   //Getters y Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public String getPers() {
        return pers;
    }

    public void setPers(String pers) {
        this.pers = pers;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
   
    public String toString(){
        return "Juego:".concat(this.getNom()).concat("Categoria: ").concat(getCate()).concat("Consola: ") 
                .concat(this.getCons()).concat("Personajes principales: ").concat(this.getPers())
                .concat("Empresa que lo desarrollo: ").concat(this.getEmp()).concat("Año: ")
                .concat(this.getAño()).concat("Reseña: ").concat(this.getRes()).concat("Cantidad: ")
                .concat(""+this.getCant());
    }
}
