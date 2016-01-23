/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.controllers;

import com.sparta.odonto.model.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rithie7
 */
public class GridCtrl {
    
    private JTable grid; 
    
    public GridCtrl(JTable g){
        this.grid = g;
        //setGridProps();
    }
    
    private static Object[] getLine(Pessoa p) throws SQLException {
         Object[] obj = new Object[10];
            obj[0] = p.getIdPessoa();
            obj[1] = p.getIdEndereco();
            obj[2] = p.getNome();
            obj[3] = p.getSobrenome();
            obj[4] = p.getCpf();
            obj[5] = p.getRg();
            obj[6] = p.getEmail();
            obj[7] = p.getDataNascimento();
            obj[8] = p.getSexo();
            obj[9] = p.getTelefone();
        
        return obj;
    }
    //seta colunas do grid
    public void setGridProps( ArrayList<Pessoa> pessoaList) throws SQLException{
        
        DefaultTableModel tModel = resetTable(grid);
        
        tModel.addColumn("Id");
        tModel.addColumn("Endereço");
        tModel.addColumn("Nome");
        tModel.addColumn("Sobrenome");
        tModel.addColumn("CPF");
        tModel.addColumn("RG");
        tModel.addColumn("Email");
        tModel.addColumn("Data Nascimento");
        tModel.addColumn("Sexo");
        tModel.addColumn("Telefone");
            
   
        
        // varre o array add objeto à linha
        for(Pessoa p: pessoaList){
            System.out.println("a");
            Object[] ob;
            ob = GridCtrl.getLine(p);
            tModel.addRow(ob);
        }

        this.grid.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
    }
    
    /*
     * Copied from Jose's Rui code.
    */
    public static DefaultTableModel resetTable(JTable grd) {
        grd.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        DefaultTableModel tModel = new DefaultTableModel();
        tModel = (DefaultTableModel) grd.getModel();
        tModel.setRowCount(0);
        tModel.setColumnCount(0);

        return tModel;
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
       
        int selectedRow;

        //ListSelectionModel rowSM = grid.getSelectionModel();
        
        int row = grid.getSelectedRow();
int column = grid.getColumnCount();
for(int i = 0; i < column; i++) {
    System.out.println(grid.getValueAt(row, i));
}

 
    

        
    } 
    
    
    
}
