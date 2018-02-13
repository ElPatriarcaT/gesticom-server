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

/**
 *
 * @author a023319520g
 */
@MetaObjectBeanInterface(
        TableName = "usuario",
        SingularDescription = "Usuario",
        PluralDescription = "Usuarios",
        Icon = "fa fa-user",
        Type = EnumHelper.SourceType.Table
)
public class Usuario extends TableGenericBeanImplementation {

    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_censo;
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Censo.",
            LongName = "Id Censo",
            Description = "Num. Correspondiente al Censo de la Asociación",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "censo"
    )
    private MetaBeanHelper obj_censo = null;

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Login",
            LongName = "Login",
            Description = "Login del usuario",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            IsForeignKeyDescriptor = true,
            Width = 3,
            MaxLength = 100
    )
    private String login;

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.Password
    )
    private String password;

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_tipousuario;
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Tipo Usu.",
            LongName = "Tipo usuario",
            Description = "Tipo de usuario",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "tipousuario",
            Width = 4
    )
    private MetaBeanHelper obj_tipousuario = null;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCenso() {
        return id_censo;
    }

    public void setIdCenso(Integer id_censo) {
        this.id_censo = id_censo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId_tipousuario() {
        return id_tipousuario;
    }

    public void setId_tipousuario(Integer id_tipousuario) {
        this.id_tipousuario = id_tipousuario;
    }

  
}
