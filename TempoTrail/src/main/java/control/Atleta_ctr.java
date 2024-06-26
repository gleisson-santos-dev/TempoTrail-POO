
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    
    public Atleta info_atleta_login(Atleta a1){
        Atleta a2 = new Atleta();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st =null;
        
        
        String sql = "SELECT nome, cpf, senha FROM Atleta";
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
            
            cpf = a1.getCpf();
            nome = a1.getNome();
            senha = a1.getSenha();
            while(rs.next()){
                if(cpf == rs.getString(2) && nome == rs.getString(1) && senha == rs.getString(3)){
                    a2.setNome(rs.getString(1));
                    a2.setSenha(rs.getString(3));
                    a2.setCpf(rs.getString(2));
                }
                else{
                    return a2 = null;
                }
                System.out.println("nome "+ rs.getString(1));
                System.out.println("cpf "+ rs.getString(2));
                System.out.println("senha "+ rs.getString(3));
            }
            
        } 
         catch(Exception ex){
            System.out.println(ex);
        }
        return a2;
    }
    

}
