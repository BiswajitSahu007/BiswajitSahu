package throwAndthrows;

public class IRCTC {
	void confirmTicket() {
		try {
			Class.forName("throwAndthrows.Paytm");
			System.out.println("ticket confirmed.");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket is not confirmed.");
		}
		
	}
}
