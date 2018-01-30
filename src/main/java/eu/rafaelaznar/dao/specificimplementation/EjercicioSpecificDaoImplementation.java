/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.dao.specificimplementation;

import eu.rafaelaznar.bean.helper.MetaBeanHelper;
import eu.rafaelaznar.dao.genericimplementation.TableGenericDaoImplementation;
import java.sql.Connection;

/**
 *
 * @author a023319520G
 */
public class EjercicioSpecificDaoImplementation extends TableGenericDaoImplementation {

    public EjercicioSpecificDaoImplementation(Connection oPooledConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        super("ejercicio", oPooledConnection, oPuserBean_security, strWhere);
    }
}
