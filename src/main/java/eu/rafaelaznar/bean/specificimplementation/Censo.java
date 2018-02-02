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
import eu.rafaelaznar.helper.constant.RegexConstants;
import java.util.Date;

/**
 *
 * @author a023319520g
 */
@MetaObjectBeanInterface(
        TableName = "censo",
        SingularDescription = "Censo",
        PluralDescription = "Censo de la Asociación",
        Icon = "fa fa-",
        Type = EnumHelper.SourceType.Table
)
public class Censo extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Dni",
            LongName = "Dni Completo",
            Description = "Documento Nacional de Identidad",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100
    )
    private String dni;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Nombre",
            LongName = "Nombre",
            Description = "Nombre del usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100
    )
    private String nombre;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "1er. Ap.",
            LongName = "Primer Apellido",
            Description = "Primer Apellido del usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100
    )
    private String primer_apellido;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "2º Ap.",
            LongName = "Segundo Apellido",
            Description = "Segundo Apellido del usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100
    )
    private String segundo_apellido;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Dom.",
            LongName = "Domicilio",
            Description = "Domicilio del usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100
    )
    private String domicilio;
    
        @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Loc.",
            LongName = "Localidad",
            Description = "Localidad del paciente",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100
    )
    private String localidad;
        
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Cod. Postal",
            LongName = "Código Postal",
            Description = "Código Postal del paciente",
            Type = EnumHelper.FieldType.Integer,
            Width = 3,
            MaxLength = 5
    )
    private String cod_postal;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Tel.",
            LongName = "Teléfono ",
            Description = "Teléfono del Usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 20
    )
    private String telefono;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "F.Na",
            LongName = "Fecha de nacimiento",
            Description = "Fecha de nacimiento del usuario",
            Type = EnumHelper.FieldType.Date
    )
    private Date fecha_nacimiento;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "F.alta",
            LongName = "Fecha de alta",
            Description = "Fecha de alta del usuario",
            Type = EnumHelper.FieldType.Date
    )
    private Date fecha_alta;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Edad",
            LongName = "Edad",
            Description = "Edad del Usuario",
            Type = EnumHelper.FieldType.Integer,
            Width = 1,
            MaxLength = 3
    )
    private String edad;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Año Rec.",
            LongName = "Año Recompensa ",
            Description = "Año Recompensa del Usuario",
            Type = EnumHelper.FieldType.Integer,
            Width = 4,
            MaxLength = 4
    )
    private String año_recompensa;

//    @Expose(serialize = false)
//    @MetaPropertyBeanInterface(
//            Type = EnumHelper.FieldType.ForeignId
//    )
    private Cargo id_cargo;
//     @Expose
//    @MetaPropertyBeanInterface(
//            ShortName = "Car.",
//            LongName = "Cargo",
//            Description = "Datos de la Cargo",
//            Type = EnumHelper.FieldType.ForeignObject,
//            IsRequired = true,
//            References = "cargo",
//            Width = 4
//    )
//    private MetaBeanHelper obj_cargo = null;
    
//    @Expose(serialize = false)
//    @MetaPropertyBeanInterface(
//            Type = EnumHelper.FieldType.ForeignId
//    )
    private Recompensa id_recompensa;
//     @Expose
//    @MetaPropertyBeanInterface(
//            ShortName = "Rec.",
//            LongName = "Recompensa",
//            Description = "Datos de las Recompensas",
//            Type = EnumHelper.FieldType.ForeignObject,
//            IsRequired = true,
//            References = "recompensa",
//            Width = 4
//    )
//    private MetaBeanHelper obj_recompesa = null;
    
//    @Expose(serialize = false)
//    @MetaPropertyBeanInterface(
//            Type = EnumHelper.FieldType.ForeignId
//    )
    private Usuario id_usuario;
//     @Expose
//    @MetaPropertyBeanInterface(
//            ShortName = "Usu.",
//            LongName = "Usuario",
//            Description = "Datos del Usuario",
//            Type = EnumHelper.FieldType.ForeignObject,
//            IsRequired = true,
//            References = "usuario",
//            Width = 4
//    )
//    private MetaBeanHelper obj_usuario = null;

    public Censo() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAño_recompensa() {
        return año_recompensa;
    }

    public void setAño_recompensa(String año_recompensa) {
        this.año_recompensa = año_recompensa;
    }

    public Cargo getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Cargo id_cargo) {
        this.id_cargo = id_cargo;
    }

    public Recompensa getId_recompensa() {
        return id_recompensa;
    }

    public void setId_recompensa(Recompensa id_recompensa) {
        this.id_recompensa = id_recompensa;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }
}