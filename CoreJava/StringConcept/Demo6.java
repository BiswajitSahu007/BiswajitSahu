
public class Demo6 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("biswa");
		System.out.println(s1.hashCode());
		s1=s1.append("Babu");
		System.out.println(s1.hashCode());

	}

}
