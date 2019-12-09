package exceptionpropagation;

public class Ola {
	GoogleMap g1;

	public Ola(GoogleMap g1) {
		super();
		this.g1 = g1;
	}
	public void find(String loc) {
		try {
			g1.findlocation(loc);
		} catch (NullPointerException e) {
			System.out.println("Ola user plz provide the location");
		}
		
	}
}
