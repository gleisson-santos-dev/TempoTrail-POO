package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    
    public Treinador info_Treinador_login(Treinador t1){
        Treinador t2 = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st =null;
        
        
        String sql = "SELECT nome, cpf, senha FROM Treinador";
         try{
            Class.forName(driver);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conn = DriverManager.getConnection(url,user,senha);
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            String cpf, nome, senha;
            
            cpf = t1.getCpf();
            nome = t1.getNome();
            senha = t1.getSenha();
            while(rs.next()){
                if(cpf.equals(rs.getString(2)) && nome.equals(rs.getString(1)) && senha.equals(rs.getString(3))){
                    t2 = new Treinador();
                    t2.setNome(rs.getString(1));
                    t2.setSenha(rs.getString(3));
                    t2.setCpf(rs.getString(2));
                    return t2;
                }
            }
        } 
         catch(Exception ex){
            System.out.println(ex);
        }
        return t2;
    }
}
