import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new  ArrayList<Integer>();
		System.out.println("---adding elements to an arraylist---");
		a1.add(12);
		a1.add(56);
		a1.add(34);
		System.out.println(a1);
		//size() -to get size of an arraylist
		System.out.println("size of the arraylist is : "+a1.size());
		
	
		System.out.println("check arraylist is empty or not!! : "  +a1.isEmpty());
		
		
		System.out.println("-------next using iterator--------");
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----next using ListIterator------");
		ListIterator<Integer> itr1=a1.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("----previous using ListIterator------");
		 while(itr1.hasPrevious()) {
			 System.out.println(itr1.previous());
		 }
		 
		 ArrayList<Integer> a2=new  ArrayList<Integer>();//Integer type
			a2.add(32);
			a2.add(16);
			System.out.println(a2);
			System.out.println("----remove interger type from arraylist---");
			a2.remove(new Integer(32));//as it is integer type so we have to create object
			System.out.println(a2);
			
		 ArrayList<String> a3=new  ArrayList<String>();//String type
		 	a3.add("biswajit");
			a3.add("robinhood");
			a3.add("santu");
			System.out.println(a3);
			System.out.println("---remove String type from arraylist----");
			a3.remove("santu");//as it is string type  its not necessary to create object
			System.out.println(a3);
		
	}

}
