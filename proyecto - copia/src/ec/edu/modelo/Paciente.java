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
public class Paciente {

    private String cedula;
    private String apellidos;
    private String nombres;
    private String fechNac;
    private String genero;

    public Paciente() {
    }
    
    public Paciente(String genero) {
        this.genero = genero;
    }
    public Paciente(String cedula, String apellidos, String nombres) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    public Paciente(String cedula, String apellidos, String nombres, String fechNac, String genero) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fechNac = fechNac;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechNac() {
        return fechNac;
    }

    public void setFechNac(String fechNac) {
        this.fechNac = fechNac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", cedula, apellidos, nombres, fechNac, genero);
    }

}
