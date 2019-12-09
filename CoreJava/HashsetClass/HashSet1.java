import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(12);
		hs.add(32);
		hs.add(42);
		hs.add(52);
		hs.add(null);
		for (Object object : hs) {
			System.out.println(object);
		}
		 
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.add("Pratyusha Deekshit");
		hs1.add("Aditi Rathore");
		hs1.add("Arpita Pattnaik");
		
		for (String string : hs1) {
			System.out.println(string);
			System.out.println(hs1.hashCode());
		}
	}
}
