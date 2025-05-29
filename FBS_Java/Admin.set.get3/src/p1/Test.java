package p1;


class Admin{
	int id;
	double salary;
	double allowance;
	String Name;
	
	
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




	double getAllowance() {
		return allowance;
	}


	void setAllowance(double allowance) {
		this.allowance = allowance;
	}



	String getName() {
		return Name;
	}

	void setName(String name) {
		Name = name;
	}
	
	
//	void display() {
//    	System.out.println("Admin Details: ");
//    	System.out.println("Name =  "+getName());
//    	System.out.printf("Id = %d  \nSalary = %f  \nAllowance = %f",getId(),getSalary(), getAllowance());
//    }
	
}//admin class end here...


public class Test {

	public static void main(String[] args) {
		Admin a1 = new Admin();
		
		a1.setId(123);
		a1.setSalary(70000);
		a1.setAllowance(20000);
		a1.setName("FBS");
		
		//a1.display();
		
		System.out.println("Admin Details: ");
    	System.out.println("Name =  "+a1.getName());
    	System.out.printf("Id = %d  \nSalary = %f  \nAllowance = %f",a1.getId(),a1.getSalary(), a1.getAllowance());
		
	
	}

}
