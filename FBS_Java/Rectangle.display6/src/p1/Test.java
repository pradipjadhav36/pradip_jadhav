package p1;



class Rectangle{
	int length, width;
	
	void display() {
		System.out.printf("length = %d ", this.length);
		System.out.printf("\nWidth =  %d",this.width);
	}


}//class rectangle end here...


public class Test {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle();
		R1.length = 15;
		R1.width = 20;
		
		R1.display();

	}

}
