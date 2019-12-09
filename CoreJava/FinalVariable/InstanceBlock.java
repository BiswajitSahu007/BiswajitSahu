
public class InstanceBlock {
	final int PI;
	static final double max;
	
	InstanceBlock(){
		System.out.println("cocnctructor is called");
	}
	//instance initializer block helps to initialize same class variables
	InstanceBlock(int a){
		System.out.println("cocnctructor is overloaded");
	}
	{
		System.out.println("instance block executed");
		this.PI=3000;
	}
	//static initializer block executes first
	static {
		System.out.println("static initializer block executed first");
		max=43.422;
	}
}
