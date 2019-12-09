import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	 public static void main(String[] args) {
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(26, "biswajit"));
		t1.add(new Student(24, "bulu"));
		t1.add(new Student(26, "biswajit"));

		Iterator<Student> itr=t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
