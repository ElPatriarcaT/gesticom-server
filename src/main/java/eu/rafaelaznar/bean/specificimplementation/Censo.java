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
        Icon = "fa fa-address-card",
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
            MaxLength = 100,
            IsVisible = true
    )
    private String dni;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Nombre",
            LongName = "Nombre",
            Description = "Nombre del usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100,
            IsForeignKeyDescriptor = true,
            IsVisible = true
    )
    private String nombre;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "1er. Ap.",
            LongName = "Primer Apellido",
            Description = "Primer Apellido del usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
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
            MaxLength = 100,
            IsVisible = true
    )
    private String domicilio;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Loc.",
            LongName = "Localidad",
            Description = "Localidad del paciente",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 100,
            IsVisible = false
    )
    private String localidad;
        
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Cod. Postal",
            LongName = "Código Postal",
            Description = "Código Postal del paciente",
            Type = EnumHelper.FieldType.Integer,
            Width = 3,
            MaxLength = 5,
            IsVisible = false
    )
    private String cod_postal;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Tel.",
            LongName = "Teléfono ",
            Description = "Teléfono del Usuario",
            Type = EnumHelper.FieldType.String,
            Width = 3,
            MaxLength = 20,
            IsVisible = false
    )
    private String telefono;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "F.Na",
            LongName = "Fecha de nacimiento",
            Description = "Fecha de nacimiento del usuario",
            Type = EnumHelper.FieldType.Date,
            IsVisible = false
    )
    private Date fecha_nacimiento;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "F.alta",
            LongName = "Fecha de alta",
            Description = "Fecha de alta del usuario",
            Type = EnumHelper.FieldType.Date,
            IsVisible = false
    )
    private Date fecha_alta;
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Edad",
            LongName = "Edad",
            Description = "Edad del Usuario",
            Type = EnumHelper.FieldType.Integer,
            Width = 1,
            MaxLength = 3,
            IsVisible = false
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

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_cargo;
     @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Car.",
            LongName = "Cargo",
            Description = "Datos de la Cargo",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "cargo",
            Width = 4,
            IsVisible = false
    )
    private MetaBeanHelper obj_cargo = null;
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_recompensa;
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Rec.",
            LongName = "Recompensa",
            Description = "Datos de las Recompensas",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "recompensa",
            Width = 4
    )
    private MetaBeanHelper obj_recompesa = null;
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_usuario;
     @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Usu.",
            LongName = "Usuario",
            Description = "Datos del Usuario",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "usuario",
            Width = 4
    )
    private MetaBeanHelper obj_usuario = null;

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

    public Integer getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

    public MetaBeanHelper getObj_cargo() {
        return obj_cargo;
    }

    public void setObj_cargo(MetaBeanHelper obj_cargo) {
        this.obj_cargo = obj_cargo;
    }

    public Integer getId_recompensa() {
        return id_recompensa;
    }

    public void setId_recompensa(Integer id_recompensa) {
        this.id_recompensa = id_recompensa;
    }

    public MetaBeanHelper getObj_recompesa() {
        return obj_recompesa;
    }

    public void setObj_recompesa(MetaBeanHelper obj_recompesa) {
        this.obj_recompesa = obj_recompesa;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public MetaBeanHelper getObj_usuario() {
        return obj_usuario;
    }

    public void setObj_usuario(MetaBeanHelper obj_usuario) {
        this.obj_usuario = obj_usuario;
    }

    
}