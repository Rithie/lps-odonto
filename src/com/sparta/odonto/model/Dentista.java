/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.model;

import java.util.ArrayList;

/**
 *
 * @author Rithie7
 */
/**
 * 
 */
public class Dentista extends Pessoa {

    /**
     * Default constructor
     */
    public Dentista() {
    }

    /**
     * 
     */
    private int CRO;
    private Double salario;
    private int idDentista;
    private int idPessoa;
    private int reportsTo;

    public int getCRO() {
        return CRO;
    }

    public void setCRO(int CRO) {
        this.CRO = CRO;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getIdDentista() {
        return idDentista;
    }

    public void setIdDentista(int idDentista) {
        this.idDentista = idDentista;
    }

    /**
     *
     * @return
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }
  


    /**
     * @return
     */
    private ArrayList visualizaListaDeDentistas() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    private boolean adicionaNovoDentista() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private boolean removeDentista() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private ArrayList visualizaEstoque() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    private boolean adicionaProdutoNoEstoque() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private boolean removeProdutoNoEstoque() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private boolean removeEquipamento() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private boolean adicionaNovoEquipamento() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private ArrayList visualizaListaDeEquipamentos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    private boolean removeFaturamento() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private boolean adicionaNovoFaturamento() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private ArrayList visualizaFaturamento() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    private boolean removePaciente() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private boolean adicionaNovoPaciente() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private ArrayList visualizaListaDePacientes() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    private boolean removeTratamento() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private boolean adicionaNovoTratamento() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    private ArrayList visualizaListaDeTratamentos() {
        // TODO implement here
        return null;
    }

}
