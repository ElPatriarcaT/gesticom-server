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
import java.util.Date;

/**
 *
 * @author a023319520g
 */
@MetaObjectBeanInterface(
        TableName = "eventos",
        SingularDescription = "Eventos",
        PluralDescription = "Eventos de la Asociación",
        Icon = "fa fa-",
        Type = EnumHelper.SourceType.Table
)
public class Eventos extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Desc.",
            LongName = "Descripcion del Evento",
            Description = "Descripcion del Evento",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
    )
    private String descripcion;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Fecha",
            LongName = "Fecha del Ev.",
            Description = "Fecha del Evento",
            Type = EnumHelper.FieldType.Date,
            RegexHelp = "una fecha correcta",
            IsRequired = true,
            IsVisible = true
    )
    private Date fecha;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Tit.",
            LongName = "Titulo del Evento",
            Description = "Titulo del Evento",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
    )
    private String titulo;

    public Eventos() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}
