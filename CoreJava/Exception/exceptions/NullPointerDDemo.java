package exceptions;

public class NullPointerDDemo {

	void write() {
		String s1=null;
		try {
		System.out.println("lengthn of string is"+s1.length());
	}
	catch(NullPointerException e){
		System.out.println("exception handled");
	}
	}
	
	
	public static void main(String[] args) {
		System.out.println("started");
		NullPointerDDemo d1=new NullPointerDDemo();
		d1.write();
		System.out.println("ended");
	
	
	
	}

}
