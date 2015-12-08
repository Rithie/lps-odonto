/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Rithie7
 */
public class UserLoginDialog extends JDialog{
    
    private JTextField emailField;
    private JPasswordField passwordField;
    private final JPanel contentPanel = new JPanel();
    
    /**
     * Create the dialog.
    **/
	public UserLoginDialog() {
        	
                addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			    System.exit(0);
		}
		});
		setTitle("User Login");
		setBounds(100, 100, 450, 168);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
//		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
//				FormFactory.RELATED_GAP_COLSPEC,
//				FormFactory.DEFAULT_COLSPEC,
//				FormFactory.RELATED_GAP_COLSPEC,
//				ColumnSpec.decode("default:grow"),},
//			new RowSpec[] {
//				FormFactory.RELATED_GAP_ROWSPEC,
//				FormFactory.DEFAULT_ROWSPEC,
//				FormFactory.RELATED_GAP_ROWSPEC,
//				FormFactory.DEFAULT_ROWSPEC,}));
//		{
//			JLabel lblUser = new JLabel("User");
//			contentPanel.add(lblUser, "2, 2, right, default");
//		}
//		{
//			userComboBox = new JComboBox();
//			contentPanel.add(userComboBox, "4, 2, fill, default");
//		}
		{
			JLabel lblPassword = new JLabel("Password");
			contentPanel.add(lblPassword, "2, 4, right, default");
		}
		{
			passwordField = new JPasswordField();
			contentPanel.add(passwordField, "4, 4, fill, default");
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						// get the user id
//						if (userComboBox.getSelectedIndex() == -1) {						
//							JOptionPane.showMessageDialog(UserLoginDialog.this, "You must select a user.", "Error", JOptionPane.ERROR_MESSAGE);				
//							return;
//						}
//						
//						//User theUser = (User) userComboBox.getSelectedItem();
						//int userId = theUser.getId();
						
						// get the password
						char[] password = passwordField.getPassword();
						
						// TO DO: you should add code here to check user id and password again db
						//		  Since this is a demo, we will not perform this check
						
						// hide the login window
						setVisible(false);
						dispose();
						
						// now show the main app window
						OdontoApp frame = new OdontoApp();
						//frame.setLoggedInUserName(theUser.getFirstName(), theUser.getLastName());
						
						frame.setVisible(true);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
        }
}
