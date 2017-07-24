/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.modelo;

/**
 *
 * @author Rocío
 */
public class Usuarios {
    private String usuario;
    private String clave;
    private String tipo;

    public Usuarios() {
    }

    public Usuarios(String usuario,String clave, String tipo) {
        this.usuario = usuario;
        this.clave = clave;
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    } 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("%s %s", usuario,clave);
    }
    
    
}
