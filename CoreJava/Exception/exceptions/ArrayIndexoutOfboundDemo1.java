package exceptions;

public class ArrayIndexoutOfboundDemo1 {

	public static void main(String[] args) {
		System.out.println("main started");
		int [] a1=new int[2];
		a1[0]=5;
		a1[1]=41;
		try {
			a1[2]=2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("handeled");
		} 
		System.out.println("ended");
	}

}
