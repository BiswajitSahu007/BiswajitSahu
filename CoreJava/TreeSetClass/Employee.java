
public class Employee implements Comparable<Employee>{
	int age;
	int salary;
	String name;
	public Employee(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
	
		
		return this.name.compareTo(o.name);
		
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
}
