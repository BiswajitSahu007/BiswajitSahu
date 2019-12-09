//clone
public class Student1  implements Cloneable  {
	String studName;

	public Student1(String studName) {
		super();
		this.studName = studName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
}
