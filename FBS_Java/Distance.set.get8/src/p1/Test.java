package p1;


class Distance {
	double feet;
	int  inch;
	

	
	double getFeet() {
		return feet;
	}

	void setFeet(double feet) {
		this.feet = feet;
	}

	int getInch() {
		return inch;
	}


	void setInch(int inch) {
		this.inch = inch;
	}



}
public class Test {

	public static void main(String[] args) {
		Distance d1 = new Distance();
		
		d1.setFeet(0.083);
		d1.setInch(1);
		
		System.out.println("Feet = "+d1.getFeet());
		System.out.println("Inch = "+d1.getInch());
		
	}

}
