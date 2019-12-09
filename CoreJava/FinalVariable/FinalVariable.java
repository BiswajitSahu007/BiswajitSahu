
public class FinalVariable {
//FINAL VARIABLE INITIALIZATION USING CONSTRUCTOR
	final double PI ;
	
	public FinalVariable(double PI) {
		this.PI=PI;
		
	}
	
	public FinalVariable(int a,double PI) {
		this.PI=PI;
		
	}
	void piValue() {
		System.out.println(PI);
	}
}
