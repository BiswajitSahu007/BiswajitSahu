package exceptionpropagation;

public class A {
	public static  void o() {
		try {
			B.n();
		} catch (ArithmeticException e) {
		System.out.println("a class"+e.getMessage());
		
		}
		
	}
}
