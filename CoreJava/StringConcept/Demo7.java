
public class Demo7 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("biswa");
		System.out.println(s1.hashCode());
		s1=s1.append("Babu");
		System.out.println(s1.hashCode());
	}

}
