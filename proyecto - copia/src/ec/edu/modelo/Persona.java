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
public class Persona {
    private String Id;
    private String nombres;
    private String apellidos;

    public Persona() {
    }

    public Persona(String Id, String nombres, String apellidos) {
        this.Id = Id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",Id,nombres,apellidos);
    }
    
}
