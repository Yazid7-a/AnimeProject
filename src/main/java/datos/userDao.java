/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import Dominio.user;
import static datos.conexion.close;
import static datos.conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public class userDao {
    private static final String SQL_SELECT = "SELECT * FROM user";
    private static final String SQL_INSERT = "INSERT INTO user (iduser,email,password,premium) VALUE (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE user SET userid=?, email=?, passwordl=?, premium=? WHERE iduser=?";
    private static final String SQL_DELETE = "DELETE FROM user WHERE iduser=?";
    
    
    public List<user> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        user user = null;
        List<user> users = new ArrayList<>();
        conn = getConnection();
        stmt =conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int iduser = rs.getInt("iduser");
            String email = rs.getString("email");
            String password = rs.getString("password");
            boolean premium = rs.getBoolean("premium");
        
            users.add(new user (iduser,email,password,premium));
        }
        
        close(rs);
        close(stmt);
        close(conn);
          return users;
    }
    
     public int insertar(user user){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            
            try {
                conn = getConnection();
                stmt =conn.prepareStatement(SQL_INSERT);
                
                //stmt.setInt(1, user.getUserid());
                stmt.setString(2, user.getEmail());
                stmt.setString(3, user.getPassword());
                stmt.setBoolean(4, user.isPremium());
                
                registros = stmt.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }finally{
                try {
                    close(stmt);
                    close(conn);
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                }
            }
            return registros;
        }
    
        
        public int actualizar(user user){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            
            try {
                conn = getConnection();
                stmt =conn.prepareStatement(SQL_UPDATE);
                
                stmt.setInt(1, user.getUserid());
                stmt.setString(2, user.getEmail());
                stmt.setString(3, user.getPassword());
                stmt.setBoolean(4, user.isPremium());
                
                
                registros = stmt.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }finally{
                try {
                    close(stmt);
                    close(conn);
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                }
            }
            return registros;
        }
        
        
     /* public int eliminar(user user){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            
            try {
                conn = getConnection();
                stmt =conn.prepareStatement(SQL_DELETE);
                
                stmt.setInt(1, persona.getPersonaID());
                
                registros = stmt.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }finally{
                try {
                    close(stmt);
                    close(conn);
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                }
            }
            return registros;
    
}*/
}
