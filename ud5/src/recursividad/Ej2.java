package recursividad;

public class Ej2 {
	
		 public static void main(String[] args) {
		     
		   
		        int num = 6;
		      
		         System.out.println();
		         int r = factorial(num);
		        System.out.println("El factorial de " + num + " es= " + r);
		    }
		     
		    public static int factorial(int num){
		    	
		    	
		        if(num == 1){
		        	//parada
		            return 1;
		        }
		        else {
		        	//recursivo
		            return num * factorial(num-1);
		        }
		    }
		}