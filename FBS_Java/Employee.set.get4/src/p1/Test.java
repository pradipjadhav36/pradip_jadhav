package p1;

class Employee{
	int id;
	double salary;
	String name;
	

	
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}


	String getName() {
		return name;
	}



	void setName(String name) {
		this.name = name;
	}



	void display() {
		System.out.println("Employee Details:");
		System.out.printf("emId = %d",getId());
		System.out.printf("\nSalary = %f",getSalary());
		System.out.println("\nName = "+getName());
	}
	
}//Class employee end here..


public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setId(123);
		e1.setSalary(50000);
		e1.setName("FBS");
		
		e1.display();

	}

}
