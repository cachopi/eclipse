package recursividad;

public class Ej3 {
	
	static String [] v = {"bulbasur","squirtle","mewtwo","sudowoodo","gengar"}; 
	
	public static void main(String[] args) {
		
		

		recorrer(4);
		
	}

	private static void recorrer(int p) {
		
	  if ( p==v.length+1) {
		  System.out.println(v[p]);
		
	}else {
		System.out.println(v[p]);
		recorrer(p-1);
	}
		
		
	}
	
	
	
	
	
	
}
