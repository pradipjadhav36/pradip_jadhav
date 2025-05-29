package p1;


class Time{
	
	int hour, min, sec;

		
	int getHour() {
		return hour;
	}


	void setHour(int hour) {
		this.hour = hour;
	}


	int getMin() {
		return min;
	}


	void setMin(int min) {
		this.min = min;
	}



	int getSec() {
		return sec;
	}


	void setSec(int sec) {
		this.sec = sec;
	}



	void display() {
		System.out.printf("Time Is = %d : %d : %d ", getHour(), getMin(), getSec());
	}
	
}// class time end here...

public  class Test {

	public static void main(String[] args) {
		
	    Time t1 = new Time();
		
		t1.setHour(3);
		t1.setMin(15);
		t1.setSec(10);
		
		t1.display();
//		System.out.println("Hour "+t1.getHour());
//		System.out.println("Min "+t1.getMin());
//		System.out.println("sec "+t1.getSec());
	}

}
