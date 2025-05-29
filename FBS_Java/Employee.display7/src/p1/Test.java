package p1;



class Employee{
	
	int empID, age, yearsOfExperience;
	
	void display() {
		System.out.println("Employee Details :");
		System.out.printf("empID = %d", this.empID);
		System.out.printf("\nage = %d", this.age);
		System.out.printf("\nyearsOfExperience = %d", this.yearsOfExperience);
	}
	
}//employee class end here...


 class Test {

	public static void main(String[] args) {
		Employee E1;// References 
		E1 = new Employee();
		
		E1.empID = 123;
		E1.age = 28;
		E1.yearsOfExperience = 02;
		
		E1.display();
		
	}

}
