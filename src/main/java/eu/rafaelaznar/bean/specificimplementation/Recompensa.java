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
        TableName = "recompensa",
        SingularDescription = "Recompensa",
        PluralDescription = "Recompensas de la Asociación",
        Icon = "fa fa-",
        Type = EnumHelper.SourceType.Table
)
public class Recompensa extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Recomp.",
            LongName = "Descripcion de la Recompensa",
            Description = "Descripcion de la Recompensa de los falleros",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            IsForeignKeyDescriptor = true,
            Width = 3,
            MaxLength = 100
    )
    private String recompensa;

    public Recompensa() {
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

}
