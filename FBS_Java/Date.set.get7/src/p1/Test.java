package p1;



class Date{
	int date;
	int month;
	int year;
	
	
	
	int getDate() {
		return date;
	}
	void setDate(int date) {
		this.date = date;
	}
	int getMonth() {
		return month;
	}
	void setMonth(int month) {
		this.month = month;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	
	
	void display() {
		
		System.out.printf("Date is : %d / %d / %d", getDate(),getMonth(), getYear());
		
	}
	
}// class Date end here..


public class Test {

	public static void main(String[] args) {
		Date d1 = new Date();
		
		d1.setDate(28);
		d1.setMonth(05);
		d1.setYear(2025);
		
		d1.display();

	}

}
