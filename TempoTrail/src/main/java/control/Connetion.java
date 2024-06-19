
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connetion {
    static Connection conn = null;
    static String url = "jdbc:postgresql://localhost:5432/TempoTrail_app";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "0123456";
    
    public static void main(String args[]){
        try{
            System.out.println("Carregando o driver...");
            Class.forName(driver);
            System.out.println("Driver carregado com sucesso!");
        }
        catch(Exception e){
            System.out.println("Falha no carregamento!");
        }

        try{
            System.out.println("Tentando conectar o BD...");
            conn = DriverManager.getConnection(url,user,senha);
            System.out.println("BD conectado com sucesso!");
        }
        catch(Exception e){
            System.out.println("Falha no carregamento!");
        }

    }

}
