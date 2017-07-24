/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;


import ec.edu.modelo.Medicamento;
import ec.edu.modelo.Paciente;
import ec.edu.modelo.Receta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rocío
 */
public class DATPacientes {

    private ConexionMySQL conecta = new ConexionMySQL();

    //Metodo para hacer la consulta de la BD: de tipo ResultSet
    public ResultSet obtenerDatConsulta() throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT pac.Nombres, Fecha, Peso, Estatura, Diagnostico, Medico, Indicaciones "
                + "FROM consulta c, paciente pac "
                + "WHERE c.idPac=pac.idPac";
        return consulta.executeQuery(sentencia);
    }

    public ResultSet obtenerPacienteCed(String cedula) throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT Cedula, Apellidos, Nombres, FechaNac, g.Nombre "
                + "FROM paciente pa ,genero g "
                + "WHERE pa.Genero=g.IdGenero "
                + "AND Cedula="+cedula;
        return consulta.executeQuery(sentencia);
    }

    public ResultSet obtenerGenero() throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT IdGenero,Nombre FROM genero";
        return consulta.executeQuery(sentencia);
    }
    
    public ResultSet obtenerMedicina() throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT Codigo,medicamento, DosisRec FROM medicamento";
        return consulta.executeQuery(sentencia);
    }
    
    public ResultSet obtenerUsuario() throws SQLException, ClassNotFoundException {
        //El Statement abre la conexion y para el espaciado se crea el .createStatement()x
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT usuario,clave,tipo FROM usuario";
        return consulta.executeQuery(sentencia);
    }
    
    //Guardar nuevo cliente en la BD
    public void registrarNuevoPaciente(Paciente pact, int ID) throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "INSERT INTO paciente (idPac,Cedula,Apellidos,Nombres,FechaNac,Genero)"
                + "VALUES(" +String.valueOf(ID) + " , '"
                + pact.getCedula() + "' , '"
                + pact.getApellidos()+ "' , '"
                + pact.getNombres()+ "' , '"
                +pact.getFechNac()+ "' , "
                +pact.getGenero()+ ")";
        int Res = consulta.executeUpdate(sentencia);
        consulta.close();
    }
    
    public void registrarOtroMedicamento(Medicamento med, int ID) throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "INSERT INTO medicamento (idMed,Codigo,Medicamento,DosisRec)"
        +"VALUES (" +String.valueOf(ID) + " , '"
                + med.getCodigo() + "' , '"
                + med.getNombre()+ "' , '"
                + med.getDosis()+")";
        int Res = consulta.executeUpdate(sentencia);
        consulta.close();
    }

    //Obtiene el numero de registros de la BD
    public ResultSet getNumPaciente() throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT COUNT(*) FROM paciente";
        return consulta.executeQuery(sentencia);
    }
    
    public ResultSet getNumMedicamento() throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT COUNT(*) FROM medicamento";
        return consulta.executeQuery(sentencia);
    }
    
    public ResultSet getNumRecet() throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "SELECT COUNT(*) FROM receta";
        return consulta.executeQuery(sentencia);
    }

    public void nuevoReceta(Receta recet, int ID) throws SQLException, ClassNotFoundException {
        Statement consulta = conecta.getConexion().createStatement();
        //Se establece la consulta
        String sentencia = "INSERT INTO receta (idCon,Cant,Prescripcion)"
        +"VALUES (" +String.valueOf(ID) + " , '"
                + recet.getCantidad()+ "' , '"
                + recet.getPrescripcion()+")";
        int Res = consulta.executeUpdate(sentencia);
        consulta.close();
    }
}
