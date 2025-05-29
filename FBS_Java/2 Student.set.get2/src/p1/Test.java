package p1;

class Student{
	int rollNo;
	int marks;
	String name;
	
	
	int getRollNo() {
		return rollNo;
	}
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	int getMarks() {
		return marks;
	}
	void setMarks(int marks) {
		this.marks = marks;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
	
	void display() {
		System.out.println("student Detail = ");
		System.out.println("Roll No = "+getRollNo());
		System.out.println("Marks = "+getMarks());
		System.out.println("Name = "+getName());
	}
	
	
	
}//student class end here..


public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		
		s1.setRollNo(13);
		s1.setMarks(98);
		s1.setName("Pradip");
		
		s1.display();

//		System.out.println("Student Detail : ");
//		System.out.println("Roll No = "+ s1.getRollNo());
//		System.out.println("Marks = "+s1.getMarks());
//		System.out.println("Name = "+s1.getName());
		
	}

}
