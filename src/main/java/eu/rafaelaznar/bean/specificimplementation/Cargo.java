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
        TableName = "cargo",
        SingularDescription = "Cargo",
        PluralDescription = "Cargos",
        Icon = "fa fa-",
        Type = EnumHelper.SourceType.Table
)
public class Cargo extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Cargo",
            LongName = "Descripcion del Cargo",
            Description = "Descripcion del Cargo de los falleros",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
    )
    private String cargo;


    public Cargo() {
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}