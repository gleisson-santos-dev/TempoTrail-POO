/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import model.Desempenho;
import model.Atleta;

/**
 *
 * @author gleisson
 */
public class Desempenho_ctr {
    
    static String url = "jdbc:postgresql://localhost:5432/TempoTrail_app";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "0123456";
    
    public void add_desempenho_bd( Desempenho d1, Atleta a1){
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            Class.forName(driver);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String sql = "INSERT INTO desempenho(id_atleta,tempo,distancia,altura_salto,velocidade)VALUES(?,?,?,?,?);";
            ps = conn.prepareStatement(sql);
            ps.setString(1, a1.getCpf());
            ps.setFloat(2, d1.getTempo());
            ps.setFloat(3, d1.getDistacia());
            ps.setFloat(4, d1.getAltuta_salto());
            ps.setFloat(5, d1.getVelocidade());
            ps.execute();
            ps.close();
            conn.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
