class Date{
	int day, month, year;

	
}//class date end here...

 class Test {
	public static void main(String args[]) {
		Date d1; //References
		d1 = new Date();
//		System.out.println(d1);
		
		d1.day = 30;
		d1.month = 04;
		d1.year = 2025;
		
		System.out.printf("%d / %d / %d", d1.day, d1.month, d1.year);
		
		
		
		
		Date d2 ;//References
		d2 = new Date();
//		System.out.println(d2);
		
		d2.day = 26;
		d2.month = 9;
		d2.year = 2003;
		System.out.printf("\n%d / %d / %d", d2.day, d2.month, d2.year);
	}

}
