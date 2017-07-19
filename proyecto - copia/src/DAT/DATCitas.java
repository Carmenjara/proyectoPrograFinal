/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rocío
 */
public class DATCitas {
    private ConexionMySQL BD= new ConexionMySQL();
    public ResultSet ObtenerCliente() throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT Cedula, Apellidos, Nombres, p.Nombre NOM_PROVINCIA, "
                + "cc.Nombre NOM_CANTON, c.Res_Calle,c.Res_Numero, prTra.Nombre ProvinciaTrab, "
                + "Trab.Nombre CantonTRab, c.Trab_Calle,c.Trab_Numero "
                + "FROM cliente c, provincia p, canton cc, provincia prTra, canton Trab "
                + "WHERE c.Res_Provincia=p.Id "
                + "AND c.Res_Ciudad=cc.Id "
                + "AND c.Tra_Provincia=prTra.Id "
                + "AND c.Tra_Ciudad=Trab.Id";
        return consulta.executeQuery(sentencia);
    }

    public ResultSet ObtenerClienteCed(String cedula) throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT Cedula, Apellidos, Nombres, p.Nombre NOM_PROVINCIA, "
                + "cc.Nombre NOM_CANTON, c.Res_Calle,c.Res_Numero, prTra.Nombre ProvinciaTrab, "
                + "Trab.Nombre CantonTRab, c.Trab_Calle,c.Trab_Numero "
                + "FROM cliente c, provincia p, canton cc, provincia prTra, canton Trab "
                + "WHERE c.Res_Provincia=p.Id "
                + "AND c.Res_Ciudad=cc.Id "
                + "AND c.Tra_Provincia=prTra.Id "
                + "AND c.Tra_Ciudad=Trab.Id"
                + "AND c.Cedula= " + cedula;
        return consulta.executeQuery(sentencia);
    }

    public ResultSet ObtenerProvincias() throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT Id,Nombre FROM provincia";
        return consulta.executeQuery(sentencia);
    }

    public ResultSet ObtenerCanton(int IdProvincia) throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT *FROM canton WHERE IdProvincia = " + IdProvincia;
        return consulta.executeQuery(sentencia);
    }

    public ResultSet ProvinciaRes(int IdProvincia) throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT *FROM canton WHERE IdProvincia = " + IdProvincia;
        return consulta.executeQuery(sentencia);
    }

    //Guardar nuevo cliente en la BD
    public void guardarCliente(Cliente cl, int pr, int cr, int pt, int ct, int ID) throws SQLException, ClassNotFoundException {
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "INSERT INTO cliente (IdCliente,Cedula,Apellidos,"
                + "Nombres,Res_Provincia,Res_Ciudad,Res_Calle,Res_Numero,"
                + "Tra_Provincia,Tra_Ciudad,Trab_Calle,Trab_Numero)"
                + "VALUES (" + String.valueOf(ID) + " , '" + cl.getId() + "' , '"
                + cl.getApellido() + "' , '" + cl.getNombre() + "' , "
                + pr + ", "
                + cr + ", '"
                + cl.getLugarResidencia().getCalle() + "', "
                + cl.getLugarResidencia().getNumero() + ", "
                + pt + ", "
                + ct + ", '"
                + cl.getLugarTrabajo().getCalle() + "', "
                + cl.getLugarTrabajo().getNumero() + ")";
        int Res = consulta.executeUpdate(sentencia);
        consulta.close();
    }

    //Obtiene el numero de registros de la BD
    public ResultSet getNumCliente() throws SQLException, ClassNotFoundException {
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT COUNT(*) FROM cliente";
        return consulta.executeQuery(sentencia);
    }

    public void modificarCliente(Cliente cl, int pr, int cr, int pt, int ct) throws SQLException, ClassNotFoundException {
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "UPDATE cliente SET Apellidos= '"
                + cl.getApellido() + "', Nombres= '" + cl.getNombre()
                + "', Res_Provincia = " + pr + ", Res_Ciudad= " + cr
                + ", Res_Calle= '" + cl.getLugarResidencia().getCalle()
                + "', Res_Numero = " + cl.getLugarResidencia().getNumero()
                + ", Tra_Provincia = " + pt + ", Tra_Ciudad= " + ct
                + ", Trab_Calle= '" + cl.getLugarTrabajo().getCalle()
                + "', Trab_Numero = " + cl.getLugarTrabajo().getNumero()
                + " WHERE Cedula= " + cl.getId();
        int Res = consulta.executeUpdate(sentencia);
    }
    
}
