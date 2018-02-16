/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.bean.specificimplementation;

import com.google.gson.annotations.Expose;
import eu.rafaelaznar.bean.genericimplementation.TableGenericBeanImplementation;
import eu.rafaelaznar.bean.helper.MetaBeanHelper;
import eu.rafaelaznar.bean.meta.publicinterface.MetaObjectBeanInterface;
import eu.rafaelaznar.bean.meta.publicinterface.MetaPropertyBeanInterface;
import eu.rafaelaznar.helper.EnumHelper;
import static eu.rafaelaznar.helper.EnumHelper.FieldType.Decimal;
import eu.rafaelaznar.helper.constant.RegexConstants;

/**
 *
 * @author a023319520g
 */
@MetaObjectBeanInterface(
        TableName = "cuotas",
        SingularDescription = "Cuota",
        PluralDescription = "Cuotas",
        Icon = "fa fa-chart-line",
        Type = EnumHelper.SourceType.Table
)
public class Cuotas extends TableGenericBeanImplementation {
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Cant. PT",
            LongName = "Cantidad Primer Trimestre",
            Description = "PCantidad Pagada en el Primer Trimestre",
            Type = EnumHelper.FieldType.Decimal,
            //RegexPattern = RegexConstants.,
            //RegexHelp = RegexConstants.capitalizedName_Help,
            MaxLength = 100,
            IsVisible = true
    )
    private Double cantidad_pt;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Cant. ST",
            LongName = "Cantidad Segundo Trimestre",
            Description = "PCantidad Pagada en el Segundo Trimestre",
            Type = EnumHelper.FieldType.Decimal,
            //RegexPattern = RegexConstants.,
            //RegexHelp = RegexConstants.capitalizedName_Help,
            MaxLength = 100,
            IsVisible = true
    )
    private Double cantidad_st;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Cant. TT",
            LongName = "Cantidad Tercer Trimestre",
            Description = "PCantidad Pagada en el Tercer Trimestre",
            Type = EnumHelper.FieldType.Decimal,
            //RegexPattern = RegexConstants.,
            //RegexHelp = RegexConstants.capitalizedName_Help,
            MaxLength = 100,
            IsVisible = true
    )
    private Double cantidad_tt;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Cant. CT",
            LongName = "Cantidad Cuarto Trimestre",
            Description = "PCantidad Pagada en el Cuarto Trimestre",
            Type = EnumHelper.FieldType.Decimal,
            //RegexPattern = RegexConstants.,
            //RegexHelp = RegexConstants.capitalizedName_Help,
            MaxLength = 100,
            IsVisible = true
    )
    private Double cantidad_ct;
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_censo;
     @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Cen.",
            LongName = "Censo",
            Description = "Datos del Censo",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "censo",
            Width = 4,
            IsVisible = true
    )
    private MetaBeanHelper obj_censo = null;
    
     @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_ejercicio;
      @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Eje.",
            LongName = "Ejercicio",
            Description = "Datos del Ejercicio",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "ejercicio",
            Width = 4,
            IsVisible = true
    )
    private MetaBeanHelper obj_ejercicio = null;
      
    
    

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
