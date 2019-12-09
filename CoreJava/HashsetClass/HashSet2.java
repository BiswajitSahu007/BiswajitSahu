import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Student> h1=new HashSet<Student>();
		HashSet<Student> h2=new HashSet<Student>();

		h1.add(new Student("biswajit",23));
		h2.add(new Student("biswajit",23));

		for (Student student : h1) {
			System.out.println(student.name +" age is "+student.age);
			System.out.println(student.hashCode());

		}
	}

}
