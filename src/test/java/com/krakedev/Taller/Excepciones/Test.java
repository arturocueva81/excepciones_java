package com.krakedev.Taller.Excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Test {
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		GuardarContacto guardar = new GuardarContacto();
        LeerContacto leer = new LeerContacto();
		
		log.info("\n* Guardar Contactos");
        guardar.guardar("Arturo", "0981234567");
        guardar.guardar("Juan", "0991111222");
        
        log.info("\n* Leer Contactos");
        leer.leer();
		
	}
}
