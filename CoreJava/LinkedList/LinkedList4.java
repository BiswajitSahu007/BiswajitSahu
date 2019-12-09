import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(16);
		l1.add(34);
		l1.add(78);
		System.out.println(l1);
		//push-add in the 0th index
		l1.push(100);
		System.out.println(l1);
		//pop-remove in the 0th index
		l1.pop();
		System.out.println(l1);
		//element-retrive the element in the oth index
		System.out.println(l1.element());
	}
}
