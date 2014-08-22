package com.synergyj.cursos.webservices.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
//TIPO DE DOCUMENTO
//WEBSERVICE
//pARA DECIDIR Q METODOS EXPONER ES CON WEBMETHODO, puede haber mas matodos sin ser webmethod
@WebService
@SOAPBinding(style=Style.RPC)
public interface TimeService {
	
	/**
	 * Obtiene la fecha como formato long
	 * */
	@WebMethod
	long getDateAsLong();
	
	/**
	 * Obtiene la fecha en formato String(dd/mm/yyyy)
	 * */
	@WebMethod
	String getDateAsString();
}