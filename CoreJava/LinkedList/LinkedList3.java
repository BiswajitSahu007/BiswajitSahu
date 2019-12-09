import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(16);
		l1.add(34);
		l1.add(78);
		System.out.println(l1);
		System.out.println("-----peek and peekFirst and peekLast------");
		System.out.println(l1.peek());//we get first value
		System.out.println(l1.peekFirst());//we get first value
		System.out.println(l1.peekLast());//we get last value
		System.out.println(l1);
		
		System.out.println("----------poll and pollFirst and pollLast-------");
		System.out.println(l1.poll());//remove the first element
		System.out.println(l1);
		System.out.println(l1.pollFirst());//remove the first element
		System.out.println(l1);
		System.out.println(l1.pollLast());//remove the last element
		System.out.println(l1);
		
		
		LinkedList l2=new LinkedList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(20);
		l2.add(40);
		System.out.println(l2);
		System.out.println("-----offer and offerFirst and offerLast-------");
		l2.offer(11);//adding elements at the end
		l2.offerFirst(89);//adding elements at first
		l2.offerLast(34);//adding elements at the end
		System.out.println(l2);
	}

}
