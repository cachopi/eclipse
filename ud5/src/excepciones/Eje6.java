package excepciones;

import java.util.Scanner;

public class Eje6 {
public static void main(String[] args) throws StringTooLongException {
	
	String cadena;
	Scanner key = new Scanner(System.in);
	System.out.println("introduce una cadena ");
	 cadena= key.nextLine();
	 
	
while(compruebaLongitud(cadena)>=2)	{
try {

	System.out.println("introduce una cadena ");
	 cadena= key.nextLine();
	
	
	
	}

	 catch (Exception e) {
	// TODO: handle exception
		 System.out.println(e.getMessage());
	
}	
System.out.println("fin del programa");

}

}

public  static int compruebaLongitud(String cadena,String mensaje) throws StringTooLongException  {
	int i;
	for ( i = 0; i < cadena.length(); i++) {
		if (i>=2) {
		
		throw new StringTooLongException(String cadena,String mensaje);
		}	
	}
	return i;
}//
}//


