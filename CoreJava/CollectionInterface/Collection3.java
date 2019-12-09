import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {

	public static void main(String[] args) {
		Collection c4=new ArrayList();
		Collection c5=new ArrayList();
		
		c4.add(25);
		c4.add(23);
		c4.add(86);
		c4.add(89);
		System.out.println(c4);
		
		c5.add(25);
		c5.add(23);
		c5.add(12);
		c5.add(13);
		System.out.println(c5);
		
		c4.retainAll(c5);//elements present in both c4 and c5 will displayed by c4
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(c4.containsAll(c5));
		
		System.out.println(c4);
		c4.clear();
		System.out.println(c4);
		System.out.println(c4.size());

		
	}

}
