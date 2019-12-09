import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		
		//methods present in the list interface
		
		l1.add(0,12);
		l1.add(1,32);
		l1.add(2,82);
		l1.add(3,78);
		l1.add(4,32);
		System.out.println(l1);
		
		
		
		
		System.out.println(l1.indexOf(32));
		
		System.out.println(l1.lastIndexOf(32));
		System.out.println("--------------------get-----------");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		
		
	}

}
