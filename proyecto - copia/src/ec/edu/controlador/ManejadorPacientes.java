/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import ec.edu.modelo.Consulta;
import ec.edu.modelo.Genero;
import ec.edu.modelo.Medicamento;
import ec.edu.modelo.Paciente;
import ec.edu.modelo.Receta;
import ec.edu.modelo.Usuarios;
import DAT.DATPacientes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class ManejadorPacientes {

    public ArrayList<Consulta> obtenerDatConsul() throws SQLException, ClassNotFoundException {
        ArrayList<Consulta> listConsulta = new ArrayList<Consulta>();
        DATPacientes objConsulta = new DATPacientes();
        //De ResultSet desfragmentar datos
        ResultSet rs = objConsulta.obtenerDatConsulta();
        //permite recorrer los datos del ResultSet
        while (rs.next()) {
            Paciente objPaciente=new Paciente(rs.getString(2));
            Consulta objCon = new Consulta(objPaciente, rs.getString(3), rs.getDouble(4),rs.getInt(5), rs.getString(6),rs.getString(7), rs.getString(8));
            listConsulta.add(objCon);
        }
        return listConsulta;
    }

    public ArrayList<Medicamento> obtenerMedicamento() throws SQLException, ClassNotFoundException {
        DATPacientes objMedicament = new DATPacientes();
        ArrayList<Medicamento> listMedicament = new ArrayList<Medicamento>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objMedicament.obtenerMedicina();
        while (rs.next()) {
            Medicamento objMed= new Medicamento(rs.getString(2),rs.getString(3), rs.getString(4));
            listMedicament.add(objMed);
        }
        return listMedicament;
    }
    
    

    public Paciente obtenerPacCed(String cedula) throws SQLException, ClassNotFoundException {
        DATPacientes objPac = new DATPacientes();
        ArrayList<Paciente> listPac = new ArrayList<Paciente>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objPac.obtenerPacienteCed(cedula);
        Paciente pac = new Paciente();
        while (rs.next()) {
            pac=new Paciente(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
        }
        return pac;
    }
    
    public ArrayList<Genero> obtenerGenero() throws SQLException, ClassNotFoundException {
        DATPacientes objGenPa = new DATPacientes();
        ArrayList<Genero> listGen = new ArrayList<Genero>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objGenPa.obtenerGenero();
        while (rs.next()) {
            Genero objPa= new Genero(rs.getInt(1), rs.getString(2));
            listGen.add(objPa);
        }
        return listGen;
    }
    
    public ArrayList<Usuarios> obtenerUsuario() throws SQLException, ClassNotFoundException {
        ArrayList<Usuarios> listUs = new ArrayList<Usuarios>();
        DATPacientes objUs = new DATPacientes();
        //De ResultSet desfragmentar datos
        ResultSet rs = objUs.obtenerUsuario();
        while (rs.next()) {
            Usuarios users=new Usuarios(rs.getString(1),rs.getString(2),rs.getString(3));
            listUs.add(users);
        }
        return listUs;
    }

    public void agregarMedicamento(Receta recet) throws SQLException, ClassNotFoundException {
        DATPacientes objRect = new DATPacientes();
        //De ResultSet desfragmentar datos
        ResultSet rs = objRect.getNumRecet();
        int ID = -1;
        while (rs.next()) {
            ID = rs.getInt(1);
            objRect.nuevoReceta(recet, ID+1);
        }
    }
}
