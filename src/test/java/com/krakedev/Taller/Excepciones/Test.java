package com.krakedev.Taller.Excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Test {
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
//		  GuardarContacto guardar = new GuardarContacto();
//        LeerContacto leer = new LeerContacto();
//		
//		  log.info("\n* Guardar Contactos");
//        guardar.guardar("Arturo", "0981234567");
//        guardar.guardar("Juan", "0991111222");
//        
//        log.info("\n* Leer Contactos");
//        leer.leer();
		
        GuardarContacto guardar = new GuardarContacto();
        LeerContacto leer = new LeerContacto();
        ValidarContacto validar = new ValidarContacto();
        
        log.info("\n* PRUEBA 1 - Telefono: '123'");
        try {
            validar.validarTelefono("123"); 
            guardar.guardar("Arturo", "123");     
        } catch (IllegalArgumentException e) {
            log.error("Excepcion capturada: {}", e.getMessage());
        }
        
        log.info("\n* PRUEBA 2 - Telefono: '0981234567' ");
        try {
            validar.validarTelefono("0981234567");   
            guardar.guardar("Arturo", "0981234567"); 
            leer.leer();
        } catch (IllegalArgumentException e) {
            log.error("Excepcion capturada: {}", e.getMessage());
        }
		
	}
}
