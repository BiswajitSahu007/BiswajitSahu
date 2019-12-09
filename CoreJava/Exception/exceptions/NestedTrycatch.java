package exceptions;

import javax.crypto.AEADBadTagException;

public class NestedTrycatch {
	void exception(int a,String b) {
		try {
			System.out.println(10/0);
			try {
				System.out.println(500/a);
			} catch (NullPointerException a1) {
				System.out.println("dont deal with null");			}
		}catch (ArithmeticException n) {
			System.out.println("dont deal with  zero");
		}
		
		
	}
}
