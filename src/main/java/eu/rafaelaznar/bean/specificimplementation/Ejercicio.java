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
public class Ejercicio extends TableGenericBeanImplementation {

    private Integer id;
    private String añoEjercicio;

    public Ejercicio() {
    }

    public Ejercicio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAñoEjercicio() {
        return añoEjercicio;
    }

    public void setAñoEjercicio(String añoEjercicio) {
        this.añoEjercicio = añoEjercicio;
    }
    
}
