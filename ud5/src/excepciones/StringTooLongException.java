package excepciones;

public class StringTooLongException extends Exception{
	
	
	private String cadena;
	private String mensaje;
	
	
	public StringTooLongException(String mensaje,String cadena) {
		super("mensaje:"+mensaje+"es  muy larga "+cadena);
	}



	public void setCadena(String cadena) {
		this.cadena=cadena;
	}
	
	
			
		
	
	}


