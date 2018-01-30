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
public class Cuotas extends TableGenericBeanImplementation {

    private Integer id;
    private Double cantidadPt;
    private Double cantidadSt;
    private Double cantidadTt;
    private Double cantidadCt;
    private Censo idCenso;
    private Ejercicio idEjercicio;

    public Cuotas() {
    }

    public Cuotas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCantidadPt() {
        return cantidadPt;
    }

    public void setCantidadPt(Double cantidadPt) {
        this.cantidadPt = cantidadPt;
    }

    public Double getCantidadSt() {
        return cantidadSt;
    }

    public void setCantidadSt(Double cantidadSt) {
        this.cantidadSt = cantidadSt;
    }

    public Double getCantidadTt() {
        return cantidadTt;
    }

    public void setCantidadTt(Double cantidadTt) {
        this.cantidadTt = cantidadTt;
    }

    public Double getCantidadCt() {
        return cantidadCt;
    }

    public void setCantidadCt(Double cantidadCt) {
        this.cantidadCt = cantidadCt;
    }

    public Censo getIdCenso() {
        return idCenso;
    }

    public void setIdCenso(Censo idCenso) {
        this.idCenso = idCenso;
    }

    public Ejercicio getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Ejercicio idEjercicio) {
        this.idEjercicio = idEjercicio;
    }
    
}
