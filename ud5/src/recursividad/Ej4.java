package recursividad;

public class Ej4 {

	static String [] v = {"bulbasur","squirtle","mewtwo","sudowoodo","gengar"}; 
	
	public static void main(String[] args) {
		
		

	String pat="bulbasur";
		
		buscaRecursiva(0,pat);
		
		 
		
	}

	private static void buscaRecursiva(int p, String pat) {
		
	//	if (v[p].compareTo(pat)==0||p==v.length) { //falla por ordenarlo del rees
		if (p==v.length||v[p].compareTo(pat)==0) {
			if(p==v.length)
				System.out.println("no lo encuentra");
			else
			System.out.println("he encontrado "+pat+" en la posicion "+p+"/"+(v.length-1));
			
		} else {
		
			buscaRecursiva(p+1, pat);
		}
		
	}


		
	}
	

