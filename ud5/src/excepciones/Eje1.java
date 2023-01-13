package excepciones;

import java.util.Scanner;

public class Eje1 {
public static void main(String[] args) {
	
	
	

	double n;
boolean pedir= true;
	int cont=0;
	
		do {
	
	try {
		Scanner key= new Scanner(System.in);
		
		 n = key.nextDouble();
		System.out.println(n);
		pedir=false;
		
		
	}catch ( Exception e) {
		
		
		System.out.println("no es un numero");
		cont++;
		 if(cont>=5) {
			 pedir=false;
			 System.out.println("fin del programa");
		 }
		
	}
		
	}while(pedir);
	
	

	//añado un comentario 
	
	
		
}}

