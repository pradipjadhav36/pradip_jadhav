package p1;


class Time{
	
	int hour, min, sec;

	void setHour(int hour) {
		this.hour = hour;
	}

	void setMin(int min) {
		this.min = min;
	}

	void setSec(int sec) {
		this.sec = sec;
	}
	
	void display() {
		System.out.printf("Time Is = %d : %d : %d ", this.hour, this.min, this.sec);
	}
	
}// class time end here...

 class Test {

	public static void main(String[] args) {
		
	    Time t1 = new Time();
		
		t1.setHour(3);
		t1.setMin(15);
		t1.setSec(10);
		
		t1.display();
		
	}

}
