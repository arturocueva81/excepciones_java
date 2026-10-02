package com.krakedev.Taller.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	
	//Parte 1 — Escribir en archivo
	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);

    public void guardar(String nombre, String telefono) {

        FileWriter fw = null; 

        try {
            fw = new FileWriter("src/main/resources/contactos.txt", true);
            fw.write(nombre + "," + telefono + "\n");
            log.info("Contacto guardado: ", nombre, telefono);

        } catch (IOException e) {
            log.error("Error al guardar: ", e.getMessage());

        } finally {
            if (fw != null) {
                try {
                    fw.close();
                    log.info("Archivo cerrado correctamente.");
                } catch (IOException e) {
                    log.error("Error al cerrar el archivo: ", e.getMessage());
                }
            }
        }
    }

}
