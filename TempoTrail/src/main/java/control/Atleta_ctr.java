
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import model.Atleta;

public class Atleta_ctr {
    
    static String url = "jdbc:postgresql://localhost:5432/TempoTrail_app";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "0123456";
    
    public void cadastrarAtleta(Atleta a1){
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
            String sql = "INSERT INTO Atleta(nome, idade,senha, cpf, peso, altura, categoria)VALUES(?,?,?,?,?,?,?);";
            ps = conn.prepareStatement(sql);
            ps.setString(1,a1.getNome());
            ps.setInt(2,a1.getIdade());
            ps.setString(3,a1.getSenha());
            ps.setString(4,a1.getCpf());
            ps.setFloat(5,a1.getPeso());
            ps.setDouble(6,a1.getAltura());
            ps.setString(7,a1.getCategoria());
            ps.execute();
            ps.close();
            conn.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    

}
