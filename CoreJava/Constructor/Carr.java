
public class Carr extends Vehicle {
	int cost=50000;
	
	void carDetails() {
		int cost=10000;
		System.out.println("local value of car is : "+cost);
		System.out.println("global value of car is : "+this.cost);
		System.out.println("super value of car is : "+super.cost);
	}
}
