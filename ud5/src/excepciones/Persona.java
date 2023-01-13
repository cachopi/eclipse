package excepciones;

public class Persona {



	private String nombre;
	private int edad;
	
	
	public  Persona(String nombre, int edad) throws EdadExcepcion {
		this.nombre= nombre;
		this.setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws EdadExcepcion {//metodo edad con excepcion throw
		
		if (edad<0)
			throw new EdadExcepcion();
		else 
			this.edad=edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
