/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.bean.specificimplementation;

import eu.rafaelaznar.bean.genericimplementation.TableGenericBeanImplementation;
import eu.rafaelaznar.bean.meta.publicinterface.MetaObjectBeanInterface;
import eu.rafaelaznar.helper.EnumHelper;

/**
 *
 * @author a023319520g
 */
@MetaObjectBeanInterface(
        TableName = "cuotas",
        SingularDescription = "Cuota",
        PluralDescription = "Cuotas",
        Icon = "fa fa-",
        Type = EnumHelper.SourceType.Table
)
public class Cuotas extends TableGenericBeanImplementation {
    
    private Double cantidad_pt;
    private Double cantidad_st;
    private Double cantidad_tt;
    private Double cantidad_ct;
    private Integer id_censo;
    private Integer id_ejercicio;

    public Cuotas() {
    }

    public Double getCantidad_pt() {
        return cantidad_pt;
    }

    public void setCantidad_pt(Double cantidad_pt) {
        this.cantidad_pt = cantidad_pt;
    }

    public Double getCantidad_st() {
        return cantidad_st;
    }

    public void setCantidad_st(Double cantidad_st) {
        this.cantidad_st = cantidad_st;
    }

    public Double getCantidad_tt() {
        return cantidad_tt;
    }

    public void setCantidad_tt(Double cantidad_tt) {
        this.cantidad_tt = cantidad_tt;
    }

    public Double getCantidad_ct() {
        return cantidad_ct;
    }

    public void setCantidad_ct(Double cantidad_ct) {
        this.cantidad_ct = cantidad_ct;
    }

    

    public Integer getId_censo() {
        return id_censo;
    }

    public void setId_censo(Integer id_censo) {
        this.id_censo = id_censo;
    }

    public Integer getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(Integer id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    
    
}
