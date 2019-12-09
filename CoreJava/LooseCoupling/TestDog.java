
public class TestDog {

	public static void main(String[] args) {
		Dog d1= new Dog();
		
		Chips c1=new Chips();
		Bingo b1=new Bingo();
		Kurkure k1=new Kurkure();
		Lays l1=new Lays();
		
		d1.feedChips(b1);
		d1.feedChips(l1);
		d1.feedChips(k1);
		d1.feedChips(c1);
	}

}
