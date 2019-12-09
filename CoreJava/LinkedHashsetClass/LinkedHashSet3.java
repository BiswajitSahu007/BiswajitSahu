import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {

	public static void main(String[] args) {
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(23,"Biswajit"));
		l1.add(new Employee(24,"rohit"));
		l1.add(new Employee(23,"Biswajit"));
		
		Iterator<Employee> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
