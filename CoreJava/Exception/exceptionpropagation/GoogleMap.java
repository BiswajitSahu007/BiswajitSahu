package exceptionpropagation;

public class GoogleMap {
	void findlocation(String location) {
		try {
			System.out.println(location.length());
		} catch (NullPointerException e) {
			System.out.println("Google user plz provide location");
			throw e;
		}
		
	}
}
