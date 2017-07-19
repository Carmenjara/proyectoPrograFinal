/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.modelo;

import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class Doctor extends Persona implements Personal{
    
    private String especialidad;
    private ArrayList<Cita> cita;

    public Doctor() {
    }

    public Doctor(String especialidad, ArrayList<Cita> cita, String Id, String nombres, String apellidos) {
        super(Id, nombres, apellidos);
        this.especialidad = especialidad;
        this.cita = cita;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Cita> getCita() {
        return cita;
    }

    public void setCita(ArrayList<Cita> cita) {
        this.cita = cita;
    }
    
    public void establecerEstCita(){
        
    }

    @Override
    public void generarListado() {
      
    }

    @Override
    public void buscarCita() {
       
    }

    @Override
    public String toString() {
        return String.format("%s %s",especialidad,cita);
    }
    
}
