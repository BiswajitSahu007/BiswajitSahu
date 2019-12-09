package exceptionpropagation;

public class C {
	public static void m() {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException a) {
			System.out.println("c class"+a.getMessage());	
			throw a;
		}
		  
	
		   
	}
}
