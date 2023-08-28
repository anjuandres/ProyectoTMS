
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Administrador;

/**
 *
 * @author braya
 */
public class Ctrl_Administrador {
    
    //metodo de iniciar sesion
    public boolean loginUser(Administrador objeto){
        
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select nombre_admin, contraseña from administrador where nombre_admin = '"+objeto.getNombre_admin()+"' and contraseña = '"+objeto.getContraseña()+"'";
        Statement st;
        try{  
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                respuesta = true;
            }
        }catch (SQLException e){
            System.out.println("Error al iniciar sesion"+ e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion"+e);
        }
        return respuesta;
    }   
}
//String sql = "select nombre_admin, contraseña from administrador where nombre_admin = '"+objeto.getNombre_admin()+"' and contraseña = '"+objeto.getContraseña()+"'";