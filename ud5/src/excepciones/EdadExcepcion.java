package excepciones;

public class EdadExcepcion extends Exception {
	
	public EdadExcepcion() {
		super("no se puede tener una edad menor que 0");
	}
	

}
