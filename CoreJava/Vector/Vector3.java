import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(12);
		v1.addElement(13);
		v1.addElement(14);
		v1.addElement(15);
		v1.addElement(16);
		v1.add(17);
		System.out.println(v1);
		//removeElement(obj)--remove element using element value by creating an object
		v1.removeElement(new Integer(13));
		System.out.println(v1);
		//removeElemntAt(index)-- to remove from particular index
		v1.removeElementAt(3);
		System.out.println(v1);


		Object o1[]=new Object[v1.size()];
		v1.copyInto(o1);

		for(int i=0;i<o1.length;i++) {
			System.out.println(o1[i]);
		}

		v1.removeAllElements();
		System.out.println(v1);

		Vector v2=new Vector();
		v2.addElement(134);
		v2.addElement(132);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		//this trimToSize() -
		v2.trimToSize();

		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println("size: "+v2.size());
		System.out.println("capacity: "+v2.capacity());


	}

}
