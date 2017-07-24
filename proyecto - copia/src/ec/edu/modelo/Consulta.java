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
public class Consulta {
    private Paciente paciente;
    private String fecha;
    private double peso;
    private int estatura;
    private String diagnostico;
    private String medico;
    private String indicaciones;

    public Consulta(Paciente paciente,String fecha, double peso, int estatura, String diagnostico,
            String medico, String indicaciones) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.peso = peso;
        this.estatura = estatura;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.indicaciones = indicaciones;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return String.format("%s %s %f %d %s %s %s",paciente,fecha,peso,estatura,diagnostico,medico,indicaciones);
    }
}
