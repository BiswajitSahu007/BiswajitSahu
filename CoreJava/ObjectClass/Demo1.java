
public class Demo1 {
	public static void main(String[] args) {
		String s1="Boswa";
		String s2="Boswa";
		String s3=new String("Boswa");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}
}
