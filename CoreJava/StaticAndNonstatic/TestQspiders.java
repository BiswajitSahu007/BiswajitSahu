package StaticAndNonstatic;

public class TestQspiders {

	public static void main(String[] args) {
		Qspiders BTM=new Qspiders();
		BTM.swipe();
		BTM.swipe();
		Qspiders OAR=new Qspiders();
		OAR.swipe();
		System.out.println(BTM.branchStudCount);
		System.out.println(OAR.branchStudCount);
		System.out.println(Qspiders.totalStudCount);
	}

}
