package exceptionpropagation;

public class B {
	public static void n() {
		try {
			C.m();
		} catch (ArithmeticException e) {
			System.out.println("b class"+e.getMessage());
		throw e;
		}
		
	}
}
