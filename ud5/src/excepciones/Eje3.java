package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eje3 {

	public static void main(String[] args) {
		
		boolean pedir = true;
		double dato;
		int cont = 0;
		double suma = 0;
		
		do {
			
			try {
				Scanner t = new Scanner(System.in);
				System.out.print("Valor: ");
				dato = t.nextDouble();
				
				//esta l�nea se ejecuta si todo va bien
				//pedir = false;
				cont++;
				if(cont < 6) {
					//sumo
					suma += dato;
				}else {
					pedir = false;
				}
			}catch(InputMismatchException e) {
				//System.err.println("Introduce un n�mero.");
				pedir = false;
			}
			
		}while(pedir);
		//}while(pedir == true);
		System.out.println("La suma es "+suma);
		System.out.println("Salgo de la aplicaci�n.");
	}
	
}
