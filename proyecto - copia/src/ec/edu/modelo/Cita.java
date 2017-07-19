/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.modelo;

import java.util.Date;

/**
 *
 * @author Rocío
 */
public class Cita {

    private Date fecha;
    private Persona paciente;
    private Doctor doctor;
    private String estado;
    private double costo;

    public Cita() {
    }

    public Cita(Date fecha, Persona paciente, Doctor doctor, String estado, double costo) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.doctor = doctor;
        this.estado = estado;
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", fecha, paciente, doctor, estado, costo);
    }

}
