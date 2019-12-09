import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);//adding the elements inside a collection
		System.out.println(c1);
		
		c1.remove(12);//removing the elements inside a collection
		System.out.println(c1);
		
		System.out.println(c1.size());//finding the size of the collection
		System.out.println(c1.isEmpty());//checking the collection is empty or not
		
		c1.add(15);
		System.out.println(c1);
		System.out.println(c1.contains(c1));//checking if 15 object are there or not in the collection
	
		Collection c3=new ArrayList();
		c3.add(12);
		c3.add(56);
		
		Object a[]=c3.toArray();
		for (int i=0;i< a.length;i++) {
			System.out.println(a[i]);
		}
	
	
	
	
	
	}

}
