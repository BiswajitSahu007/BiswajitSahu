package checkedexception;

public class ExceptionA {

	public static void main(String[] args) {
		System.out.println("main started");
		try {
			Class c1=Class.forName("checkedexception.Person");// if ("Person")
			System.out.println("class is found");
		} catch (ClassNotFoundException e) {
			System.out.println("class is not found");//this line executes.
		}
		System.out.println("main ended");
	}

}
