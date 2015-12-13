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
import static javax.sql.rowset.spi.SyncFactory.getLogger;
import javax.sql.rowset.spi.SyncFactoryException;

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
    
    public boolean validateUser(String login, String password, int userLevel){
        PreparedStatement myStmt = null;

        try {
				// prepare statement 
                                String sql = ("SELECT count(*) as userCount FROM aula.users where email = '" + login + "' and password = '" + password + "' and level = '" + userLevel + "' ");
                                System.out.println(sql);
                                myStmt = connection.prepareStatement(sql);
                                ResultSet rs = myStmt.executeQuery(sql);
                                
                                int userCount = 0;
                                
                                
                                while(rs.next()){
                                    userCount = rs.getInt("userCount");
                                    //userCount = rs.getInt("userLevel");
                                }
                                
                                if ( userCount > 0)
					{
						System.out.println( "teste " + userCount );
                                                return true;
					}
                                
				
				    
				

			} 
			catch (SQLException u) 
			{
				throw new RuntimeException(u);
			} 
			finally{}
        return false;
        
    }
    
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
