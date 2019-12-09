
public class Employee {
	String empName;
	int empAge;
	double empSalary;
	 Employee(String name,int age,double sal) {
		empName=name;
		empAge=age;
		empSalary=sal;
	}
	 void details() {
		 System.out.println("empname is :"+empName+" ,empage is :"+empAge+" ,empSalary is :"+empSalary);
	 }
}
