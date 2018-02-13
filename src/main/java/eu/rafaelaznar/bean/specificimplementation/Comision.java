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
import eu.rafaelaznar.helper.constant.RegexConstants;

/**
 *
 * @author a023319520g
 */
@MetaObjectBeanInterface(
        TableName = "comision",
        SingularDescription = "Comision",
        PluralDescription = "Comisión o Asociación",
        Icon = "fa fa-building",
        Type = EnumHelper.SourceType.Table
)
public class Comision extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Nom.",
            LongName = "Nombre",
            Description = "Nombre de la Comision",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedName,
            RegexHelp = RegexConstants.capitalizedName_Help,
            IsForeignKeyDescriptor = true,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
    )
    private String nombre;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Dir.",
            LongName = "Direccion",
            Description = "Direccion de la Comision",
            Type = EnumHelper.FieldType.String,
            IsRequired = false,
            RegexPattern = RegexConstants.direction,
            RegexHelp = RegexConstants.directionSentence_Help,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
    )
    private String direccion;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Tel.",
            LongName = "Teléfono ",
            Description = "Teléfono del Usuario",
            Type = EnumHelper.FieldType.String,
            IsRequired = false,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 20,
            IsVisible = true
    )
    private String telefono;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Email",
            LongName = "Correo electrónico",
            Description = "Correo electrónico del usuario",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.email,
            RegexHelp = RegexConstants.email_Help,
            MaxLength = 50,
            IsVisible = true
    )
    private String email;

    public Comision() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
