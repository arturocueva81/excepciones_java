package com.krakedev.Taller.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {
	
	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

    public void leer() {

        FileReader fr = null; 
        BufferedReader br = null;

        try {
            fr = new FileReader("src/main/resources/contactos.txt");
            br = new BufferedReader(fr);


            String linea;
            for (linea = br.readLine(); linea != null; linea = br.readLine()) {
                log.info("Contacto: {} ", linea);
            }

        } catch (FileNotFoundException e) {
            log.error("Archivo no encontrado: ", e.getMessage());

        } catch (IOException e) {
            log.error("Error de lectura: ", e.getMessage());

        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();

            } catch (IOException e) {
                log.error("Error al cerrar archivos:", e.getMessage());
            }
        }
    }

}
