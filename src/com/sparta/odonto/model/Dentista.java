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
    private int idPessoaPessoa;
    private int reportsTo;

    public int getIdPessoaPessoa() {
        return idPessoaPessoa;
    }

    public void setIdPessoaPessoa(int idPessoaPessoa) {
        this.idPessoaPessoa = idPessoaPessoa;
    }
    
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

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefone() {
        return super.getTelefone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSexo() {
        return super.getSexo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        super.setDataNascimento(dataNascimento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDataNascimento() {
        return super.getDataNascimento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return super.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRg(String rg) {
        super.setRg(rg); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRg() {
        return super.getRg(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCpf() {
        return super.getCpf(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSobrenome(String sobrenome) {
        super.setSobrenome(sobrenome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSobrenome() {
        return super.getSobrenome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIdEndereco(Integer idEndereco) {
        super.setIdEndereco(idEndereco); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getIdEndereco() {
        return super.getIdEndereco(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIdPessoa(Integer idPessoa) {
        super.setIdPessoa(idPessoa); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getIdPessoa() {
        return super.getIdPessoa(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
