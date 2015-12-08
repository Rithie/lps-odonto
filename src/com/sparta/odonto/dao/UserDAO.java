/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.dao;

import com.sparta.odonto.db.ConnectionFactory;
import com.sparta.odonto.model.User;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rithie7
 */
public class UserDAO {
    
    private Connection connection;
    
    public UserDAO() throws IOException {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void addUser( User theUser ) throws SQLException{
        
        
        PreparedStatement myStmt = null;
        
        try {
			// prepare statement
			myStmt = connection.prepareStatement("insert into employees"
					+ " (first_name, last_name, email, salary)"
					+ " values (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			// set params
			myStmt.setString(1, theUser.getFirstName());
			myStmt.setString(2, theUser.getLastName());
			myStmt.setString(3, theUser.getEmail());
			
			// execute SQL
			myStmt.executeUpdate();	
			
			// get the generated employee id
			ResultSet generatedKeys = myStmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				theUser.setId(generatedKeys.getInt(1));
			} else {
				throw new SQLException("Error generating key for employee");
			}
	            
			
		}
		finally {
			close(myStmt);
		}
    }
    
    public void updateUser( User theUser ){
        
    }
    public void deleteUser(){}
    
    private static void close(Connection myConn, Statement myStmt, ResultSet myRs)
			throws SQLException {

		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			
		}
		
		if (myConn != null) {
			myConn.close();
		}
    }

    private void close(Statement myStmt, ResultSet myRs) throws SQLException {
		close(null, myStmt, myRs);		
    }

    private void close(Statement myStmt) throws SQLException {
		close(null, myStmt, null);		
    }
	
    
}
