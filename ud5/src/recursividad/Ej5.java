package recursividad;

public class Ej5 {		  
public static void main(String[] args) {
				
			
		  
		         int[][] m = {
		             {1, 2, 3},
		             {4, 5, 6},
		             {7, 8, 9}
		         };
		  
		        
		         recorrer(m, 0, 0);
		        
		     }
		  
		     public static void recorrer(int[][] m, int i, int j) {
		  
		    	 System.out.print(m[i][j]);
		      
		         if (i != m.length-1  ||j != m[i].length -1) {
		  
		            
		             if (j == m[i].length - 1) {
		               
		                 i++;
		               
		                 j = 0;
		            
		               
		             } else {
		              
		                 j++;
		             }
		  
		       
		             recorrer(m, i, j);
		  
		         }
		  
		     }}
		  
		 

