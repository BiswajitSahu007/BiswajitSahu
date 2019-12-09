//test clone
public class TestStudent1{

	public static void main(String[] args) throws CloneNotSupportedException {
		Student1 s1=new Student1("santu");
		Object o1=s1.clone();
		Student1 s2=(Student1)o1;
		System.out.println(s2.studName);
	}

}
