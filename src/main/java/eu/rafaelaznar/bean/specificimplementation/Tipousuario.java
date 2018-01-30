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
public class Tipousuario extends TableGenericBeanImplementation  {

    private Integer id;
    private String descripcion;

    public Tipousuario() {
    }

    public Tipousuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
