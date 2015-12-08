/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Esta é a classe que servirá de ponto de partida para a applicação.
 * @author Rithie7
 */
public class OdontoApp extends JFrame{
    
    
	private JPanel contentPane;
	private JTextField lastNameTextField;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable table;

	private JPanel panel_1;
	private JButton btnAddEmployee;
	private JButton btnUpdateEmployee;
	private JButton viewHistoryButton;
	
	private int userId;
	private JPanel topPanel;
	private JPanel searchPanel;
	private JLabel lblLoggedIn;
	private JLabel loggedInUserLabel;
    
        public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

                                    OdontoApp frame = new OdontoApp();
                                    
                                    frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
        public OdontoApp(String firstName, String LastName){}
        public OdontoApp(){
                setTitle("JR Clinica Odontologica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 300);
                JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		topPanel = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) topPanel.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel.add(topPanel, BorderLayout.NORTH);
		
		lblLoggedIn = new JLabel("Logged In:");
		topPanel.add(lblLoggedIn);
		
		loggedInUserLabel = new JLabel("New label");
		topPanel.add(loggedInUserLabel);
       }
       public void setLoggedInUserName(String firstName, String lastName) {
		loggedInUserLabel.setText(firstName + " " + lastName);
       }
}
