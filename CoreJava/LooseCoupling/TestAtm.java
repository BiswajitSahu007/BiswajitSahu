
public class TestAtm {

	public static void main(String[] args) {
		Person p1=new Person();
		
		BankAtm b1=new BankAtm();
		Sbi s1=new Sbi();
		Iob i1=new Iob();
		
		p1.insertAtm(b1);
		p1.insertAtm(i1);
		p1.insertAtm(s1);

	}

}
