package p1;

class Distance{
	int feet, inch;
	
	void display() {
		System.out.printf("Distances is : %d : %d ", this.feet, this.inch);
	}
}//class distances end here..





class Test {

	public static void main(String[] args) {
		Distance d1; //References 
		
		d1 = new Distance();
		d1.feet = 5;
		d1.inch = 33;
		
		d1.display();

	}

}
