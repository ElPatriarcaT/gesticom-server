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
        TableName = "tipousuario",
        SingularDescription = "Tipo Usu.",
        PluralDescription = "Tipo de Usuario",
        Icon = "fa fa-",
        Type = EnumHelper.SourceType.Table
)
public class Tipousuario extends TableGenericBeanImplementation  {
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Desc.",
            LongName = "Descripcion del Tipo Usu.",
            Description = "Descripcion del Tipo Usuario",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            IsForeignKeyDescriptor = true,
            Width = 3,
            MaxLength = 100
    )
    private String descripcion;

    public Tipousuario() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
