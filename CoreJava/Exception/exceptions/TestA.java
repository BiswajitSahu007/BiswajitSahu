package exceptions;

public class TestA {

	public static void main(String[] args) {
		TrywithMultipleCatch t1=new TrywithMultipleCatch();
		System.out.println("main started");
		t1.exception(0, "ramu");
		t1.exception(2, null);
	}

}
