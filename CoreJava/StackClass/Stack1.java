import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(12);
		s1.add(36);
		s1.add(52);
		s1.add(89);
		System.out.println(s1);
		s1.push(87);
		System.out.println(s1);
		s1.pop();//last in first out
		System.out.println(s1);
		System.out.println(s1.peek());//retrieve the top element
		System.out.println(s1);
		System.out.println(s1.search(52));
	}

}
