/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import Dominio.anime;
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
public class animeDao {
    private static final String SQL_SELECT = "SELECT * FROM anime";
    private static final String SQL_INSERT = "INSERT INTO anime (idanime,name,author,description,ncaps,seasons,launch, "
            + "end,language,rate,movie,category) VALUE (?, ?, ?, ?, ? ,? ,? ,? ,? ,? ,? ,?)";
    private static final String SQL_UPDATE = "UPDATE anime SET idanime=?, name=?, author=?, description=?, ncaps=?, "
            + "seasons=?, launch=?, end=?, language=?, rate=?, movie=?, category=? WHERE idanime=?";
    private static final String SQL_DELETE = "DELETE FROM anime WHERE idanime=?";
    
    public List<anime> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        anime anime = null;
        List<anime> animes = new ArrayList<>();
        conn = getConnection();
        stmt =conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idanime = rs.getInt("idanime");
            String name= rs.getString("name");
            String author= rs.getString("author");
            String description= rs.getString("description");
            int ncaps = rs.getInt("ncaps");
            int seasons = rs.getInt("seasons");
            Date launch = rs.getDate("launch");
            Date end = rs.getDate("end");
            String language = rs.getString("language");
            double rate = rs.getDouble("rate");
            boolean movie = rs.getBoolean("moovie");
            String category= rs.getString("category");
            
        
            animes.add(new anime (idanime,name,author,description,ncaps,seasons,launch,end,language,rate,movie,category));
        }
        
        close(rs);
        close(stmt);
        close(conn);
          return animes;
    }
    
     public int insertar(anime anime){
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            
            try {
                conn = getConnection();
                stmt =conn.prepareStatement(SQL_INSERT);
                
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
