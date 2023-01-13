package excepciones;

public class Eje5 {

	public static void main(String[] args) {
		
		Persona p1=null;
		Persona p2=null;
		
		try {
			p1 = new Persona("raul",5);
			
		
			
		}catch (EdadExcepcion e) {
			// TODO: handle exception
		//	e.printStackTrace();
			System.err.println(e.getMessage());
		}
		try {
			p2= new Persona("manuel",-25);
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
		try {
			p2.setEdad(2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("fin del programa ");
	}
}
