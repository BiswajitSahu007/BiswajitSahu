
public class Demo1 {

	public static void main(String[] args) {
		String s1="john";
		System.out.println("s1 hashcode is: "+s1.hashCode());
		String s2="Mickle";
		s1="Pinky";
		String s3="john";
		System.out.println("s1 hashcode is : "+s1.hashCode());
		
		System.out.println("s3 hashcode is : "+s3.hashCode());
	}

}
