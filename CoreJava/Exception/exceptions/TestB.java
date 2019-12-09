package exceptions;

public class TestB {

	public static void main(String[] args) {
		System.out.println("main started");
		NestedTrycatch n1=new NestedTrycatch();
		n1.exception(0, "ramu");
		n1.exception(2, null);
		System.out.println("main ended");
	}

}
