/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.bean.specificimplementation;

import eu.rafaelaznar.bean.genericimplementation.TableGenericBeanImplementation;


/**
 *
 * @author a023319520g
 */
public class Usuario extends TableGenericBeanImplementation  {

    private Integer id;
    private Integer idCenso;
    private String login;
    private String password;
    private Tipousuario idTipousuario;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCenso() {
        return idCenso;
    }

    public void setIdCenso(Integer idCenso) {
        this.idCenso = idCenso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Tipousuario getIdTipousuario() {
        return idTipousuario;
    }

    public void setIdTipousuario(Tipousuario idTipousuario) {
        this.idTipousuario = idTipousuario;
    }
    
    
    
}
