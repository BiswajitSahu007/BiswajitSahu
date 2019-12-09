package methodOverloading;

public class TesyCalculator {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int r1=c1.add(12);
		System.out.println("result1 is: "+r1);
		
		int r2=c1.add(12,78);
		System.out.println("result2 is: "+r2);
		
		double r3=c1.add(12.89);
		System.out.println("result3 is: "+r3);
		
		
		Calculator.multiply(11);
		Calculator.multiply(100, 200);
		Calculator.multiply(23.21);
	}

}
