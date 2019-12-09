
public class TestInstanceBlock {

	public static void main(String[] args) {
		InstanceBlock i1=new InstanceBlock();
		System.out.println(i1.PI);
		System.out.println("------------------------");
		InstanceBlock i2=new InstanceBlock(12);
		System.out.println(i2.PI);
		System.out.println(InstanceBlock.max);
	
		
	}

}
