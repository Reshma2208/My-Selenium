package oops;

public class movie {
	
	int year;
	String name;
	int fans;

public void display() {
	
	System.out.println(year);
	System.out.println(name);
	System.out.println(fans);
	
}	

	public static void main(String[]args) {
		
		movie mo=new movie();
		
		mo.year=2020;
		mo.name="Sushanth singh rajput---Dilbechara";
		mo.fans=1000000000;
		
		mo.display();
	}
	
}


