/*
 * Copyright (c) 2017-2018 
 *
 * by Rafael Angel Aznar Aparici (rafaaznar at gmail dot com) & DAW students
 * 
 * GESANE: Free Open Source Health Management System
 *
 * Sources at:
 *                            https://github.com/rafaelaznar/gesane-server
 *                            https://github.com/rafaelaznar/gesane-client
 *                            https://github.com/rafaelaznar/gesane-database
 *
 * GESANE is distributed under the MIT License (MIT)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package eu.rafaelaznar.factory;

import eu.rafaelaznar.bean.helper.ReplyBeanHelper;
import eu.rafaelaznar.helper.EncodingHelper;
import eu.rafaelaznar.service.specificimplementation.*;
import javax.servlet.http.HttpServletRequest;

public class ServiceFactory {

    public static ReplyBeanHelper executeMethodService(HttpServletRequest oRequest) throws Exception {
        String ob = oRequest.getParameter("ob");
        String op = oRequest.getParameter("op");
        ReplyBeanHelper oReplyBean = null;
        switch (ob) {
            case "usuario":
                UsuarioSpecificServiceImplementation oUsuarioService = new UsuarioSpecificServiceImplementation(oRequest);
                switch (op) {

                    case "getallobjectsmetadata":
                        oReplyBean = oUsuarioService.getallobjectsmetadata();
                        break;
                    case "getmetadata":
                        oReplyBean = oUsuarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oUsuarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oUsuarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oUsuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oUsuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oUsuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oUsuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oUsuarioService.getCount();
                        break;
                    case "login":
                        oReplyBean = oUsuarioService.login();
                        break;
                    case "logout":
                        oReplyBean = oUsuarioService.logout();
                        break;
                    case "getsessionstatus":
                        oReplyBean = oUsuarioService.getSessionStatus();
                        break;
                    case "getcountx":
                        oReplyBean = oUsuarioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oUsuarioService.getPageX();
                        break;
                    case "setpass":
                        oReplyBean = oUsuarioService.setPass();
                        break;
                    case "getsessionuserlevel":
                        oReplyBean = oUsuarioService.getSessionUserLevel();
                        break;
                    case "checklogin":
                        oReplyBean = oUsuarioService.checklogin();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "tipousuario":
                TipousuarioSpecificServiceImplementation oTipousuarioService = new TipousuarioSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oTipousuarioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oTipousuarioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oTipousuarioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oTipousuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oTipousuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oTipousuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oTipousuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oTipousuarioService.getCount();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "cargo":
                CargoSpecificServiceImplementation oCargoService = new CargoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCargoService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCargoService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCargoService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCargoService.get();
                        break;
                    case "set":
                        oReplyBean = oCargoService.set();
                        break;
                    case "remove":
                        oReplyBean = oCargoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCargoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCargoService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCargoService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCargoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "comision":
                ComisionSpecificServiceImplementation oComisionService = new ComisionSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oComisionService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oComisionService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oComisionService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oComisionService.get();
                        break;
                    case "set":
                        oReplyBean = oComisionService.set();
                        break;
                    case "remove":
                        oReplyBean = oComisionService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oComisionService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oComisionService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oComisionService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oComisionService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "eventos":
                EventosSpecificServiceImplementation oEventosService = new EventosSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oEventosService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oEventosService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oEventosService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oEventosService.get();
                        break;
                    case "set":
                        oReplyBean = oEventosService.set();
                        break;
                    case "remove":
                        oReplyBean = oEventosService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oEventosService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oEventosService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oEventosService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oEventosService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "ejercicio":
                EjercicioSpecificServiceImplementation oEjercicioService = new EjercicioSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oEjercicioService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oEjercicioService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oEjercicioService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oEjercicioService.get();
                        break;
                    case "set":
                        oReplyBean = oEjercicioService.set();
                        break;
                    case "remove":
                        oReplyBean = oEjercicioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oEjercicioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oEjercicioService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oEjercicioService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oEjercicioService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "cuotas":
                CuotasSpecificServiceImplementation oCuotasService = new CuotasSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oCuotasService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oCuotasService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oCuotasService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oCuotasService.get();
                        break;
                    case "set":
                        oReplyBean = oCuotasService.set();
                        break;
                    case "remove":
                        oReplyBean = oCuotasService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oCuotasService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oCuotasService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oCuotasService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oCuotasService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            case "recompensa":
                RecompensaSpecificServiceImplementation oRecompensaService = new RecompensaSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "getmetadata":
                        oReplyBean = oRecompensaService.getMetaData();
                        break;
                    case "getobjectmetadata":
                        oReplyBean = oRecompensaService.getObjectMetaData();
                        break;
                    case "getpropertiesmetadata":
                        oReplyBean = oRecompensaService.getPropertiesMetaData();
                        break;
                    case "get":
                        oReplyBean = oRecompensaService.get();
                        break;
                    case "set":
                        oReplyBean = oRecompensaService.set();
                        break;
                    case "remove":
                        oReplyBean = oRecompensaService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oRecompensaService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oRecompensaService.getCount();
                        break;
                    case "getcountx":
                        oReplyBean = oRecompensaService.getCountX();
                        break;
                    case "getpagex":
                        oReplyBean = oRecompensaService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Operation not found : Please contact your administrator"));
                        break;
                }
                break;
            default:
                oReplyBean = new ReplyBeanHelper(500, EncodingHelper.quotate("Object not found : Please contact your administrator"));
                break;
        }
        return oReplyBean;
    }
}
