/**
 * 
 */
package com.synergyj.cursos.webservices.sib;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.sei.TimeService;

/**
 * @author Orochimaru
 *
 */
//clase lista para atender un mensaje de SOAP
//va el paquete donde esta el sei, el nombre calificado
@WebService(endpointInterface="com.synergyj.cursos.webservices.sei.TimeService")
public class TimeServiceImpl implements TimeService {
	private static final Logger logger = LoggerFactory.getLogger(TimeServiceImpl.class);
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	/* (non-Javadoc)
	 * @see com.synergyj.cursos.webservices.sei.TimeService#getDateAsLong()
	 */
	public long getDateAsLong() {
		
		Date fecha = new Date();
		logger.debug("Obteniendo fecha como long " + fecha.getTime());
		fecha.getTime();
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.synergyj.cursos.webservices.sei.TimeService#getDateAsString()
	 */
	public String getDateAsString() {
		Date fecha = new Date();		
		logger.debug("Obteniendo fecha como String " + formato.format(fecha));		
		return formato.format(fecha);
	}

}