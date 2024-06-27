/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Treino;
import model.Atleta;

/**
 *
 * @author gleisson
 */
public class Treino_ctr {
    
    static String url = "jdbc:postgresql://localhost:5432/TempoTrail_app";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "0123456";
    
    public void salvar_treino_BD(Treino t1, Atleta a1){
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
            String sql = "INSERT INTO treino(id_treino_atleta, exercicios)VALUES(?,?);";
            ps = conn.prepareStatement(sql);
            ps.setString(1,a1.getCpf());
            ps.setString(2,t1.getExercicio());
            ps.execute();
            ps.close();
            conn.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public Treino Exibir_teino(Atleta a1){
        Treino t1 = new Treino();
        String i = a1.getCpf();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st =null;
        
        String sql = ("select exercicios from treino where treino.id_treino_atleta = '" + i + "'");
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,senha);
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                t1.setExercicio(rs.getString(1)); 
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return t1;
    }
}
