package p1;


class SalesManager {
	int id;
	String name;
	double salary;
	int incentive_targest;
	
	
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	int getIncentive_targest() {
		return incentive_targest;
	}
	void setIncentive_targest(int incentive_targest) {
		this.incentive_targest = incentive_targest;
	}
	
	void display() {
		System.out.println("SalesManager Deatial : ");
		System.out.println("Name = "+getName());
		System.out.printf("Id = %d \nSalary = %f \nsetIncentive_targest = %d", getId(), getSalary(), getIncentive_targest());
	}
	
	
	
}//class SalesManager end here...

public class Test {

	public static void main(String[] args) {
		SalesManager s1 = new SalesManager();
		
		s1.setId(123);
		s1.setName("FBS");
		s1.setSalary(30000);
		s1.setIncentive_targest(20000);
		
		s1.display();

	}

}
