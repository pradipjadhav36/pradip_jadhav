package p1;


class Date{
	int day, month, year;
	
	void display() {
		System.out.printf("\nDate is : %d / %d / %d ", this.day,this.month,this.year);
	}
	
}// class date end here..


 class Test {

	public static void main(String[] args) {
	    Date d1; //references
		
		d1 = new Date();
	    d1.day = 30;
	    d1.month = 4;
	    d1.year = 2025;
	    
	    d1.display();

	}

}
