package interfaceConcept;

public class TestBottle{

	public static void main(String[] args) {
		Thumsup t1=new Thumsup();
		t1.open();
		t1.drink();
		t1.juice();
		Bottle.close();//static methods with the help of class name
		Fanta f1=new Fanta();
		f1.open();
		f1.drink();
		f1.juice();
		Bottle.close();//static methods with the help of class name

	}

}
