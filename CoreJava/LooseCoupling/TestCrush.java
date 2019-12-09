
public class TestCrush {

	public static void main(String[] args) {
		Crush c1=new Crush();
		
		BasicSet b1=new BasicSet();
		Oppo o1=new Oppo();
		OnePlus op=new OnePlus();
		Apple a1=new Apple();
		
		c1.receive(b1);
		c1.receive(o1);
		c1.receive(op);
		c1.receive(a1);
		c1.receive(null);
	}

}
