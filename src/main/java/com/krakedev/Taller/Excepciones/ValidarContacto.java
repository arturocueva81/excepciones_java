package com.krakedev.Taller.Excepciones;

public class ValidarContacto {
	
	public void validarTelefono(String telefono) throws IllegalArgumentException {
		if (telefono == null || telefono.length() != 10 || !telefono.matches("\\d+")) {
            throw new IllegalArgumentException(
                "Teléfono incorrecto: " + telefono + ", debe tener exactamente 10 dígitos."
            );
        }
		
	}
	

}
