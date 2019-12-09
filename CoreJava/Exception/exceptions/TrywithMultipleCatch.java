package exceptions;

public class TrywithMultipleCatch {
	void exception(int a,String b) {
		try {
			System.out.println(500/a);
			System.out.println(b.length());
		} catch (ArithmeticException e) {
			System.out.println("dont deal with zero");
		}catch (NullPointerException n) {
			System.out.println("dont deal with  null");
		}
		
		
	}
}
