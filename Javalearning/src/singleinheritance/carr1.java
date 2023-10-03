package singleinheritance;

public class carr1 extends carr {
	
	public void car2(){

		System.out.println("RANGE ROVER");
		
}
	public static void main(String[]args) {
		
		carr1 c=new carr1();
		
		c.car1();
		c.car2();
}
}