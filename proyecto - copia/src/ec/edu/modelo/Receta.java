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
public class Receta {
    private int cantidad;
    private String prescripcion;

    public Receta(int cantidad, String prescripcion) {
        this.cantidad = cantidad;
        this.prescripcion = prescripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    @Override
    public String toString() {
        return String.format("%d %s",cantidad,prescripcion);
    }
}
