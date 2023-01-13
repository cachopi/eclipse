package excepciones;

import java.util.Scanner;

public class Eje2 {

	public static void main(String[] args) {
		
		
int n = 0 ;
String c;
int suma=0;

	boolean pedir;
		int cont=0;
		try {
		while(cont<6) {
			
			 suma =+n;
			n=numero();
			cont++;
		}
		}catch(Exception e) {
			
			System.out.println("no es un numero");
		}
		System.out.println("suma"+suma);
		
		
		//modifico otro fiechero 
		
		
		
		
	
	
	
	}
	

public static int numero() {
	Scanner key= new Scanner(System.in);
	int n;
	 n = key.nextInt();
	System.out.println(n);
	return n;
}
public static String cadena() {
	Scanner key= new Scanner(System.in);
	String c;
	c = key.next();
	return c;
	
}
}
