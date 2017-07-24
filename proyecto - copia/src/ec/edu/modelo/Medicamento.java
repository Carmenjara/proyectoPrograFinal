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
public class Medicamento {
    private String codigo;
    private String nombre;
    private String dosis;
    

    public Medicamento(String codigo, String nombre, String dosis) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", codigo,nombre, dosis);
    }
}
