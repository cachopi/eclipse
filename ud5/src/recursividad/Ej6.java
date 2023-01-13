package recursividad;

public class Ej6 {

	public static void main(String[] args) {
		int num=5;
		fibo(num);
     
	}

	private static void fibo(int num) {
		if(num==0) {
			return 0}
		else if (num==1) {
			return 1}
			else  {
			return fibo(num-1)+fibo(num-2)
		
		}
		
	}
}
