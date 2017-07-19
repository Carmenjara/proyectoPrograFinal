/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class ManejadorCitas {
        public ArrayList<Cita> ObtenerClientes() throws SQLException, ClassNotFoundException {
        ArrayList<Cita> listClientes = new ArrayList<Cita>();
        DATClientes objCliente = new DATClientes();
        //De ResultSet desfragmentar datos
        ResultSet rs = objCliente.ObtenerCliente();
        //permite recorrer los datos del ResultSet
        while (rs.next()) {
            Direccion objDireRes = new Direccion(rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
            Direccion objDireTra = new Direccion(rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11));
            Cliente objCl = new Cliente(rs.getString(1), rs.getString(3), rs.getString(2), objDireRes, objDireTra);
            listClientes.add(objCl);
        }
        return listClientes;
    }

    public ArrayList<Provincia> ObtenerProvincias() throws SQLException, ClassNotFoundException {
        DATClientes objProvincia = new DATClientes();
        ArrayList<Provincia> listProvincias = new ArrayList<Provincia>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objProvincia.ObtenerProvincias();
        while (rs.next()) {
            Provincia objProvinc = new Provincia(rs.getInt(1), rs.getString(2));
            listProvincias.add(objProvinc);
        }
        return listProvincias;
    }

    public ArrayList<Canton> ObtenerCantones(int IdProv) throws SQLException, ClassNotFoundException {
        DATClientes objCanton = new DATClientes();
        ArrayList<Canton> listCantones = new ArrayList<Canton>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objCanton.ObtenerCanton(IdProv);
        while (rs.next()) {
            Canton objCant = new Canton(rs.getInt(1), rs.getInt(2), rs.getString(3));
            listCantones.add(objCant);
        }
        return listCantones;
    }

    public Cliente ObtenerCLientCed(String cedula) throws SQLException, ClassNotFoundException {
        DATClientes objClient = new DATClientes();
        ArrayList<Cliente> listClients = new ArrayList<Cliente>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objClient.ObtenerClienteCed(cedula);
        Cliente cl = new Cliente();
        while (rs.next()) {
            Direccion objDireRes = new Direccion(rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
            Direccion objDireTra = new Direccion(rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11));
            cl = new Cliente(rs.getString(1), rs.getString(3), rs.getString(2), objDireRes, objDireTra);
        }
        return cl;
    }

    public Cliente consultarCli(String cedula) throws SQLException, ClassNotFoundException{
        DATClientes objClient = new DATClientes();
        //De ResultSet desfragmentar datos
        ResultSet rs;
            rs = objClient.ObtenerCliente();
        Cliente cl = new Cliente();
        while (rs.next()) {
                if (rs.getString(1).equals(cedula)) {
                    Direccion objDireRes = new Direccion(rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                    Direccion objDireTra = new Direccion(rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11));
                    cl = new Cliente(rs.getString(1), rs.getString(3), rs.getString(2), objDireRes, objDireTra);
                }
        }
        return cl;
    }

    public void guardarClints(Cliente cl, int pr, int cr, int pt, int ct) throws SQLException, ClassNotFoundException {
        DATClientes objClient = new DATClientes();
        //De ResultSet desfragmentar datos
        ResultSet rs = objClient.getNumCliente();
        int ID = -1;
        while (rs.next()) {
            ID = rs.getInt(1);
            objClient.guardarCliente(cl, pr, cr, pt, ct, ID + 1);
        }
    }

    //permite modificar los datos del cliente en la base de datos
    public void modificarCliente(Cliente cl, int pr, int cr, int pt, int ct) throws SQLException, ClassNotFoundException {
        DATClientes objClient = new DATClientes();
        objClient.modificarCliente(cl, pr, cr, pt, ct);
    }
    
}
