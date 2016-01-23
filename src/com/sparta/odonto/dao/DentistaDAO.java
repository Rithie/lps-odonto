/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.dao;

import com.sparta.odonto.db.ConnectionFactory;
import com.sparta.odonto.model.Dentista;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rithie7
 */
public class DentistaDAO {
    
    private Connection connection;
    
    public DentistaDAO() throws IOException{
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void addDentista(Dentista d){
        
    }
    
     public ArrayList<Dentista> list(){
    ArrayList<Dentista>  listaDentistas = new ArrayList<Dentista>();     
        
        String sql = "SELECT" +
                     "FROM lps_odonto.pessoa INNER JOIN lps_odonto.dentista" +
                     "ON lps_odonto.pessoa.id_pessoa = lps_odonto.dentista.pessoa_id_pessoa";
        try {          
           
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.executeQuery();                    
           ResultSet rs = stmt.getResultSet();
           
           if(rs != null){
               rs.first();
               do{
                   Dentista d = new Dentista();
                   d.setIdDentista(rs.getInt(1));
                   d.setIdPessoa(rs.getInt(2));
                   d.setCRO(3);
                   d.setReportsTo(rs.getInt(4));
                   d.setSalario(rs.getDouble(5));
                   listaDentistas.add(d);               
               }while(rs.next());
           
           }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
        return listaDentistas; 
        
    }
}
