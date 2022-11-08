/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import Dominio.chapters;
import static datos.conexion.close;
import static datos.conexion.getConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alumno Mañana
 */
public class chaptersDao {
    private static final String SQL_SELECT = "SELECT * FROM chapters";
    private static final String SQL_INSERT = "INSERT INTO chapters (idchapters,title,duration,launch,description,rate,animeFK) "
            + "VALUE (,? ,? ,? ,? ,? ,?)";
    private static final String SQL_UPDATE = "UPDATE chapters SET idchapters=?, title=?, duration=?, launch=?, "
            + "description=?, rate=?, animeFK=? WHERE idchapters=?";
    private static final String SQL_DELETE = "DELETE FROM chapters WHERE idchapters=?";
    
     public List<chapters> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        chapters chapter = null;
        List<chapters> chapters  = new ArrayList<>();
        conn = getConnection();
        stmt =conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idchapters = rs.getInt("idchapters");
            String title = rs.getString("title");
            double duration = rs.getDouble("duration");           
            String description= rs.getString("description");
            Date launch = rs.getDate("launch");
            double rate = rs.getDouble("rate");
            int animeFK = rs.getInt("animeFK");
            
        
            chapters.add(new chapters (idchapters,title,duration,launch,description,rate,animeFK));
        }
        
        close(rs);
        close(stmt);
        close(conn);
          return chapters;
    }
    
     public int insertar(chapters chapters){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            
            try {
                conn = getConnection();
                stmt =conn.prepareStatement(SQL_INSERT);
                
                stmt.setInt(1, chapters.getidchapters());
                stmt.setString(2, anime.getName());
                stmt.setString(3, anime.getAuthor());
                stmt.setString(4, anime.getDescription());
                stmt.setInt(5, anime.getNcaps());
                stmt.setInt(6, anime.getSeasons());
                stmt.setDate(7, anime.getLaunch());
                stmt.setDate(8, anime.getEnd());
                stmt.setString(9, anime.getLanguage());
                stmt.setDouble(10, anime.getRate());
                stmt.setBoolean(11, anime.isMovie());
                stmt.setString(12, anime.getCategory());
                
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
    
        
        public int actualizar(anime anime){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            
            try {
                conn = getConnection();
                stmt =conn.prepareStatement(SQL_UPDATE);
                
                stmt.setInt(1, anime.getIdanime());
                stmt.setString(2, anime.getName());
                stmt.setString(3, anime.getAuthor());
                stmt.setString(4, anime.getDescription());
                stmt.setInt(5, anime.getNcaps());
                stmt.setInt(6, anime.getSeasons());
                stmt.setDate(7, anime.getLaunch());
                stmt.setDate(8, anime.getEnd());
                stmt.setString(9, anime.getLanguage());
                stmt.setDouble(10, anime.getRate());
                stmt.setBoolean(11, anime.isMovie());
                stmt.setString(12, anime.getCategory());
                
                
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
    
  public int eliminar(anime anime) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, anime.getIdanime());

            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
    }
    
}
