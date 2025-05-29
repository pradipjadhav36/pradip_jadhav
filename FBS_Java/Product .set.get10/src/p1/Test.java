package p1;


class Product{
	int id;
	String name;
	int quantity;
	int price;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getQuantity() {
		return quantity;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	void display() {
		System.out.println("Product: ");
		System.out.println("Name = "+getName());
		System.out.printf("Id = %d \nQuantity = %d", getId(), getQuantity());
	}
	
	
}// class Product end here...

public class Test {

	public static void main(String[] args) {
		Product  p1 = new Product();
		
		p1.setId(123);
		p1.setName("FBS");
		p1.setQuantity(5);
		
		p1.display();

	}

}
