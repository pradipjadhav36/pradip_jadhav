package p1;


class Complex{
	
	int real, imaginary;
	
	void display() {
		System.out.printf("Complex is : %d %d", this.real,this.imaginary);
	}
	
}//class  complex end here...





 class Test {

	public static void main(String[] args) {
		
		Complex c1 = new Complex();
		c1.real = 25;
		c1.imaginary = 10;
		
		c1.display();
		

	}

}
