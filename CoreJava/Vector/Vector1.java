import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(12);
		v1.add(13);
		v1.add(14);
		v1.add(15);
		System.out.println(v1);
		v1.remove(new Integer(14));//by this remove method we can remove element
		System.out.println(v1);
		v1.set(1, 20);//by set method we can modify 
		System.out.println(v1);
		System.out.println("---------for loop--------");
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
	}

}
