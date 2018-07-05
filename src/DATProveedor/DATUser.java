/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATProveedor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author krac
 */
public class DATUser {

    Conexion mySql = new Conexion();

    public ResultSet obtenerUsuarioNatural(String user, String pass) throws ClassNotFoundException, SQLException {
        Statement coneccion = mySql.getConexion().createStatement();
        String sql = "SELECT usuarioPersona,contrasena \n"
                + "FROM `clientepersonaproveedor` \n"
                + "WHERE usuarioPersona = '"+user+"' \n"
                + "AND contrasena = '"+pass+"'";

        return coneccion.executeQuery(sql);

    }

}
