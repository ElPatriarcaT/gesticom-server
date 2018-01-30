/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.service.specificimplementation;

import eu.rafaelaznar.service.genericimplementation.TableGenericServiceImplementation;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author a023319520G
 */
public class ComisionSpecificServiceImplementation extends TableGenericServiceImplementation {

    public ComisionSpecificServiceImplementation(HttpServletRequest request) {
        super(request);
    }
}
