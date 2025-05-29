package p1;


class HR{
	String name;
	int id;
	double salary;
	double commision;
	
	
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
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
	double getCommision() {
		return commision;
	}
	void setCommision(double commision) {
		this.commision = commision;
	}
	
	
	void display() {
		
		System.out.println("HR Details: ");
		System.out.println("Name = "+getName());
		System.out.printf("Id = %d \nSalary = %f \nCommision = %f", getId(), getSalary(), getCommision());
	}
	
	
	
}//class HR  end here...


public class Test {

	public static void main(String[] args) {
		
		HR h1  = new HR();
		
		h1.setName("FBS");
		h1.setId(123);
		h1.setSalary(20000);
		h1.setCommision(1000);
		
		h1.display();
		
	}

}
