package excepciones;

public class AprimeraExplicacion{
	public static void main(String[] args) {
		int num =3, num2=0;
		
		try {
			int num4 = num/num2;
			num4=16;
			System.out.println(num4);
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("fin");
		
		}
}
		
		
		
		
		
	


