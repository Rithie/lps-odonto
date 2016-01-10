/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.odonto.model;

/**
 *
 * @author Rithie7
 * Essa classe registra todas as vezes que alguem loga no sistema.
 */
public class RegistraLog {
    
  private Integer idPessoa;
  private Integer idUsuarioSistema;
  private String  action;
  private String  actionDate;

  public RegistraLog() {
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Integer getIdUsuarioSistema() {
        return idUsuarioSistema;
    }

    public void setIdUsuarioSistema(Integer idUsuarioSistema) {
        this.idUsuarioSistema = idUsuarioSistema;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }
  
}
