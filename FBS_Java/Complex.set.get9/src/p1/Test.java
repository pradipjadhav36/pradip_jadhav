package p1;


class Complex {
	int real;
	int imaginary;
	
	
	int getReal() {
		return real;
	}
	void setReal(int real) {
		this.real = real;
	}
	int getImaginary() {
		return imaginary;
	}
	void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	void display() {
		System.out.printf("Complex : \n Real = %d \n Imaginary = %d",getReal(),getImaginary());
	}
	
	
}//class Complex end here..


public class Test {
	public static void main(String[] args) {
		Complex  c1 = new Complex();
		
		c1.setReal(234);
		c1.setImaginary(235);
		
		c1.display();
	}
}
