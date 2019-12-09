import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(4);
		l1.add(45);
		l1.add(23);
		System.out.println(l1);
		System.out.println("-----addFirst() and addLast()----");
		l1.addFirst(12);
		l1.addLast(100);
		System.out.println(l1);
		System.out.println("------remove()-----");
		l1.remove();
		System.out.println(l1);
		System.out.println("------removeFirst() and removeLast()---");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(20);
		l2.add(40);
		l2.add(20);
		l2.add(50);
		System.out.println(l2);
		System.out.println("removeFirstOccurance and removeLastOccurance");
		l2.removeFirstOccurrence(20);
		l2.removeLastOccurrence(20);
		
		System.out.println(l2);
		System.out.println("getFirst and getLast");
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());

	}

}
