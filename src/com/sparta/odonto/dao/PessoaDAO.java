/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.dao;

import com.sparta.odonto.db.ConnectionFactory;
import com.sparta.odonto.model.Dentista;
import com.sparta.odonto.model.Pessoa;
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
public class PessoaDAO {
    
    private Connection connection;
    
    public PessoaDAO() throws IOException{
        this.connection = new ConnectionFactory().getConnection();
    }
    public void add(Pessoa p){
         String sql = "INSERT INTO `lps_odonto`.`pessoa` (`nome`, `sobrenome`, `cpf`, `rg`, `email`, `data_nascimento`, `sexo`, `telefone`) VALUES ('?', '?', '?', '?', '?', '?', '?', '?');";
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getSobrenome());
            stmt.setString(3, p.getCpf());
            stmt.setString(4, p.getRg());
            stmt.setString(5, p.getEmail());
            stmt.setString(6, p.getDataNascimento());
            stmt.setString(7, p.getSexo());
            stmt.setString(8, p.getTelefone());
            //response = stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        
    }
    public void remove(){
        
    }
    public void update(){
        
    }
    
    public ArrayList<Pessoa> list(){
    ArrayList<Pessoa>  listaPessoa = new ArrayList<Pessoa>();     
        
        String sql = "SELECT * FROM lps_odonto.pessoa";
        try {          
           
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.executeQuery();                    
           ResultSet rs = stmt.getResultSet();
           
           if(rs != null){
               rs.first();
               do{
                   Pessoa p = new Pessoa();
                   p.setIdPessoa(rs.getInt(1));
                   p.setIdEndereco(rs.getInt(2));
                   p.setNome(rs.getString(3));
                   p.setSobrenome(rs.getString(4));
                   p.setCpf(rs.getString(5));
                   p.setRg(rs.getString(6));
                   p.setEmail(rs.getString(7));
                   p.setDataNascimento(rs.getString(8));
                   p.setSexo(rs.getString(9));
                   p.setTelefone(rs.getString(10));
                   listaPessoa.add(p);               
               }while(rs.next());
           
           }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
        return listaPessoa; 
        
    }
}
