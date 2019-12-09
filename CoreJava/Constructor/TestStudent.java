
public class TestStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("student name is :"+s1.studName);
		System.out.println("student age is:"+s1.studAge);
		Student s2=new Student("Lipsa", 23);
		System.out.println("student name is :"+s2.studName);
		System.out.println("student age is:"+s2.studAge);
	}
}
