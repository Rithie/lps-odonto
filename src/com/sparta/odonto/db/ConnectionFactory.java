/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Rithie7
 */
public class ConnectionFactory {
    
    private Connection myConn;
    
    public Connection getConnection() throws IOException {
        try {
            
            // get db properties
            Properties props = new Properties();
            //TODO: Colocar relative path
            props.load(new FileInputStream("/Users/Rithie7/NetBeansProjects/lps-odonto"));
		
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            String dburl = props.getProperty("dburl");
		
            // connect to database
            myConn = DriverManager.getConnection(dburl, user, password);
		
            System.out.println("DB connection successful to: " + dburl);
            return myConn;
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
    
}
