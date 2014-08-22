/**
 * 
 */
package com.synergyj.cursos.webservices.lab1;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.sib.TimeServiceImpl;

/**
 * @author Orochimaru
 *
 */
public class TimeServicePublisher {
	private static final Logger logger = LoggerFactory.getLogger(TimeServicePublisher.class); 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url ="http://127.0.0.1:9876/timeService?wsdl";
		logger.debug("Publicando el web service en : " + url);
		Endpoint.publish(url, new TimeServiceImpl());
	}

}
