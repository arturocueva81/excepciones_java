package com.krakedev.Taller.Excepciones;

public class ValidarContacto {
	
	public void validarTelefono(String telefono) throws IllegalArgumentException {
		if (telefono == null || 		//valida nulos
			telefono.length() != 10 ||  //valida longitud
		   !telefono.matches("\\d+")) { // valida si el teléfono no está compuesto solo de dígitos
            throw new IllegalArgumentException(
                "Teléfono incorrecto: " + telefono + 
                ", debe tener exactamente 10 dígitos."
            );
        }
		
	}

}
