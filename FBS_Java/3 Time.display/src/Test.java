
class Time{
	
	int hours, min, sec;
	
	void display() {
		System.out.printf(" Time = %d : %d : %d", this.hours, this.min, this.sec);
	}
	

}// class time end here...



 class Test {
	 public static void main(String args[]) {
		 Time t1; //References 
		 t1 = new Time();
		 
		 t1.hours = 05;
		 t1.min = 10;
		 t1.sec = 55;
		 
		 t1.display();
		 
	 }

}
