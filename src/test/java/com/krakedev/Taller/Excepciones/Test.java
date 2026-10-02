package com.krakedev.Taller.Excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Test {
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			log.info("\n Resultado: "+c);
		}catch(Exception e) {
			log.info("\n Error matematico"+e.getMessage());
			
		}
		
	}
}
