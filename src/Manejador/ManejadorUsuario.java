/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejador;

import Clases.ProveedorNatural;
import DATProveedor.DATUser;
import Clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author krac
 */
public class ManejadorUsuario {
    
    public boolean compararCamposPersonaNatural(String user,String pass) throws ClassNotFoundException, SQLException{
        DATUser objUsuario = new DATUser();
        ResultSet rs = objUsuario.obtenerUsuarioNatural(user, pass);
        ProveedorNatural objProveedorNatural = new ProveedorNatural();
        Usuario objCredenciales = new Usuario();
        
        
        while(rs.next()){
            objCredenciales.setUsuario(rs.getString(1));
            objCredenciales.setPass(rs.getString(2));
        }
        return user.equals(objCredenciales.getUsuario())&&pass.equals(objCredenciales.getPass());
        
        
        
    }
    
    
}
