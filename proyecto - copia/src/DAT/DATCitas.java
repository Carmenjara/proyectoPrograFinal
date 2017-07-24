/*
Hice un cambio
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
    public ResultSet obtenerListaCitas() throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT * FROM `citas`";
        return consulta.executeQuery(sentencia);
    }

    public ResultSet obtenerCitaCed(String cedula) throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT * FROM citas WHERE CedulaPac="+cedula;
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

    //Guardar nuevo cliente en la BD de xampp
//    public void guardarCliente(Cliente cl, int pr, int cr, int pt, int ct, int ID) throws SQLException, ClassNotFoundException {
//        Statement consulta = BD.getConexion().createStatement();
//        //Se establece la consulta
//        String sentencia = "INSERT INTO cliente (IdCliente,Cedula,Apellidos,"
//                + "Nombres,Res_Provincia,Res_Ciudad,Res_Calle,Res_Numero,"
//                + "Tra_Provincia,Tra_Ciudad,Trab_Calle,Trab_Numero)"
//                + "VALUES (" + String.valueOf(ID) + " , '" + cl.getId() + "' , '"
//                + cl.getApellido() + "' , '" + cl.getNombre() + "' , "
//                + pr + ", "
//                + cr + ", '"
//                + cl.getLugarResidencia().getCalle() + "', "
//                + cl.getLugarResidencia().getNumero() + ", "
//                + pt + ", "
//                + ct + ", '"
//                + cl.getLugarTrabajo().getCalle() + "', "
//                + cl.getLugarTrabajo().getNumero() + ")";
//        int Res = consulta.executeUpdate(sentencia);
//        consulta.close();
//    }

    //Obtiene el numero de registros de la BD
    public ResultSet getNumCliente() throws SQLException, ClassNotFoundException {
        Statement consulta = BD.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT COUNT(*) FROM cliente";
        return consulta.executeQuery(sentencia);
    }

//    public void modificarCliente(Cliente cl, int pr, int cr, int pt, int ct) throws SQLException, ClassNotFoundException {
//        Statement consulta = BD.getConexion().createStatement();
//        //Se establece la consulta
//        String sentencia = "UPDATE cliente SET Apellidos= '"
//                + cl.getApellido() + "', Nombres= '" + cl.getNombre()
//                + "', Res_Provincia = " + pr + ", Res_Ciudad= " + cr
//                + ", Res_Calle= '" + cl.getLugarResidencia().getCalle()
//                + "', Res_Numero = " + cl.getLugarResidencia().getNumero()
//                + ", Tra_Provincia = " + pt + ", Tra_Ciudad= " + ct
//                + ", Trab_Calle= '" + cl.getLugarTrabajo().getCalle()
//                + "', Trab_Numero = " + cl.getLugarTrabajo().getNumero()
//                + " WHERE Cedula= " + cl.getId();
//        int Res = consulta.executeUpdate(sentencia);
//    }
    
}
