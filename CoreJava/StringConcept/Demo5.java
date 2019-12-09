
public class Demo5 {

	public static void main(String[] args) {
		String s1=new String("biswa");
		s1=new String("bulu");
		System.out.println(s1.hashCode());
		s1=s1.concat("babu");
		System.out.println(s1.hashCode());

	}

}
