import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		EmployeeName ename=new EmployeeName();
		EmployeeAge eage=new EmployeeAge();
		EmployeeSalary esal=new EmployeeSalary();
		TreeSet<Employee> t1=new TreeSet<Employee>(esal);
		t1.add(new Employee(29, 70000, "Zesan"));
		t1.add(new Employee(24, 22000, "Biswajit"));
		t1.add(new Employee(32, 80000, "Ravish"));
		for (Employee employee : t1) {
			System.out.println(employee);
		}
	}
}
