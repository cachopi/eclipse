package recursividad;

public class Ej1 {
	public static void main(String[] args) {
		int num =1;
		int resultado=sumaRecursiva(num);
	System.out.println(resultado);	
	}

	private static int sumaRecursiva(int num) {
		// TODO Auto-generated method stub
		int r=0;
		if(num==10)
			r=num;
		else {
			System.out.println("num :"+num+"r="+r);
			r=num+sumaRecursiva(num+1);
		System.out.println("num :"+num+"r="+r);
		}
		return r;
		
	}

}
