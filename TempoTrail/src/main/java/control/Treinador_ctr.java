package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import model.Treinador;

/**
 *
 * @author gleisson
 */
public class Treinador_ctr {
    static String url = "jdbc:postgresql://localhost:5432/TempoTrail_app";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "0123456";
    
    public void cadastrarTreinador(Treinador t1){
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
            String sql = "INSERT INTO Treinador(nome,idade,senha,cpf,formacao)VALUES(?,?,?,?,?);";
            ps = conn.prepareStatement(sql);
            ps.setString(1,t1.getNome());
            ps.setInt(2,t1.getIdade());
            ps.setString(3, t1.getSenha());
            ps.setString(4,t1.getCpf());
            ps.setString(5,t1.getFormacao());
            ps.execute();
            ps.close();
            conn.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
