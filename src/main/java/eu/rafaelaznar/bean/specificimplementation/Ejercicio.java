/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.bean.specificimplementation;

import com.google.gson.annotations.Expose;
import eu.rafaelaznar.bean.genericimplementation.TableGenericBeanImplementation;
import eu.rafaelaznar.bean.meta.publicinterface.MetaObjectBeanInterface;
import eu.rafaelaznar.bean.meta.publicinterface.MetaPropertyBeanInterface;
import eu.rafaelaznar.helper.EnumHelper;

/**
 *
 * @author a023319520g
 */
@MetaObjectBeanInterface(
        TableName = "ejercicio",
        SingularDescription = "Ejer.",
        PluralDescription = "Ejercicio",
        Icon = "fa fa-",
        Type = EnumHelper.SourceType.Table
)
public class Ejercicio extends TableGenericBeanImplementation {
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Año Rec.",
            LongName = "Año Recompensa ",
            Description = "Año Recompensa del Usuario",
            Type = EnumHelper.FieldType.Integer,
            RegexHelp = "Año Valido",
            IsRequired = false,
            IsForeignKeyDescriptor = false,
            Width = 4,
            MaxLength = 4
    )
    private String año_ejercicio;

    public Ejercicio() {
    }

    public String getAñoEjercicio() {
        return año_ejercicio;
    }

    public void setAñoEjercicio(String año_ejercicio) {
        this.año_ejercicio = año_ejercicio;
    }
    
}
