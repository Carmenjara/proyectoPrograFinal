/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocío
 */
public class ConexionMySQL {
    private Connection conecta = null;

        private String url = "jdbc:mysql://localhost:3306/medicina";//ruta de la BD
    private String user = "Carmen";
    private String pass = "chio12345";
    private String driver = "com.mysql.jdbc.Driver";//driver que permite la conexion: controlador

    //Retorna la conexion cada vez que es invocado; metodo de tipo Connection
    public Connection getConexion() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(driver).newInstance();
            conecta = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conecta;
    }

    public void Cerrar() {
        try {
            conecta.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
