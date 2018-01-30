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
public class Recompensa extends TableGenericBeanImplementation {

    private Integer id;
    private String recompensa;

    public Recompensa() {
    }

    public Recompensa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

}
